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
		}
	}
}
</script>

<template>
	<v-footer class="d-flex mx-5 my-8 flex-wrap justify-center">
		<v-btn class="ma-1" size="x-large" variant="tonal" density="comfortable" rounded="xl" v-for="link in links" color="info" @click="footerActions(link)">
			<Icon :svg-path="link.icon"/>
			<span class="ml-2">{{ link.text }}</span>
		</v-btn>
	</v-footer>
</template>
