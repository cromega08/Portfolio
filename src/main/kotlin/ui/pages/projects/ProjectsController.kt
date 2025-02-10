package ui.pages.projects

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import data.models.Repository
import data.remote.instances.GithubApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.promise
import ui.navigation.NavigationController
import ui.pages.generic.Controller

class ProjectsController(navigationController: NavigationController) : Controller(navigationController)
{
    private val githubApi: GithubApi = GithubApi()
    var isLoadComplete: Boolean by mutableStateOf(false)
    var query by mutableStateOf("")
    lateinit var repositories: Array<Repository>

    init {
        GlobalScope.promise {
            repositories = githubApi.getRepositories()
            isLoadComplete = true
        }
    }
}