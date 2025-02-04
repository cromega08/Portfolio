package ui.pages.home

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import kotlinx.browser.window
import ui.navigation.NavigationController
import ui.pages.generic.Controller

class HomeController(navigationController: NavigationController) : Controller(navigationController)
{
    private val writingTimeout: Int = 250

    private val developerTextVariants: Array<String> = arrayOf("Android", "Desktop", "Web")

    private var developerTextIndex by mutableStateOf(0)

    private val developerTextVariant: String
        get() = developerTextVariants[developerTextIndex]

    private var developerTextInterval: Int = 4

    private var developerTextDecreaseRange: Boolean = false

    private var developerTextRange by mutableStateOf(0)

    val developerTextDynamic: String
        get() = developerTextVariant.substring(0, developerTextRange)

    private val nameTextVariants: Array<String> = arrayOf("Cristian", "Cromega")

    private var nameTextIndex by mutableStateOf(0)

    val nameTextVariant: String
        get() = nameTextVariants[nameTextIndex]

    private var nameTextInterval: Int = 2

    private var nameTextDecreaseRange: Boolean = false

    private var nameTextRange by mutableStateOf(0)

    val nameTextDynamic: String
        get() = nameTextVariant.substring(0, nameTextRange)

    init {
        window.setInterval(handler = ::nameTimeout, timeout = writingTimeout)
        window.setInterval(handler = ::developerTimeout, timeout = writingTimeout)
    }

    fun nameTimeout()
    {
        when (nameTextRange)
        {
            nameTextVariant.lastIndex + 1 ->
            {
                if (nameTextInterval > 0)
                {
                    nameTextInterval -= 1
                } else {
                    nameTextDecreaseRange = true
                    nameTextInterval = 4
                    nameTextRange -= 1
                }
            }
            0 ->
            {
                nameTextDecreaseRange = false
                nameTextIndex = if (nameTextIndex == nameTextVariants.lastIndex) 0 else ++nameTextIndex
                nameTextRange += 1
            }
            else -> {
                nameTextRange =
                    if (nameTextDecreaseRange) nameTextRange - 1
                    else nameTextRange + 1
            }
        }
    }
    
    fun developerTimeout()
    {
        when (developerTextRange)
        {
            developerTextVariant.lastIndex + 1 ->
            {
                if (developerTextInterval > 0)
                {
                    developerTextInterval -= 1
                } else {
                    developerTextDecreaseRange = true
                    developerTextInterval = 4
                    developerTextRange -= 1
                }
            }
            0 ->
            {
                developerTextDecreaseRange = false
                developerTextIndex = if (developerTextIndex == developerTextVariants.lastIndex) 0 else ++developerTextIndex
                developerTextRange += 1
            }
            else -> {
                developerTextRange =
                    if (developerTextDecreaseRange) developerTextRange - 1
                    else developerTextRange + 1
            }
        }
    }
}