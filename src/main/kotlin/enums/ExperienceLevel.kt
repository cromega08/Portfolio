package enums

enum class ExperienceLevel
{
    JUNIOR, SEMI_SENIOR, SENIOR, NO_EXPERIENCE;

    fun toLowercaseString() = this.toString().lowercase()
}