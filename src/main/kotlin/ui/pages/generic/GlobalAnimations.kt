package ui.pages.generic

import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.backgroundPosition
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.value

object GlobalAnimations : StyleSheet()
{
    val backgroundScrolling by keyframes {
        each(0.percent) {
            backgroundPosition("0px 0px")
        }

        each(100.percent) {
            backgroundPosition("50px 50px")
        }
    }
}