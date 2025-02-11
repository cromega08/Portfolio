package ui.pages.experience

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import ui.elements.Details
import ui.elements.Summary
import ui.elements.Time
import ui.pages.generic.GlobalStyleSheet
import ui.pages.generic.Page
import utils.StringResources

class ExperiencesPage(
    controller: ExperiencesController, stringResources: StringResources
) : Page<ExperiencesController>(controller, stringResources)
{
    @Composable
    override fun PageMain() =
        Section(
            attrs = {
                classes(GlobalStyleSheet.paddingMedium, ExperienceStyleSheet.mainContainer)
            }
        ) {
            Ul(
                attrs = {
                    classes(ExperienceStyleSheet.timeline)
                }
            ) {
                controller.experiences.forEach { jobExperience ->
                    Li(
                        attrs = {
                            classes(GlobalStyleSheet.paddingMedium, GlobalStyleSheet.flexboxCenteredDefault, GlobalStyleSheet.flexboxColumn, ExperienceStyleSheet.experience)
                            style {
                                alignItems(AlignItems.Start)
                            }
                        }
                    ) {
                        H1 { Text(stringResources get jobExperience.position) }
                        H2 {
                            Text(
                            "${stringResources get jobExperience.experienceLevel.toLowercaseString()} - " +
                                "${stringResources get jobExperience.contractType.toLowercaseString()} - " +
                                    (stringResources get jobExperience.site.toLowercaseString())
                            )
                        }
                        H3 {
                            Text(
                                "${stringResources get jobExperience.company} - " +
                                        (stringResources get jobExperience.location)
                            )
                        }
                        P {
                            Time(
                                datetime = jobExperience.startDate.toUTCString()
                            ) {
                                Text(jobExperience.startDate.toDateString())
                            }
                            Text(" - ")
                            Time(
                                datetime = jobExperience.endDate.toUTCString()
                            ){
                                Text(jobExperience.endDate.toDateString())
                            }
                        }


                        Details {
                            Summary {
                                Text("${stringResources get jobExperience.description}.")
                            }
                            Ul {
                                jobExperience.activities.forEach { activity ->
                                    Li(
                                        attrs = {
                                            style {
                                                margin(2.vmin)
                                                gap(2.vmin)
                                            }
                                        }
                                    ) {
                                        Text("${stringResources get activity.first}: ${stringResources get activity.second}.")
                                    }
                                }
                            }
                        }

                        A(
                            href = jobExperience.source,
                            attrs = {
                                target(ATarget.Blank)
                            }
                        ) {
                            Text("${stringResources get jobExperience.position} Certificate")
                        }
                    }
                }
            }
        }
}