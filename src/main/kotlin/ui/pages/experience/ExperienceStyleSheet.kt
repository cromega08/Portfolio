package ui.pages.experience

import org.jetbrains.compose.web.css.*
import ui.pages.experience.ExperienceStyleSheet.style

object ExperienceStyleSheet : StyleSheet()
{
    val mainContainer by style {
        gridArea("m")
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        alignItems(AlignItems.Center)
        overflowX("hidden")
        overflowY("scroll")
    }

    val timeline by style {
        width(60.vmax)
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        justifyContent(JustifyContent.Start)
        alignItems(AlignItems.Center)
        property("border-left", "1vmin solid black")
        media("(orientation: portrait)") {
            self style {
                width(80.vmin)
            }
        }
    }

    val experience by style {
        width(60.vmax)
        property("border-top", "1px solid black")
        property("border-bottom", "1px solid black")

        self + firstChild style {
            property("border-top", "0px solid black")
        }

        self + lastChild style {
            property("border-bottom", "0px solid black")
        }

        media("(orientation: portrait)") {
            self style {
                width(80.vmin)
            }
        }
    }
}