<script>
import images from "/src/utils/data/images.json"

export default {
	data() {
		return {
			"images": images,
			texts: [
				"Frontend",
				"Android"
			],
 			currentImage: null,
			currentImageIndex: -1,
			currentText: "",
			currentTextLength: 0,
			currentTextDisplay: "",
			reverseText: false
		}
	},
	methods: {
		nextImage() {
			const lastImage = this.currentImageIndex >= (this.images.length - 1)
			this.currentImageIndex = lastImage ? 0 : (this.currentImageIndex + 1)
			this.currentImage = images[this.currentImageIndex]
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
	mounted() {
		setInterval(this.nextImage, 1000)
		setInterval(this.nextText, 350)
	}
}
</script>

<template>
	<v-container class="d-flex flex-column flex-lg-row flex-xl-row flex-xxl-row">
		<v-col>
			<v-img transition="slide-x-reverse-transition" height="500" :src="currentImage"/>
		</v-col>
		<v-col class="d-flex flex-column align-center justify-center">
			<h2 class="text-h1 w-100 d-flex justify-center justify-lg-start justify-xl-start justify-xxl-start">{{ currentTextDisplay }}</h2>
			<span class="text-h2 w-100 d-flex justify-center justify-lg-start justify-xl-start justify-xxl-start">Developer</span>
		</v-col>
	</v-container>
</template>
