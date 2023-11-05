import LogHandler from "/src/utils/functions/logHandler.js";

export default class URLHandler {
	static isValidURL(string) {
		try { new URL(string); return true }
		catch (_) { return false }
	}

	static openURL(url) {
		if (this.isValidURL(url)) window.open(url, "_blank")
		else LogHandler.alertError("URL is invalid, unable to open link", new Error(`${url} is invalid and can't be open`))
	}
}