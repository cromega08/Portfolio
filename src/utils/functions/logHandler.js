import Utils from "./utils"

export default class LogHandler {
	static alertError(userFeedback, error) {
		this.#alertText(userFeedback, "Error", error, console.error)
	}

	static alertSuccess(userFeedback, message) { this.#alertText(userFeedback, "Success", message, console.log) }
	
	static #alertText(userFeedback, prefix, text, logFunction) {
		if (Utils.notNull(userFeedback)) alert(`${prefix}:\n\n${userFeedback}`)
		if (Utils.notNull(text)) logFunction(text)
	} 
}