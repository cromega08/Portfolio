package enums

enum class StringValues(
    val spanish: String,
    val english: String
) {
    CRISTIAN_PERSONAL_PHOTO("Cristian Personal Photo", "Foto Personal de Cristian"),
    CROMEGA_LOGO_IMAGE("Cromega's Logo Image", "Logo de Cromega"),
    HELLO_I_AM("Hello, I am", "Hola, soy"),
    DEVELOPER("Developer", "Developer");

    companion object {
        fun toMap(): Map<String, StringValues> =
            mutableMapOf<String, StringValues>().apply {
                StringValues.entries.forEach { stringValue ->
                    this[stringValue.toString().lowercase()] = stringValue
                }
            }
    }
}