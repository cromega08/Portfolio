package ui.pages.home

import androidx.compose.runtime.*
import ui.navigation.NavigationController
import ui.pages.generic.Controller

class HomeController(navigationController: NavigationController) : Controller(navigationController)
{
    var counter by mutableStateOf(0)
}