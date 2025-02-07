package enums

enum class JobContractType
{
    FULL_TIME, BY_CONTRACT, PART_TIME, VOLUNTEER;

    companion object
    {
        override fun toString(): String {
            return "${super.toString()} Position"
        }
    }
}