<script>
import Dialog from '/src/components/elements/Dialog.vue';

export default {
	components: {
		Dialog
	},
	props: {
		openDialog: Boolean
	},
	data() {
		return {
			dialogOpen: this.opensDialog
		}
	},
	emits: ["open-dialog"],
	methods: {
		showDialog(value) {
			this.$emit("open-dialog", value)
		}
	},
	beforeUpdate() {
		this.dialogOpen = this.openDialog ?? false
	}
}
</script>

<template>
	<Dialog :open-dialog="dialogOpen" @openDialog="value => showDialog(value)"/>
</template>