import androidx.compose.runtime.remember
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.renderComposable
import ui.navigation.NavigationController
import ui.navigation.NavigationPages
import ui.pages.about.AboutAnimations
import ui.pages.about.AboutController
import ui.pages.about.AboutPage
import ui.pages.about.AboutStyleSheet
import ui.pages.education.EducationAnimations
import ui.pages.education.EducationController
import ui.pages.education.EducationPage
import ui.pages.education.EducationStyleSheet
import ui.pages.experience.ExperienceAnimations
import ui.pages.experience.ExperiencesController
import ui.pages.experience.ExperiencesPage
import ui.pages.experience.ExperienceStyleSheet
import ui.pages.generic.GlobalAnimations
import ui.pages.generic.GlobalStyleSheet
import ui.pages.home.HomeAnimations
import ui.pages.home.HomeController
import ui.pages.home.HomePage
import ui.pages.home.HomeStyleSheet
import ui.pages.projects.ProjectsAnimations
import ui.pages.projects.ProjectsController
import ui.pages.projects.ProjectsPage
import ui.pages.projects.ProjectsStyleSheet

fun main() {
    renderComposable(rootElementId = "root") {
        val navigationController: NavigationController = remember { NavigationController(NavigationPages.Home) }

        Style(GlobalAnimations)
        Style(GlobalStyleSheet)

        when(navigationController.currentPage)
        {
            NavigationPages.Experience -> {
                Style(ExperienceAnimations)
                Style(ExperienceStyleSheet)
                ExperiencesPage(ExperiencesController(navigationController)).Body()
            }
            NavigationPages.Projects -> {
                Style(ProjectsAnimations)
                Style(ProjectsStyleSheet)
                ProjectsPage(ProjectsController(navigationController)).Body()
            }
            NavigationPages.Education -> {
                Style(EducationAnimations)
                Style(EducationStyleSheet)
                EducationPage(EducationController(navigationController)).Body()
            }
            NavigationPages.About -> {
                Style(AboutAnimations)
                Style(AboutStyleSheet)
                AboutPage(AboutController(navigationController)).Body()
            }
            else -> {
                Style(HomeAnimations)
                Style(HomeStyleSheet)
                HomePage(HomeController(navigationController)).Body()
            }
        }
    }
}
