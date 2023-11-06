import LogHandler from "/src/utils/functions/logHandler.js";

export default class URLHandler {
	static isValidURL(string) {
		try { new URL(string); return true }
		catch (_) { return false }
	}

	static openURL(url) {
		window.open(url, "_blank")
	}
}