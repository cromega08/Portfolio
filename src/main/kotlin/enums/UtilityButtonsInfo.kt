package enums

enum class UtilityButtonsInfo(
    val text: String,
    val icon: String,
    val href: String
) {
    LINKEDIN(text = "CJRG's LinkedIn", icon = "icons\\linkedin.svg", href = "https://www.linkedin.com/in/crjrg/"),
    GITHUB(text = "Cromega's Github", icon = "icons\\github.svg", href = "https://www.linkedin.com/in/crjrg/"),
    EMAIL(text = "cr.jrg08@gmail.com e-mail", icon = "icons\\email.svg", href = "mailto:cr.jrg08@gmail.com"),
    CV(text = "Cristian's CV", icon = "icons\\cv.svg", href = "documents\\cv_cjrg.pdf"),
    CREDITS(text = "Resources Credits", icon = "icons\\credits.svg", href = "documents\\credits.md");

    companion object {
        fun asList() = listOf(LINKEDIN, GITHUB, EMAIL, CV, CREDITS)
    }
}