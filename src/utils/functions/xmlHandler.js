export default async function readXML(xmlPath, typeOfData) {
	return new Promise((resolve, reject) => {
		const xhr = new XMLHttpRequest()

		xhr.open("GET", xmlPath, true)

		xhr.onreadystatechange = () => {
			if (
				xhr.readyState === 4 &&
				xhr.status === 200
			) resolve(
				(new DOMParser())
					.parseFromString(xhr.responseText, typeOfData)
			)
		}

		xhr.onerror = () => reject((new Error(`Failed to load ${xmlPath} XML file`)))

		xhr.send()
	})
}