<script>
import URLHandler from '/src/utils/functions/urlHandler';

export default {
	props: {
		titleData: String,
		contentData: JSON
	},
	data() {
		return {
			title: this.titleData,
			tabs: this.contentData,
			currentTab: null
		}
	},
	methods: {
		openURL(url) { URLHandler.openURL(url) },
		valueNotNull(value) { return value ?? false }
	}
}
</script>

<template>
	<v-card class="my-5 h-auto bg-blue-grey-darken-4">
		<v-card-title primary-title class="text-center justify-center align-center pa-5">
			<h3 class="font-weight-bold text-h4">{{ title }}</h3>
		</v-card-title>
		<v-divider/>
		<v-tabs v-model="currentTab" align-tabs="center" show-arrows>
			<v-tab v-for="tab in tabs" :key="tab.title" :value="tab.title">
				{{ tab.title }}
			</v-tab>
		</v-tabs>
		<v-window v-model="currentTab">
			<v-window-item v-for="tab in tabs" :key="tab.title" :value="tab.title">
				<v-container class="d-flex overflow-x-auto w-100" fluid>
					<v-col v-for="item in tab.content" class="d-flex justify-center">
						<v-card class="card h-100 d-flex flex-column bg-red-accent-4">
							<v-card-title v-if="valueNotNull(item.title)" class="text-center">
								{{ item.title }}
							</v-card-title>
							<v-card-text v-if="valueNotNull(item.content)" class="px-10 py-5" v-html="item.content"/>
							<v-card-actions v-if="valueNotNull(item.url)" class="pa-5">
								<v-spacer/>
								<v-btn outline color="primary" dark @click="openURL(item.url)">Go to</v-btn>
							</v-card-actions>
						</v-card>
					</v-col>					
				</v-container>
			</v-window-item>
		</v-window>
	</v-card>
</template>

<style scoped>
.card {
	width: min(75vw, 750px);
}
</style>