package ui.pages.generic

import androidx.compose.runtime.Composable
import enums.UtilityButtonsInfo
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import ui.navigation.NavigationPages

abstract class Page<C : Controller>(protected val controller: C)
{
    @Composable
    fun Body() {
        Div(
            attrs = {
                classes(GlobalStyleSheet.bodyContainer)

                onKeyUp { keyboardEvent ->
                    if (
                        (keyboardEvent.getNormalizedKey() == "ArrowRight") ||
                        (keyboardEvent.getNormalizedKey() == "ArrowDown")
                        ) controller.navigationController.navigateRight()

                    if (
                        (keyboardEvent.getNormalizedKey() == "ArrowLeft") ||
                        (keyboardEvent.getNormalizedKey() == "ArrowUp")
                        ) controller.navigationController.navigateLeft()
                }
            }
        ) {
            PageHeader()
            PageMain()
            PageFooter()
        }
    }

    @Composable
    protected fun PageHeader() =
        Header(
            attrs = {
                classes(GlobalStyleSheet.paddingMedium, GlobalStyleSheet.flexboxCenteredDefault)
                style {
                   gridArea("h")
               }
            }
        ) {
            Nav(
                attrs = {
                    classes(GlobalStyleSheet.flexboxCenteredDefault, GlobalStyleSheet.flexboxRow)
                }
            ) {
                val pages: List<NavigationPages> = controller.navigationController.pages

                pages.forEach { page ->
                    Button(
                      attrs = {
                          style {
                              if (controller.navigationController.isCurrentPage(page = page))
                              {
                                  backgroundColor(Color.white)
                              }

                              fontSize(2.cssRem)
                          }

                          onClick {
                              controller.navigationController.navigateTo(navigationPages = page)
                          }
                      }
                    ) {
                        Text(value = page.toString())
                    }
                }
            }
        }

    @Composable
    protected abstract fun PageMain()

    @Composable
    protected fun PageFooter() =
        Footer(
            attrs = {
                classes(GlobalStyleSheet.paddingMedium, GlobalStyleSheet.flexboxCenteredDefault)
                style {
                    gridArea("f")
                }
            }
        ) {
            Div(
                attrs = {
                    classes(GlobalStyleSheet.flexboxCenteredDefault, GlobalStyleSheet.flexboxRow)
                }
            ) {
                for (utilityButtonInfo in UtilityButtonsInfo.asList()) {
                    A (
                        href = utilityButtonInfo.href,
                        attrs = {
                            attr("target", "_blank")
                            classes(GlobalStyleSheet.flexboxCenteredDefault, GlobalStyleSheet.utilityButtons)
                        }
                    ) {
                        Img(
                            src = utilityButtonInfo.icon,
                            alt = utilityButtonInfo.text,
                            attrs = {
                                title(utilityButtonInfo.text)
                                classes(GlobalStyleSheet.utilityButtonsIcon)
                            }
                        )
                    }
                }
            }
        }
}