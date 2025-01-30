import androidx.compose.runtime.remember
import org.jetbrains.compose.web.renderComposable
import ui.navigation.NavigationController
import ui.navigation.NavigationPages
import ui.pages.home.HomeController
import ui.pages.home.HomePage

fun main() {
    renderComposable(rootElementId = "root") {
        val navigationController: NavigationController = remember { NavigationController(NavigationPages.Home) }

        HomePage(HomeController(navigationController)).Body()

//        when(navigationController.currentPage)
//        {
//            NavigationPages.Home -> HomePage(HomeController(navigationController)).Body()
//            else -> {}
//        }
    }
}
