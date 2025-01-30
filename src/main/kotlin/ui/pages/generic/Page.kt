package ui.pages.generic

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import ui.navigation.NavigationPages

abstract class Page<C : Controller>(protected val controller: C)
{
    @Composable
    fun Body() {
        Div(
            attrs = {
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
               style {
                   padding(5.vmin)
               }
            }
        ) {
            Nav(
                attrs = {
                    style {
                        display(displayStyle = DisplayStyle.Flex)
                        flexDirection(flexDirection = FlexDirection.Row)
                        alignItems(alignItems = AlignItems.Center)
                        justifyContent(justifyContent = JustifyContent.Center)
                        gap(value = 2.vmin)
                    }
                }
            ) {
                val pages: List<NavigationPages> = controller.navigationController.pages

                pages.forEach { page ->
                    Button(
                      attrs = {
                          style {
                              if (controller.navigationController.isCurrentPage(page = page))
                              {
                                  backgroundColor(Color.red)
                              }
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
                style {
                    display(displayStyle = DisplayStyle.Flex)
                    alignItems(alignItems = AlignItems.Center)
                    justifyContent(justifyContent = JustifyContent.Center)
                }
            }
        ) {
            Button(
                attrs = {
                    style {
                        display(displayStyle = DisplayStyle.Flex)
                        alignItems(alignItems = AlignItems.Center)
                        justifyContent(justifyContent = JustifyContent.Center)
                        padding(1.vmin)
                    }
                }
            ) {
                Img(
                    src = "icons\\email.svg"
                )
            }
        }
}