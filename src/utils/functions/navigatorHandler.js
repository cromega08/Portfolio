import LogHandler from "/src/utils/functions/logHandler.js"

export default class NavigatorHandler {
	static async copyToClipboard(text) {
		const SUCCESS = `\"${text}\" copy to clipboard`

		await navigator.clipboard.writeText(text)
				.then(() => LogHandler.alertSuccess(SUCCESS, SUCCESS))
				.catch(error => LogHandler.alertError(`Error copying \"${text}\" to clipboard`, error))
	}
}