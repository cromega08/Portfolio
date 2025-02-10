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
        position = "Android Engineer",
        contractType = JobContractType.FULL_TIME,
        experienceLevel = ExperienceLevel.JUNIOR,
        company = "Kadree Tech",
        location = "Bogota D.C., Colombia",
        site = Site.REMOTE,
        startDate = Date(year = 2023, month = 0, day = 15),
        endDate = Date(year = 2024, month = 9, day = 4),
        description = "Development of applications for third-party clients, as a developer from a company with an \"Outsourcing\" business model",
        activities =
            listOf(
                "Development of Android applications for enterprise projects" to "Spearheaded the development of cutting-edge Android applications for enterprise projects, ensuring seamless integration with existing systems and delivering exceptional user experiences",
                "End-to-end involvement in project lifecycle" to "Led activities of analysis, design, development, testing, and deployment of functionalapplications, ensuring high-quality deliverables and meeting project milestones",
                "Optimization and maintenance of software" to "Collaborated with cross-functional teams to optimize and maintain previously developed software in multiple projects, ensuring smooth operations and minimizing technical disruptions"
            ),
        source = "documents\\kadree_tech_certificate.pdf"
    ),
    JobExperienceInfo(
        position = "Android Developer",
        contractType = JobContractType.VOLUNTEER,
        experienceLevel = ExperienceLevel.NO_EXPERIENCE,
        company = "Earth Hero",
        location = "USA",
        site = Site.REMOTE,
        startDate = Date(year = 2023, month = 3, day = 15),
        endDate = Date(year = 2024, month = 9, day = 20),
        description = "Maintenance and development of features for existing educative Android application, focused on teaching about sustainability",
        activities =
            listOf(
                "Android Development expertise" to "Demonstrated expert knowledge in Android Development as a volunteer developer, delivering topnotch solutions",
                "Independent & collaborative work-style" to "Exhibited capability to work independently while still functioning collaboratively in a team environment, liaising with stakeholders and other team members to ensure project success",
                "Flexibility in availability" to "Consistently demonstrated flexibility in availability, working across night, weekend, and holiday shifts as required to ensure project delivery and timely communication with other teams"
            ),
        source = "documents\\earth_hero_certificate.pdf"
    ),
    JobExperienceInfo(
        position = "Spanish Translator",
        contractType = JobContractType.VOLUNTEER,
        experienceLevel = ExperienceLevel.NO_EXPERIENCE,
        company = "Earth Hero",
        location = "USA",
        site = Site.REMOTE,
        startDate = Date(year = 2023, month = 3, day = 15),
        endDate = Date(year = 2024, month = 9, day = 20),
        description = "Translation of existing text resources of educative application",
        activities =
            listOf(
                "Proficiency in languages" to "Practical knowledge about English language and native Spanish",
                "Independent & collaborative work-style" to "Exhibited capability to work independently while still functioning collaboratively in a team environment, liaising with stakeholders and other team members to ensure project success",
                "Flexibility in availability" to "Consistently demonstrated flexibility in availability, working across night, weekend, and holiday shifts as required to ensure project delivery and timely communication with other teams"
            ),
        source = "documents\\earth_hero_certificate.pdf"
    )
)
