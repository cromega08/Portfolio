package ui.pages.education

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.dom.*
import ui.components.SectionScrollableFlexboxWrap
import ui.elements.Time
import ui.pages.generic.Page
import utils.StringResources

class EducationPage(
    controller: EducationController, stringResources: StringResources
) : Page<EducationController>(controller, stringResources)
{
    @Composable
    override fun PageMain() =
        SectionScrollableFlexboxWrap(
            attrs = {
                classes(EducationStyleSheet.mainContainer)
            },
            dataForElements = controller.education.toList()
        ) { education ->
            Article(
                attrs = {
                    classes(EducationStyleSheet.education)
                }
            ) {
                H1 { Text(stringResources get education.title) }
                H2 {
                    Text(
                        "${stringResources get education.educationLevel.toLowercaseString()} - " +
                                (stringResources get education.site.toLowercaseString())
                    )
                }
                P {
                    Text(
                        "${stringResources get education.institute} - " +
                                (stringResources get education.location)
                    )
                }
                P {
                    Time(
                        datetime = education.startDate.toUTCString()
                    ) {
                        Text(education.startDate.toDateString())
                    }
                    Text(" - ")
                    Time(
                        datetime = education.endDate.toUTCString()
                    ) {
                        Text(education.endDate.toDateString())
                    }
                }
                Ul {
                    education.sources.forEach { source ->
                        Li {
                            A(
                                href = source,
                                attrs = {
                                    target(ATarget.Blank)
                                }
                            ) { Text(source.split("\\").last()) }
                        }
                    }
                }
            }
        }
}