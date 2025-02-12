package enums

enum class UtilityButtonsInfo(
    val text: String,
    val icon: String,
    val href: String
) {
    LINKEDIN(text = "CJRG LinkedIn", icon = "icons\\linkedin.svg", href = "https://www.linkedin.com/in/crjrg/"),
    GITHUB(text = "Cromega Github", icon = "icons\\github.svg", href = "https://github.com/Cromega08"),
    EMAIL(text = "cr.jrg08@gmail.com e-mail", icon = "icons\\email.svg", href = "mailto:cr.jrg08@gmail.com"),
    CV(text = "Cristian CV", icon = "icons\\cv.svg", href = "documents\\cv_cjrg.pdf"),
    CREDITS(text = "Resources Credits", icon = "icons\\credits.svg", href = "documents\\credits.md"),
    ENGLISH(text = "ENGLISH", icon = "icons\\english.svg", href = ""),
    SPANISH(text = "SPANISH", icon = "icons\\spanish.svg", href = "");
}