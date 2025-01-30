package ui.navigation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.snapshots.SnapshotStateList

class NavigationController(
    initialNavigationPages: NavigationPages
) {
    val pages: List<NavigationPages> = NavigationPages.asList()

    private val currentPageState: MutableState<NavigationPages> = mutableStateOf(initialNavigationPages)
    var currentPage: NavigationPages
        get() = currentPageState.value
        private set(value) { currentPageState.value = value }

    fun isCurrentPage(page: NavigationPages): Boolean = (currentPage == page)

    fun navigateTo(navigationPages: NavigationPages)
    {
        currentPage = navigationPages
    }

    fun navigateRight()
    {
        currentPage =
            pages[
                if (currentPage == pages.last()) 0
                else (pages.indexOf(currentPage) + 1)
            ]
    }

    fun navigateLeft()
    {
        currentPage =
            pages[
                if (currentPage == pages.first()) (pages.indexOf(pages.last()))
                else (pages.indexOf(currentPage) - 1)
            ]
    }
}