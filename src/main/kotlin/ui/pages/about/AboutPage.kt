package ui.pages.about

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.*
import ui.pages.generic.GlobalStyleSheet
import ui.pages.generic.Page
import utils.StringResources

class AboutPage(
    controller: AboutController, stringResources: StringResources
) : Page<AboutController>(controller, stringResources)
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
            ) { Text(stringResources get "about_me_title") }
            P(
                attrs = {
                    classes(AboutStyleSheet.paragraph)
                }
            ) {
                Text(stringResources get "about_me_first_paragraph")
            }
            Br {}
            P(
                attrs = {
                    classes(AboutStyleSheet.paragraph)
                }
            ) {
                Text(stringResources get "about_me_second_paragraph")
            }
            Br {}
            P(
                attrs = {
                    classes(AboutStyleSheet.paragraph)
                }
            ) {
                Text(stringResources get "about_me_third_paragraph")
            }
        }
}