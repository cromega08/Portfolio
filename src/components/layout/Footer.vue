<script>
import Icon from "/src/components/elements/Icon.vue"
import URLHandler from "/src/utils/functions/urlHandler.js"
import NavigatorHandler from "/src/utils/functions/navigatorHandler"
import VALUE_TYPES from "/src/utils/enums/valueTypes.js"
import links from "/src/utils/data/links.json"

export default {
	components: {
		Icon
	},
	data() {
		return {
			drawer: false,
			"links": links
		}
	},
	emits: ["openDialog"],
	methods: {
		footerActions(link) {
			switch (link.typeOfValue) {
				case VALUE_TYPES.URL: URLHandler.openURL(link.value); break;
				case VALUE_TYPES.EMAIL: this.$emit("openDialog", true); break;
				case VALUE_TYPES.CLIPBOARD: NavigatorHandler.copyToClipboard(link.value); break;
			}

			this.drawer = false
		},
		invertDrawer() {
			this.drawer = !this.drawer
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
}
</script>

<template>
	<v-footer class="w-100 py-5 d-flex flex-wrap justify-center align-self-end bg-grey-darken-4 land">
		<v-btn v-if="!isPortrait" class="ma-1 bg-red-accent-4" size="large" variant="tonal" density="comfortable" rounded="xl"
			v-for="link in links" @click="footerActions(link)">
			<Icon :svg-path="link.icon" />
			<span class="ml-1 text-button">{{ link.text }}</span>
		</v-btn>
		<v-btn icon="mdi-menu" class="bg-red-accent-4" v-if="isPortrait" @click="invertDrawer()" />
		<v-navigation-drawer class="bg-blue-grey-darken-4 h-75" v-model="drawer" location="bottom" temporary>
			<v-list lines="one">
				<v-list-item class="bg-red-accent-4" :key="close" :title="close" @click="invertDrawer()">
					<template v-slot:prepend>
						<v-icon icon="mdi-close"/>
					</template>
					<v-list-item-title v-text="'Close'" />
				</v-list-item>
				<v-list-item class="bg-red-accent-4 my-2" v-for="link in links" :key="title" :title="title" @click="footerActions(link)">
					<template v-slot:prepend>
						<Icon :svg-path="link.icon" />
					</template>
					<v-list-item-title class="mx-8" v-text="link.text" />
				</v-list-item>
			</v-list>
		</v-navigation-drawer>
	</v-footer>
</template>

<style scoped>
.land {
	height: 15vh;
	position: fixed;
	bottom: 0;
	transform-origin: bottom;
}
</style>
