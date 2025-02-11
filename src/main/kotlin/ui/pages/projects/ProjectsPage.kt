package ui.pages.projects

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.*
import ui.components.SectionScrollableFlexboxWrap
import ui.pages.generic.GlobalStyleSheet
import ui.pages.generic.Page
import utils.StringResources

class ProjectsPage(
    controller: ProjectsController, stringResources: StringResources
) : Page<ProjectsController>(controller, stringResources)
{
    @Composable
    override fun PageMain()
    {
        if (controller.isLoadComplete) MainAfterLoading()
        else MainBeforeLoading()
    }

    @Composable
    fun MainBeforeLoading() =
        Section(
            attrs = {
                classes(ProjectsStyleSheet.mainContainer, GlobalStyleSheet.flexboxCenteredDefault)
            }
        ) {
            Div(
                attrs = { classes(ProjectsStyleSheet.loader) },
                content = {}
            )
        }

    @Composable
    fun MainAfterLoading() =
        Div(
            attrs = {
                classes(GlobalStyleSheet.flexboxCenteredDefault, GlobalStyleSheet.flexboxColumn, ProjectsStyleSheet.mainContainer)
            }
        ) {
            SectionScrollableFlexboxWrap(
                attrs = {
                    classes(ProjectsStyleSheet.projects)
                },
                dataForElements = controller.repositories.toList()
            ) { repository ->
                Article(
                    attrs = {
                        classes(ProjectsStyleSheet.project)
                    }
                ) {
                    H1 { Text(repository.name) }
                    A(
                        href = repository.html_url,
                        attrs = {
                            target(ATarget.Blank)
                        }
                    ) { Text("Github Repository") }
                    P(
                        attrs = {
                            style {
                                width(100.percent)
                            }
                        }
                    ) {
                        if (repository.description != null) Text(repository.description)
                        else Span(
                            attrs = {
                                style {
                                    color(Color.black)
                                    opacity(80.percent)
                                }
                            }
                        ) { Text("No description available...") }
                    }
                    P(
                        attrs = {
                            style {
                                width(100.percent)
                                display(DisplayStyle.Flex)
                                flexDirection(FlexDirection.Row)
                                justifyContent(JustifyContent.SpaceBetween)
                                alignItems(AlignItems.Center)
                            }
                        }
                    ) {
                        Small {
                            if (repository.license != null)
                                A(
                                    href = repository.license.url,
                                    attrs = {
                                        target(ATarget.Blank)
                                    }
                                ) { Text(repository.license.name) }
                            else Text("No license")
                        }

                        Small { Text(repository.created_at.split("T")[0]) }
                    }
                }
            }
            Aside(
                attrs = {
                    classes(GlobalStyleSheet.flexboxCenteredDefault, GlobalStyleSheet.flexboxColumn)
                    style {
                        width(90.percent)
                    }
                }
            ) {
                SearchInput(
                    value = controller.query,
                    attrs = {
                        classes(ProjectsStyleSheet.searchBar)
                        onInput {
                            controller.query = it.value
                        }
                    }
                )
            }
        }
}
