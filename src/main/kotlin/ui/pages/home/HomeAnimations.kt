package ui.pages.home

import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.percent

object HomeAnimations : StyleSheet()
{
    val blinkingCursor by keyframes {
        from { property("border-right-color", "black") }
        to { property("border-right-color", "transparent") }
    }

    val infiniteRotation by keyframes {
        each(0.percent) { property("transform", "rotateY(0deg)") }
        each(20.percent) { property("transform", "rotateY(0deg)") }
        each(30.percent) { property("transform", "rotateY(180deg)") }
        each(70.percent) { property("transform", "rotateY(180deg)") }
        each(80.percent) { property("transform", "rotateY(0deg)") }
        each(100.percent) { property("transform", "rotateY(0deg)") }
    }
}