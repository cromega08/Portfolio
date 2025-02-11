package data.local

import enums.ExperienceLevel
import enums.JobContractType
import enums.Site
import kotlin.js.Date

data class JobExperienceInfo(
    val position: String,
    val contractType: JobContractType,
    val experienceLevel: ExperienceLevel,
    val company: String,
    val location: String,
    val site: Site,
    val startDate: Date,
    val endDate: Date,
    val description: String,
    val activities: List<Pair<String, String>>,
    val source: String
)

val jobExperiences: Array<JobExperienceInfo> = arrayOf(
    JobExperienceInfo(
        position = "android_engineer",
        contractType = JobContractType.FULL_TIME,
        experienceLevel = ExperienceLevel.JUNIOR,
        company = "kadree_tech",
        location = "bogota_dc_colombia",
        site = Site.REMOTE,
        startDate = Date(year = 2023, month = 0, day = 15),
        endDate = Date(year = 2024, month = 9, day = 4),
        description = "android_engineer_description",
        activities =
            listOf(
                "enterprise_android_development_key" to "enterprise_android_development_description",
                "end_to_end_involvement_key" to "end_to_end_involvement_description",
                "optimization_and_maintenance_key" to "optimization_and_maintenance_description"
            ),
        source = "documents\\kadree_tech_certificate.pdf"
    ),
    JobExperienceInfo(
        position = "android_developer",
        contractType = JobContractType.VOLUNTEER,
        experienceLevel = ExperienceLevel.NO_EXPERIENCE,
        company = "earth_hero",
        location = "usa",
        site = Site.REMOTE,
        startDate = Date(year = 2023, month = 3, day = 15),
        endDate = Date(year = 2024, month = 9, day = 20),
        description = "android_developer_description",
        activities =
            listOf(
                "android_development_expertise_key" to "android_development_expertise_description",
                "independent_and_collaborative_key" to "independent_and_collaborative_description",
                "flexibility_in_availability_key" to "flexibility_in_availability_description"
            ),
        source = "documents\\earth_hero_certificate.pdf"
    ),
    JobExperienceInfo(
        position = "spanish_translator",
        contractType = JobContractType.VOLUNTEER,
        experienceLevel = ExperienceLevel.NO_EXPERIENCE,
        company = "earth_hero",
        location = "usa",
        site = Site.REMOTE,
        startDate = Date(year = 2023, month = 3, day = 15),
        endDate = Date(year = 2024, month = 9, day = 20),
        description = "spanish_translator_description",
        activities =
            listOf(
                "proficiency_in_languages_key" to "proficiency_in_languages_description",
                "independent_and_collaborative_key" to "independent_and_collaborative_description",
                "flexibility_in_availability_key" to "flexibility_in_availability_description"
            ),
        source = "documents\\earth_hero_certificate.pdf"
    )
)
