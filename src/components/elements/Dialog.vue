<script>
import EmailJsHandler from '/src/utils/functions/emailJsHandler';

export default {
	props: {
		openDialog: Boolean
	},
	data() {
		return {
			dialog: false,
			isLoading: false,
			isValid: false,
			email: "",
			name: "",
			message: "",
			nameRules: [
        		value => {
        		  if (value) return true
				
        		  return 'Name is required.'
        		},
				value => {
					const MIN_NAME_LENGTH = 3
					
        		  	if (value?.length > MIN_NAME_LENGTH) return true
				
        		  	return `Name must be longer than ${MIN_NAME_LENGTH} characters.`
        		},
			],
			emailRules: [
      		  value => {
      		    if (value) return true

      		    return 'E-mail is required.'
      		  },
      		  value => {
      		    if (/.+@.+\..+/.test(value)) return true

      		    return 'E-mail must be valid.'
      		  },
			],
			textAreaRules: [
				value => {
					const MIN_WORDS = 9

					if (value?.split(/\s.|\n.|[\.,][\s\n]./gi).length > MIN_WORDS) return true

					return `Message should include more that ${MIN_WORDS} words.`
				}
			]
		}
	},
	emits: ["open-dialog"],
	methods: {
		closeDialog() {
			this.$emit("open-dialog", false)
		},
		async sendEmail() {
			this.isLoading = true

			await EmailJsHandler.send(
				EmailJsHandler.buildJSON(
					this.email,
					this.name,
					this.message
				)
			)

			this.isLoading = false

			this.closeDialog()
		}
	},
	beforeUpdate() {
		this.dialog = this.openDialog
	}
}
</script>

<template>
	<v-row justify-center>
		<v-dialog
			v-model="dialog"
			persistent
			:overlay="false"
			max-width="1024"
			transition="dialog-transition"
		>
			<v-card>
				<v-card-title primary-title>
					<p class="text-h5">Fill the form to send me an e-mail &#x1F601;</p>
				</v-card-title>
			</v-card>
			<v-card-text>
				<v-form ref="form" v-model="isValid">
					<v-text-field
						name="from_email"
						label="Your e-mail"
						id="from_email"
						:rules="emailRules"
						v-model="email"
						required
					/>
					<v-text-field
						name="from_name"
						label="Your name"
						id="from_name"
						:rules="nameRules"
						v-model="name"
						required
					/>
					<v-textarea
						name="message"
						label="Your message"
						id="message"
						:rules="textAreaRules"
						v-model="message"
						rows="10"
						no-resize
						required
					/>
				</v-form>
			</v-card-text>
			<v-card-actions>
				<v-btn color="alert" :loading="isLoading" @click="closeDialog">Close</v-btn>
				<v-spacer/>
				<v-btn color="success" :disabled="!isValid" :loading="isLoading" @click="sendEmail">Submit</v-btn>
			</v-card-actions>
		</v-dialog>
	</v-row>
</template>
