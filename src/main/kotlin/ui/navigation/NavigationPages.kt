package ui.navigation

interface NavigationPages
{
    data object Home : NavigationPages
    data object Experience : NavigationPages
    data object Projects : NavigationPages
    data object Education : NavigationPages
    data object About : NavigationPages

    companion object
    {
        fun asList(): List<NavigationPages> = listOf(Home, Experience, Projects, Education, About)

        fun asStringList(): List<String> = asList().map { page -> page.toString() }
    }
}