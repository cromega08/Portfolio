package ui.pages.experience

import data.local.JobExperienceInfo
import data.local.jobExperiences
import ui.navigation.NavigationController
import ui.pages.generic.Controller

class ExperiencesController(navigationController: NavigationController) : Controller(navigationController)
{
    val experiences: Array<JobExperienceInfo> = jobExperiences
}