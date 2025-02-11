package enums

enum class Site
{
    REMOTE, HYBRID, ON_SITE;

    fun toLowercaseString() = this.toString().lowercase()
}