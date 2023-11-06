<script>
import Main from "/src/components/layout/Main"
import Footer from '/src/components/layout/Footer.vue';

export default {
	components: {
		Main,
		Footer
	},
	data() {
		return {
			dialogOpen: false
		}
	},
	methods: {
		showDialog(value) {
			this.dialogOpen = value
		}
	}
}
</script>


<template>
  <v-app>
    <v-main>
		<Main :open-dialog="dialogOpen" @openDialog="value => showDialog(value)"/>
		<Footer @openDialog="value => showDialog(value)"/>
    </v-main>
  </v-app>
</template>
