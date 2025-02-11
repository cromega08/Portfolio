package ui.pages.about

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import ui.pages.generic.GlobalStyleSheet
import ui.pages.generic.Page

class AboutPage(aboutController: AboutController) : Page<AboutController>(aboutController)
{
    @Composable
    override fun PageMain() =
        Section(
            attrs = {
                classes(GlobalStyleSheet.paddingMedium, AboutStyleSheet.mainContainer)
            }
        ) {
            H1(
                attrs = {
                    classes(AboutStyleSheet.header)
                }
            ) { Text("About Me") }
            P(
                attrs = {
                    classes(AboutStyleSheet.paragraph)
                }
            ) {
                Text("Hello, I'm Cristian Ramirez (or Cromega, my alias online). Started in programming with 18 years, " +
                        "learning python and using it to create scripts for my accounting classes at that time and little things " +
                        "like a P2P chat application with websockets.")
            }
            Br {}
            P(
                attrs = {
                    classes(AboutStyleSheet.paragraph)
                }
            ) {
                Text("After graduating, I had the opportunity to learn in depth about application development thanks to the \"Mision TIC - 2022\" scholarship program. " +
                        "Through these process learned about \"Android\" and \"Web\" application development. " +
                        "Developed my first applications and started a real path in coding.")
            }
            Br {}
            P(
                attrs = {
                    classes(AboutStyleSheet.paragraph)
                }
            ) {
                Text("After this, worked on different projects, and even make a volunteer, " +
                        "where focused on improving my abilities and improving the applications whose I been part of. " +
                        "Developed features, maintained code, refactored complete functionalities along with other developers; " +
                        "and even (my most valuable experience) refactored the dependency system of an app due to the shutdown of the \"Bintray\" repository.")
            }
        }
}