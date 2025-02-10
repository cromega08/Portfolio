package ui.pages.projects

import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.transform
import org.jetbrains.compose.web.css.turn

object ProjectsAnimations : StyleSheet()
{
    @OptIn(ExperimentalComposeWebApi::class)
    val load by keyframes {
        each(100.percent) {
            transform {
                rotate(1.turn)
            }
        }
    }
}