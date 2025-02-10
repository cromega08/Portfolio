package ui.pages.education

import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto

object EducationStyleSheet : StyleSheet()
{
    val mainContainer by style {
        gridArea("m")
    }

    val education by style {
        height(auto)
        width(35.vmax)
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
}