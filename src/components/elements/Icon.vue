<script>
import readXML from "/src/utils/functions/xmlHandler.js"
import LogHandler from "/src/utils/functions/logHandler"

export default {
	props: {
		svgPath: String
	},
	data() {
		return {
			svgIcon:""
		}
	},
	async beforeCreate() {
		await readXML(this.svgPath, "image/svg+xml")
			.then(result => this.svgIcon = result.querySelector("svg").outerHTML)
			.catch(error => LogHandler.alertError("Error loading icon", error))
	}
}
</script>

<template>
	<div v-html="svgIcon"/>
</template>
