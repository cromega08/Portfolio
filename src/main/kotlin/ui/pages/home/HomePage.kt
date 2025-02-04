package ui.pages.home

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import ui.pages.generic.GlobalStyleSheet
import ui.pages.generic.Page

class HomePage(controller: HomeController) : Page<HomeController>(controller)
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
                        val imageText: String = "Cristian Personal Photo"
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
                        val imageText: String = "Cromega's Logo Image"

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
                    Text("Hello, I am ")

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
                    Text(" Developer")
                }
            }
        }
}
