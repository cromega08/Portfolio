<script>
import Icon from '/src/components/elements/Icon.vue';

export default {
	components: {
		Icon
	},
	props: {
		titlesData: JSON,
		currentSection: String
	},
	data() {
		return {
			drawer: false,
			logo: "/src/assets/logo.svg",
			titles: [],
			texts: [
				"Cromega",
				"Cristian"
			],
			currentText: "",
			currentTextLength: 0,
			currentTextDisplay: ""
		}
	},
	emits: ["select-section"],
	methods: {
		isCurrent(title) {
			const current = this.currentSection === title

			return current ? "tonal" : "text"
		},
		selectSection(section) {
			this.$emit("select-section", section)
		},
		invertDrawer() {
			this.drawer = !this.drawer
		},
		nextText() {
			const lastCharacter = this.currentTextLength >= (this.currentText.length)
			this.currentText = lastCharacter ? this.changeText() : this.currentText
			this.currentTextLength = lastCharacter ? 1 : (this.currentTextLength + 1)
			this.currentTextDisplay = this.currentText.substring(0, this.currentTextLength)
		},
		changeText() {
			return this.currentText === this.texts[0] ? this.texts[1] : this.texts[0]
		}
	},
	computed: {
		isPortrait() {
			return this.$vuetify.display.mobile
		}
	},
	watch: {
		group() {
			this.drawer = false
		}
	},
	created() {
		this.titles = this.titlesData
	},
	mounted() {
		setInterval(this.nextText, 450)
	}
}
</script>

<template>
	<header class="w-100 px-3 py-5 d-flex bg-grey-darken-4 sky">
		<Icon class="mx-5" :svgPath="logo" />
		<h1 class="text-h4">{{ currentTextDisplay }}</h1>
		<v-spacer></v-spacer>
		<!-- <v-tabs v-if="!isPortrait" fixed-tabs>
			<v-tab v-for="title in titles" @click="selectSection(title)">{{ title }}</v-tab>
		</v-tabs>
		<v-btn icon="mdi-menu" class="bg-red-accent-4" v-if="isPortrait" @click="invertDrawer()" />
		<v-navigation-drawer v-model="drawer" location="bottom" temporary>
			<v-list lines="one">
				<v-list-item :key="close" :title="close" @click="invertDrawer()">
					<template v-slot:prepend>
						<v-icon icon="mdi-close"/>
					</template>
					<v-list-item-title v-text="'Close'" />
				</v-list-item>
				<v-list-item v-for="title in titles" :key="title" :title="title" @click="selectSection(title)" />
			</v-list>
		</v-navigation-drawer> -->
	</header>
</template>

<style scoped>
h1 {
	display: flex;
	align-items: center;
}

.sky {
	position: fixed;
	top: 0;
	transform-origin: top;
	z-index: 100;
}
</style>
