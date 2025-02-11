package ui.pages.home

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import ui.pages.generic.GlobalStyleSheet
import ui.pages.generic.Page
import utils.StringResources

class HomePage(
    controller: HomeController, stringResources: StringResources
) : Page<HomeController>(controller, stringResources)
{
    @Composable
    override fun PageMain() =
        Section(
            attrs = {
                classes(GlobalStyleSheet.paddingMedium, GlobalStyleSheet.flexboxCenteredDefault, HomeStyleSheet.mainContainer)
                style {
                    gridArea("m")
                }
            }
        ) {
            Div(
                attrs = {
                    classes(GlobalStyleSheet.flexboxCenteredDefault, HomeStyleSheet.flipCard)
                }
            ) {
                Div(
                    attrs = {
                        classes(GlobalStyleSheet.flexboxCenteredDefault, HomeStyleSheet.flipCardInner)
                    }
                ) {
                    Div(
                        attrs = {
                            classes(GlobalStyleSheet.flexboxCenteredDefault, HomeStyleSheet.flipCardSide, HomeStyleSheet.flipCardFront)
                        }
                    ) {
                        val imageText: String = stringResources get "cristian_personal_photo"
                        Img(
                            src = "images\\personal_photo_transparent.webp",
                            alt = imageText,
                            attrs = {
                                title(imageText)
                                classes(HomeStyleSheet.flipCarImage)
                            }
                        )
                    }
                    Div(
                        attrs = {
                            classes(GlobalStyleSheet.flexboxCenteredDefault, HomeStyleSheet.flipCardSide, HomeStyleSheet.flipCardBack)
                        }
                    ) {
                        val imageText: String = stringResources get "cromega_logo_image"

                        Img(
                            src = "images\\cromega_logo_transparent.webp",
                            alt = imageText,
                            attrs = {
                                title(imageText)
                                classes(HomeStyleSheet.flipCarImage)
                            }
                        )
                    }
                }
            }
            Div(
                attrs = {
                    classes(HomeStyleSheet.rightSideSection, GlobalStyleSheet.flexboxColumn)
                    style {
                        width(50.percent)
                        height(40.vmin)
                    }
                }
            ) {
                H2(
                    attrs = {
                        style {
                            fontSize(2.5.cssRem)
                        }
                    }
                ) {
                    Text("${stringResources get "hello_i_am"} ")

                    Span(
                        attrs = {
                            classes(HomeStyleSheet.cursorAtRight)
                        }
                    ) {
                        Text(controller.nameTextDynamic)
                    }
                }
                H1(
                    attrs = {
                        style {
                            fontSize(4.cssRem)
                        }
                    }
                ) {
                    Span(
                        attrs = {
                            classes(HomeStyleSheet.cursorAtRight)
                        }
                    ) {
                        Text(controller.developerTextDynamic)
                    }
                    Text(" ${stringResources get "developer"}")
                }
            }
        }
}
