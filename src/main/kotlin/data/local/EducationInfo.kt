package data.local

import enums.EducationLevel
import enums.Site
import kotlin.js.Date

data class EducationInfo(
    val title: String,
    val educationLevel: EducationLevel,
    val institute: String,
    val location: String,
    val site: Site,
    val startDate: Date,
    val endDate: Date,
    val sources: List<String>
)

val higherEducation: Array<EducationInfo> = arrayOf(
    EducationInfo(
        title = "diploma_in_mobile_application_development",
        educationLevel = EducationLevel.DIPLOMA,
        institute = "autonomous_university_of_bucaramanga",
        location = "bucaramanga_santander_colombia",
        site = Site.REMOTE,
        startDate = Date(year = 2022, month = 4, day = 15),
        endDate = Date(year = 2022, month = 11, day = 19),
        sources = listOf(
            "documents\\Certificado_Mision_TIC_2022_Complete.pdf",
            "documents\\Certificado_Mision_TIC_2022_C4_Movil.pdf"
        )
    ),
    EducationInfo(
        title = "labor_technical_degree_web_development",
        educationLevel = EducationLevel.DIPLOMA,
        institute = "autonomous_university_of_bucaramanga",
        location = "bucaramanga_santander_colombia",
        site = Site.REMOTE,
        startDate = Date(year = 2022, month = 4, day = 15),
        endDate = Date(year = 2022, month = 11, day = 19),
        sources = listOf(
            "documents\\Certificado_Mision_TIC_2022_Complete.pdf",
            "documents\\TItulo_UNAB_Técnico_Laboral_Web.pdf"
        )
    )
)

val mediumEducation: Array<EducationInfo> = arrayOf(
    EducationInfo(
        title = "commercial_and_financial_operations_technician",
        educationLevel = EducationLevel.ASSOCIATE,
        institute = "sena",
        location = "barrancabermeja_santander_colombia",
        site = Site.ON_SITE,
        startDate = Date(year = 2020, month = 1, day = 10),
        endDate = Date(year = 2021, month = 10, day = 22),
        sources = listOf("Titulo_SENA_Tecnico_en_Contabilizacion_de_Operaciones_Comerciales_y_Financieras.pdf")
    ),
    EducationInfo(
        title = "technical_in_business_administration",
        educationLevel = EducationLevel.HIGHSCHOOL_DEGREE,
        institute = "dhg",
        location = "barrancabermeja_santander_colombia",
        site = Site.ON_SITE,
        startDate = Date(year = 2020, month = 0, day = 13),
        endDate = Date(year = 2021, month = 11, day = 2),
        sources = listOf("documents\\Titulo_DHG_Tecnico_Gestion_Empresarial.pdf")
    )
)

val lowerEducation: Array<EducationInfo> = arrayOf(
    EducationInfo(
        title = "deployment_of_docker_containers",
        educationLevel = EducationLevel.COURSE,
        institute = "sena",
        location = "espinal_tolima_colombia",
        site = Site.REMOTE,
        startDate = Date(year = 2023, month = 3, day = 24),
        endDate = Date(year = 2023, month = 4, day = 29),
        sources = listOf("documents\\Certificado_SENA_Despliegue_de_Aplicaciones_y_Servicios_en_Contenedores_Docker.pdf")
    ),
    EducationInfo(
        title = "implementation_of_nosql_database",
        educationLevel = EducationLevel.COURSE,
        institute = "sena",
        location = "cali_vdc_colombia",
        site = Site.REMOTE,
        startDate = Date(year = 2023, month = 3, day = 26),
        endDate = Date(year = 2023, month = 4, day = 29),
        sources = listOf("documents\\Certificado_SENA_Implementacion_de_Bases_de_Datos_NOSQL.pdf")
    ),
    EducationInfo(
        title = "green_digital_skills",
        educationLevel = EducationLevel.COURSE,
        institute = "inco_academy",
        location = "online",
        site = Site.REMOTE,
        startDate = Date(year = 2023, month = 1, day = 6),
        endDate = Date(year = 2023, month = 2, day = 13),
        sources = listOf("documents\\Certificado_GDS.pdf")
    ),
    EducationInfo(
        title = "sql_island_course_complete",
        educationLevel = EducationLevel.COURSE,
        institute = "sql_island",
        location = "online",
        site = Site.REMOTE,
        startDate = Date(year = 2023, month = 1, day = 19),
        endDate = Date(year = 2023, month = 1, day = 19),
        sources = listOf("documents\\Certificate_SQL-Island.pdf")
    ),
    EducationInfo(
        title = "software_test_management",
        educationLevel = EducationLevel.COURSE,
        institute = "sena",
        location = "palmira_vdc_colombia",
        site = Site.REMOTE,
        startDate = Date(year = 2023, month = 2, day = 27),
        endDate = Date(year = 2023, month = 3, day = 21),
        sources = listOf("documents\\Certificado_SENA_Manejo_de_Pruebas_de_Software.pdf")
    ),
    EducationInfo(
        title = "applets_development",
        educationLevel = EducationLevel.COURSE,
        institute = "sena",
        location = "pitalito_huila_colombia",
        site = Site.REMOTE,
        startDate = Date(year = 2023, month = 3, day = 5),
        endDate = Date(year = 2023, month = 4, day = 10),
        sources = listOf("documents\\Certificado_SENA_Desarrollo de Applets.pdf")
    ),
    EducationInfo(
        title = "construction_of_digital_content_skills",
        educationLevel = EducationLevel.COURSE,
        institute = "sena",
        location = "barranquilla_atlantico_colombia",
        site = Site.REMOTE,
        startDate = Date(year = 2021, month = 7, day = 2),
        endDate = Date(year = 2021, month = 7, day = 31),
        sources = listOf("documents\\Certificado_SENA_Construccion_de_Contenido_Digital.pdf")
    ),
    EducationInfo(
        title = "information_management_skills",
        educationLevel = EducationLevel.COURSE,
        institute = "sena",
        location = "bogota_dc_colombia",
        site = Site.REMOTE,
        startDate = Date(year = 2021, month = 6, day = 19),
        endDate = Date(year = 2021, month = 7, day = 24),
        sources = listOf("documents\\Certificado_SENA_Gestion_de_la_Informacion.pdf")
    ),
    EducationInfo(
        title = "siigo_software_implementation",
        educationLevel = EducationLevel.COURSE,
        institute = "sena",
        location = "barrancabermeja_santander_colombia",
        site = Site.REMOTE,
        startDate = Date(year = 2021, month = 5, day = 10),
        endDate = Date(year = 2021, month = 6, day = 14),
        sources = listOf("documents\\Certificado_SENA_Implementacion_Software_Contable_Siigo.pdf")
    )
)
