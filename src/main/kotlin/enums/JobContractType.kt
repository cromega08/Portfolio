package enums

enum class JobContractType
{
    FULL_TIME, BY_CONTRACT, PART_TIME, VOLUNTEER;

    fun toLowercaseString() = this.toString().lowercase()
}