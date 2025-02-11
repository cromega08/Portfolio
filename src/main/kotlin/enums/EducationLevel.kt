package enums

enum class EducationLevel
{
    BACHELOR, ASSOCIATE, HIGHSCHOOL_DEGREE, DIPLOMA, COURSE;

    fun toLowercaseString() = this.toString().lowercase()
}