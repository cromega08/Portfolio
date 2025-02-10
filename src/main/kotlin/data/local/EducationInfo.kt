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
        title = "Diploma in Mobile Application Development",
        educationLevel = EducationLevel.DIPLOMA,
        institute = "Universidad Autónoma de Bucaramanga",
        location = "Bucaramanga, Santander, Colombia",
        site = Site.REMOTE,
        startDate = Date(year = 2022, month = 5, day = 15),
        endDate = Date(year = 2022, month = 12, day = 19),
        sources = listOf(
            "documents\\Certificado_Mision_TIC_2022_Complete.pdf",
            "documents\\Certificado_Mision_TIC_2022_C4_Movil.pdf"
        )
    ),
    EducationInfo(
        title = "Labor Technical Degree in Web Applications Development",
        educationLevel = EducationLevel.DIPLOMA,
        institute = "Universidad Autónoma de Bucaramanga",
        location = "Bucaramanga, Santander, Colombia",
        site = Site.REMOTE,
        startDate = Date(year = 2022, month = 5, day = 15),
        endDate = Date(year = 2022, month = 12, day = 19),
        sources = listOf(
            "documents\\Certificado_Mision_TIC_2022_Complete.pdf",
            "documents\\TItulo_UNAB_Técnico_Laboral_Web.pdf"
        )
    )
)

val mediumEducation: Array<EducationInfo> = arrayOf(
    EducationInfo(
        title = "Commercial and financial operations accounting Technician",
        educationLevel = EducationLevel.ASSOCIATE,
        institute = "SENA",
        location = "Barrancabermeja, Santander, Colombia",
        site = Site.ON_SITE,
        startDate = Date(year = 2020, month = 2, day = 10),
        endDate = Date(year = 2021, month = 11, day = 22),
        sources = listOf("Titulo_SENA_Tecnico_en_Contabilizacion_de_Operaciones_Comerciales_y_Financieras.pdf")
    ),
    EducationInfo(
        title = "Technical Graduate Specialized in Business Administration",
        educationLevel = EducationLevel.HIGHSCHOOL_DEGREE,
        institute = "Diego Hernandez de Gallegos (D.H.G.)",
        location = "Barrancabermeja, Santander, Colombia",
        site = Site.ON_SITE,
        startDate = Date(year = 2020, month = 1, day = 13),
        endDate = Date(year = 2021, month = 12, day = 2),
        sources = listOf("documents\\Titulo_DHG_Tecnico_Gestion_Empresarial.pdf")
    )
)

val lowerEducation: Array<EducationInfo> = arrayOf(
    EducationInfo(
        title = "Deployment of Applications and Services in Docker Containers",
        educationLevel = EducationLevel.COURSE,
        institute = "SENA",
        location = "Espinal, Tolima, Colombia",
        site = Site.REMOTE,
        startDate = Date(year = 2023, month = 4, day = 24),
        endDate = Date(year = 2023, month = 5, day = 29),
        sources = listOf("documents\\Certificado_SENA_Despliegue_de_Aplicaciones_y_Servicios_en_Contenedores_Docker.pdf")
    ),
    EducationInfo(
        title = "Implementation of NoSQL Databases",
        educationLevel = EducationLevel.COURSE,
        institute = "SENA",
        location = "Cali, Valle del Cauca, Colombia",
        site = Site.REMOTE,
        startDate = Date(year = 2023, month = 4, day = 26),
        endDate = Date(year = 2023, month = 5, day = 29),
        sources = listOf("documents\\Certificado_SENA_Implementacion_de_Bases_de_Datos_NOSQL.pdf")
    ),
    EducationInfo(
        title = "Green Digital Skills",
        educationLevel = EducationLevel.COURSE,
        institute = "INCO Academy",
        location = "Online",
        site = Site.REMOTE,
        startDate = Date(year = 2023, month = 2, day = 6),
        endDate = Date(year = 2023, month = 3, day = 13),
        sources = listOf("documents\\Certificado_GDS.pdf")
    ),
    EducationInfo(
        title = "SQL Island Course Complete",
        educationLevel = EducationLevel.COURSE,
        institute = "SQL Island",
        location = "Online",
        site = Site.REMOTE,
        startDate = Date(year = 2023, month = 2, day = 19),
        endDate = Date(year = 2023, month = 2, day = 19),
        sources = listOf("documents\\Certificate_SQL-Island.pdf")
    ),
    EducationInfo(
        title = "Software Test Management",
        educationLevel = EducationLevel.COURSE,
        institute = "SENA",
        location = "Palmira, Valle del Cauca, Colombia",
        site = Site.REMOTE,
        startDate = Date(year = 2023, month = 3, day = 27),
        endDate = Date(year = 2023, month = 4, day = 21),
        sources = listOf("documents\\Certificado_SENA_Manejo_de_Pruebas_de_Software.pdf")
    ),
    EducationInfo(
        title = "Applets Development",
        educationLevel = EducationLevel.COURSE,
        institute = "SENA",
        location = "Pitalito, Huila, Colombia",
        site = Site.REMOTE,
        startDate = Date(year = 2023, month = 4, day = 5),
        endDate = Date(year = 2023, month = 5, day = 10),
        sources = listOf("documents\\Certificado_SENA_Desarrollo de Applets.pdf")
    ),
    EducationInfo(
        title = "Development of Digital Skills for the Construction Of Digital Content",
        educationLevel = EducationLevel.COURSE,
        institute = "SENA",
        location = "Barranquilla, Atlantico, Colombia",
        site = Site.REMOTE,
        startDate = Date(year = 2021, month = 8, day = 2),
        endDate = Date(year = 2021, month = 8, day = 31),
        sources = listOf("documents\\Certificado_SENA_Construccion_de_Contenido_Digital.pdf")
    ),
    EducationInfo(
        title = "Development of Digital Skills for Information Management",
        educationLevel = EducationLevel.COURSE,
        institute = "SENA",
        location = "Bogota D.C., Colombia",
        site = Site.REMOTE,
        startDate = Date(year = 2021, month = 7, day = 19),
        endDate = Date(year = 2021, month = 8, day = 24),
        sources = listOf("documents\\Certificado_SENA_Gestion_de_la_Informacion.pdf")
    ),
    EducationInfo(
        title = "Implementation of SIIGO Accounting Software",
        educationLevel = EducationLevel.COURSE,
        institute = "SENA",
        location = "Barrancabermeja, Santander, Colombia",
        site = Site.REMOTE,
        startDate = Date(year = 0, month = 0, day = 0),
        endDate = Date(year = 0, month = 0, day = 0),
        sources = listOf("documents\\Certificado_SENA_Implementacion_Software_Contable_Siigo.pdf")
    )
)
