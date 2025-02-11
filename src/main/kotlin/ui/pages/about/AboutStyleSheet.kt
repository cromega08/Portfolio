package ui.pages.about

import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto

object AboutStyleSheet : StyleSheet()
{
    val mainContainer by style {
        gridArea("m")
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        alignItems(AlignItems.Center)
        overflowX("hidden")
        overflowY("scroll")
    }

    val header by style {
        width(100.percent)
        textAlign("center")
        media("(orientation: portrait)") {
            self style {
                fontSize(2.cssRem)
            }
        }
    }

    val paragraph by style {
        width(80.vw)
        height(auto)
        media("(orientation: portrait)") {
            self style {
                fontSize(2.cssRem)
            }
        }
    }
}