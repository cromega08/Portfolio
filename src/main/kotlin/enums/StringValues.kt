package enums

enum class StringValues(
    val english: String,
    val spanish: String
) {
    CRISTIAN_PERSONAL_PHOTO("Cristian Personal Photo", "Foto Personal de Cristian"),
    CROMEGA_LOGO_IMAGE("Cromega's Logo Image", "Logo de Cromega"),
    HELLO_I_AM("Hello, I am", "Hola, soy"),
    DEVELOPER("Developer", "Developer"),
    ANDROID_ENGINEER("Android Engineer", "Android Engineer"),
    KADREE_TECH("Kadree Tech", "Kadree Tech"),
    BOGOTA_DC_COLOMBIA("Bogota D.C., Colombia", "Bogota D.C., Colombia"),
    ANDROID_ENGINEER_DESCRIPTION(
        "Development of applications for third-party clients, as a developer from a company with an \"Outsourcing\" business model",
        "Desarrollo de aplicaciones para \"terceros\", como desarrollador para una empresa con un modelo de negocios \"Outsourcing\""
    ),
    ENTERPRISE_ANDROID_DEVELOPMENT_KEY(
        "Development of Android applications for enterprise projects",
        "Desarrollo de aplicaciones Android para projectos empresariales"
    ),
    ENTERPRISE_ANDROID_DEVELOPMENT_DESCRIPTION(
        "Spearheaded the development of cutting-edge Android applications for enterprise projects, ensuring seamless integration with existing systems and delivering exceptional user experiences",
        "Lidere el desarrollo de aplicaciones Android modernas para proyectos empresariales, velando por la integracion con sistemas existentes y entregando experiencias de usuario optimas"
    ),
    END_TO_END_INVOLVEMENT_KEY(
        "End-to-end involvement in project lifecycle",
        "Participacion en el ciclo de vida del proyecto"
    ),
    END_TO_END_INVOLVEMENT_DESCRIPTION(
        "Led activities of analysis, design, development, testing, and deployment of functional applications, ensuring high-quality deliverables and meeting project milestones",
        "Lidere actividades de analisis, diseño, desarrollo, testing, y despliegue de aplicaciones funcionales, velando por entregas de alta calidad y cumpliendo con los fundamentos del proyecto"
    ),
    OPTIMIZATION_AND_MAINTENANCE_KEY(
        "Optimization and maintenance of software",
        "Mantenimiento y optimizacion de software"
    ),
    OPTIMIZATION_AND_MAINTENANCE_DESCRIPTION(
        "Collaborated with cross-functional teams to optimize and maintain previously developed software in multiple sub-projects, ensuring smooth operations and minimizing technical disruptions",
        "Colaboracion con equipos multifuncionales para optimizar y mantener codigo legado en distintos sub-proyectos, velando por la operacion y la minimizacion de problemas tecnicos"
    ),
    ANDROID_DEVELOPER(
        "Android Developer",
        "Android Developer"
    ),
    EARTH_HERO(
        "Earth Hero",
        "Earth Hero"
    ),
    USA(
        "USA",
        "USA"
    ),
    ANDROID_DEVELOPER_DESCRIPTION(
    "Maintenance and development of features for existing educative Android application, focused on teaching about sustainability",
    "Mantenimiento y desarrollo de funcionalidades para una palicacion educativa existente, centrada en enseñar sobre sostenibilidad"
    ),
    ANDROID_DEVELOPMENT_EXPERTISE_KEY(
        "Android development expertise",
        "Competencia en desarrollo Android"
    ),
    ANDROID_DEVELOPMENT_EXPERTISE_DESCRIPTION(
        "Demonstrated expert knowledge in Android Development as a volunteer developer, delivering topnotch solutions",
        "Demostre conocimientos especializados en desarrollo Android como desarrollador voluntario, entregando doluciones actualizadas"
    ),
    INDEPENDENT_AND_COLLABORATIVE_KEY(
        "Independent & collaborative work-style",
        "Estilo de trabajo independiente y colaborativo"
    ),
    INDEPENDENT_AND_COLLABORATIVE_DESCRIPTION(
        "Exhibited capability to work independently while still functioning collaboratively in a team environment, liaising with stakeholders and other team members to ensure project success",
        "Capacidad de trabajar independientemente, mientras desempeñaba mis actividades colaborativamente en un ambiente de trabajo junto con \"Stakeholders\" y otros miembros del equipo"
    ),
    FLEXIBILITY_IN_AVAILABILITY_KEY(
        "Flexibility in availability",
        "Flexibilidad de horario"
    ),
    FLEXIBILITY_IN_AVAILABILITY_DESCRIPTION(
        "Consistently demonstrated flexibility in availability, working across night, weekend, and holiday shifts as required to ensure project delivery and timely communication with other teams",
        "Presente disponibilidad en la flexibilidad del horario, pudiendo desarrollar mis actividades de noche, fines de semana, y dias festivos segun requiera el proyecto"
    ),
    SPANISH_TRANSLATOR(
        "Spanish Translator",
        "Traductor de Español"
    ),
    SPANISH_TRANSLATOR_DESCRIPTION(
        "Translation of existing text resources of educative application",
        "Traduccion de recursos de texto existentes para aplicacion educativa"
    ),
    PROFICIENCY_IN_LANGUAGES_KEY(
        "Proficency in languages",
        "Competencia en lenguas"
    ),
    PROFICIENCY_IN_LANGUAGES_DESCRIPTION(
        "Practical knowledge about English language and native Spanish",
        "Conocimientos practicos sobre la lengua inglesa y nativo en el lenguaje español"
    ),
    FULL_TIME(
        "Full Time",
        "Tiempo Completo"
    ),
    BY_CONTRACT(
        "By Contract",
        "Por Contrato"
    ),
    PART_TIME(
        "Part Time",
        "Medio Tiempo"
    ),
    VOLUNTEER(
        "Volunteer",
        "Voluntario"
    ),
    JUNIOR(
        "Junior",
        "Junior"
    ),
    SEMI_SENIOR(
        "Semi-Senior",
        "Semi-Senior"
    ),
    SENIOR(
        "Senior",
        "Senior"
    ),
    NO_EXPERIENCE(
        "No Experience",
        "Sin Experiencia"
    ),
    REMOTE(
        "Remote",
        "Remoto"
    ),
    HYBRID(
        "Hybrid",
        "Hibrido"
    ),
    ON_SITE(
        "ON_SITE",
        "Presencial"
    );

    companion object {
        fun toMap(): Map<String, StringValues> =
            mutableMapOf<String, StringValues>().apply {
                StringValues.entries.forEach { stringValue ->
                    this[stringValue.toString().lowercase()] = stringValue
                }
            }
    }
}