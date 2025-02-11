package ui.navigation

import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateList

class NavigationController(
    initialNavigationPages: NavigationPages
) {
    val pages: List<NavigationPages> = NavigationPages.asList()

    var currentPage by mutableStateOf(initialNavigationPages)

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