<script>
import Aside from '/src/components/elements/Aside.vue';
import Section from '/src/components/elements/Section.vue';
import Dialog from '/src/components/elements/Dialog.vue';

export default {
	components: {
		Aside,
		Section,
		Dialog
	},
	props: {
		openDialog: Boolean,
		sectionsData: JSON
	},
	data() {
		return {
			dialogOpen: this.openDialog,
			sections: this.sectionsData
		}
	},
	emits: ["open-dialog"],
	methods: {
		showDialog(value) {
			this.$emit("open-dialog", value)
		}
	},
	beforeUpdate() {
		this.dialogOpen = this.openDialog
	}
}
</script>

<template>
	<Aside />
	<Section v-for="section in sections" :title-data="section.title" :content-data="section.content"/>
	<Dialog v-if="dialogOpen" @openDialog="value => showDialog(value)"/>
</template>