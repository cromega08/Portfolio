package ui.pages.experience

import androidx.compose.runtime.Composable
import data.jobExperiences
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import ui.elements.Details
import ui.elements.Summary
import ui.elements.Time
import ui.pages.generic.GlobalStyleSheet
import ui.pages.generic.Page

class ExperiencePage(controller: ExperienceController) : Page<ExperienceController>(controller)
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
                jobExperiences.forEach { jobExperience ->
                    Li(
                        attrs = {
                            classes(GlobalStyleSheet.paddingMedium, GlobalStyleSheet.flexboxCenteredDefault, GlobalStyleSheet.flexboxColumn, ExperienceStyleSheet.experience)
                            style {
                                alignItems(AlignItems.Start)
                            }
                        }
                    ) {
                        H1 { Text(jobExperience.position) }
                        H2 { Text("${jobExperience.experienceLevel} - ${jobExperience.contractType} - ${jobExperience.site}") }
                        H3 { Text("${jobExperience.company} - ${jobExperience.location}") }
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
                                Text("${jobExperience.description}.")
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
                                        Text("${activity.first}: ${activity.second}.")
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
                            Text("${jobExperience.position} Certificate")
                        }
                    }
                }
            }
        }
}