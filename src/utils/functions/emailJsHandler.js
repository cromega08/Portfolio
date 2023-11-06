import emailjs from "@emailjs/browser"
import LogHandler from "/src/utils/functions/logHandler.js"

export default class EmailJsHandler {
	static #serviceId = "default_service"
	static #templateId = "template_0vue4od"
	static #emailJSKey = "dlWK_Qm9Q7U3h_Dta"

	static send(json) {
		let result = false

		emailjs
			.send(
				this.#serviceId,
				this.#templateId,
				json,
				this.#emailJSKey
			)
			.then(
				() =>
				{
					result = true
					LogHandler.alertSuccess("Email was send correctly!\n\nThanks for contacting, I'll response as soon as possible \u1F609")
				}
			)
			.catch(
				error => {
					result = false
					LogHandler.alertError(`Unable to send email \u1F630\n\n\"${error.message}\"`);
				}
			)
		
		return result
	}

	static buildJSON(email, name, message) {
		return {
			from_email: email,
			from_name: name,
			message: message
		}
	}
}