package ui.components

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.*
import org.w3c.dom.HTMLElement
import ui.pages.generic.GlobalStyleSheet

@Composable
fun <T> SectionScrollableFlexboxWrap(
    attrs: AttrBuilderContext<HTMLElement> = {},
    dataForElements: List<T>,
    element:  @Composable (ElementScope<HTMLElement>.(T) -> Unit)
) =
    Section(
        attrs = {
            classes(GlobalStyleSheet.paddingMedium, GlobalStyleSheet.sectionFlexboxWrap)
            also(attrs)
        }
    ) {
        dataForElements.forEach { data ->
            also { element(data) }
        }
    }
