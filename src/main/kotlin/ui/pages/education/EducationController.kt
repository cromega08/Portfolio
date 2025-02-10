package ui.pages.education

import data.local.EducationInfo
import data.local.higherEducation
import data.local.lowerEducation
import data.local.mediumEducation
import ui.navigation.NavigationController
import ui.pages.generic.Controller

class EducationController(navigationController: NavigationController) : Controller(navigationController)
{
    val education: Array<EducationInfo> = arrayOf(
        *higherEducation, *mediumEducation, *lowerEducation
    )
}