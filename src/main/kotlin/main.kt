import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.renderComposable
import ui.navigation.NavigationController
import ui.navigation.NavigationPages
import ui.pages.generic.GlobalAnimations
import ui.pages.generic.GlobalStyleSheet
import ui.pages.home.HomeAnimations
import ui.pages.home.HomeController
import ui.pages.home.HomePage
import ui.pages.home.HomeStyleSheet

fun main() {
    renderComposable(rootElementId = "root") {
        val navigationController: NavigationController = remember { NavigationController(NavigationPages.Home) }

        Style(GlobalAnimations)
        Style(GlobalStyleSheet)

        when(navigationController.currentPage)
        {
            else -> {
                Style(HomeAnimations)
                Style(HomeStyleSheet)
                HomePage(HomeController(navigationController)).Body()
            }
        }
    }
}
