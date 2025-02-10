package ui.pages.projects

import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto

object ProjectsStyleSheet : StyleSheet()
{
    val loader by style {
        width(15.vmin)
        height(15.vmin)
        color(Color.black)
        border {
            width(2.px)
            style(LineStyle.Solid)
            boxSizing("border-box")
        }
        display(DisplayStyle.Grid)
        animation(ProjectsAnimations.load) {
            duration(8.s)
            timingFunction(AnimationTimingFunction.Linear)
        }
        property("animation-iteration-count", "infinite")

        self + before style {
            width(70.7.percent)
            height(70.7.percent)
            gridArea("1/1")
            property("margin", "auto")
            property("content", "\"\"")
            property("border", "inherit")
            property("animation", "inherit")
        }

        self + after style {
            width(50.percent)
            height(50.percent)
            gridArea("1/1")
            property("margin", "auto")
            property("content", "\"\"")
            property("border", "inherit")
            property("animation", "inherit")
            property("animation-duration", "4s")
        }
    }

    val mainContainer by style {
        gridArea("m")
        media("(orientation: portrait)") {
            self style {
                gap(3.vmin)
            }
        }
    }

    val projects by style {
        height(90.percent)
        width(90.percent)
        padding(2.5.vmin)
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Start)
        overflowY("scroll")
        overflowX("hidden")
    }

    val project by style {
        height(auto)
        width(27.vmax)
        backgroundColor(Color.white)
        border {
            style(LineStyle.Solid)
            width(1.vmin)
            color(Color.black)
        }
        property("text-wrap", "pretty")
        padding(1.vmin)
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Start)
        overflow("clip")
        media("(orientation: portrait)") {
            self style {
                width(80.vmin)
            }

            "small" style {
                fontSize(1.75.cssRem)
            }
        }
    }

    val searchBar by style {
        width(80.percent)
        height(1.5.cssRem)
        textAlign("center")
        border {
            style(LineStyle.Solid)
            width(0.5.vmin)
            color(Color.black)
        }
        padding(0.5.vmin)
        media("(orientation: portrait)") {
            self style {
                height(5.cssRem)
                border {
                    style(LineStyle.Solid)
                    width(1.vmin)
                    color(Color.black)
                }
                fontSize(3.cssRem)
            }
        }
    }
}