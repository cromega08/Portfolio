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
			logo: "/src/assets/logo.svg",
			titles: []
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
		}
	},
	created() {
		this.titles = this.titlesData
	}
}
</script>

<template>
	<header class="px-7 py-5 d-flex">
		<Icon class="mx-5" :svgPath="logo"/>
		<h1 class="text-h4">Cromega</h1>
		<v-spacer></v-spacer>
		<div class="d-flex align-center">
			<v-btn class="px-4 h-100" v-for="title in titles" :variant="isCurrent(title)" value="title" @click="selectSection(title)">{{ title }}</v-btn>
		</div>
	</header>
</template>

<style scoped>
h1 {
	display: flex;
	align-items: center;
}

</style>
