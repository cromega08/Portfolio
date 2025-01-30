package ui.navigation

interface NavigationPages
{
    data object Home : NavigationPages
    data object Education : NavigationPages
    data object Projects : NavigationPages
    data object About : NavigationPages

    companion object
    {
        fun asList(): List<NavigationPages> = listOf(Home, Education, Projects, About)

        fun asStringList(): List<String> = asList().map { page -> page.toString() }
    }
}