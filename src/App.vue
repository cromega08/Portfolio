<script>
import Header from "/src/components/layout/Header.vue"
import Main from "/src/components/layout/Main"
import Footer from '/src/components/layout/Footer.vue'
import sections from "/src/utils/data/sections.json"

export default {
	components: {
		Header,
		Main,
		Footer
	},
	data() {
		return {
			dialogOpen: false,
			"sections": sections,
			sectionsTitles: [],
			currentSection: "Who am I?"
		}
	},
	methods: {
		showDialog(value) { this.dialogOpen = value },
		selectSection(section) { this.currentSection = section; console.log(this.currentSection) }
	},
	created() {
		this.sectionsTitles = sections.map(section => section.title)
	}
}
</script>


<template>
	<v-app>
	    <v-main class="h-100 w-100 py-16 overflow-hidden mx-auto d-flex flex-column">
			<Header :current-section="currentSection" :titles-data="sectionsTitles" @selectSection="section => selectSection(section)"/>
			<Main class="overflow-y-auto" :sections-data="sections" :open-dialog="dialogOpen" @openDialog="value => showDialog(value)"/>
			<Footer @openDialog="value => showDialog(value)"/>
	    </v-main>
	</v-app>
</template>
