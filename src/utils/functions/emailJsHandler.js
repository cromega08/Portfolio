import emailjs from "@emailjs/browser"
import LogHandler from "/src/utils/functions/logHandler.js"

export default class EmailJsHandler {
	static #serviceId = "default_service"
	static #templateId = "template_0vue4od"
	static #emailJSKey = "dlWK_Qm9Q7U3h_Dta"

	static send(json) {
		emailjs
			.sendForm(
				this.#serviceId,
				this.#templateId,
				json,
				this.#emailJSKey
			)
			.then(() => { LogHandler.alertSuccess("Email was send correctly!\n\nThanks for contacting, I'll response as soon as possible \u1F609") })
			.catch(error => { LogHandler.alertError(`Unable to send email \u1F630\n\n\"${error.message}\"`);  })
	}
}