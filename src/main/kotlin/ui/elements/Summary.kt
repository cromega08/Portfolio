package ui.elements

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.ContentBuilder
import org.jetbrains.compose.web.dom.TagElement
import org.w3c.dom.HTMLElement

@Composable
fun Summary(
    attrs: AttrBuilderContext<HTMLElement> = {},
    contentBuilder: ContentBuilder<HTMLElement>
) =
    TagElement<HTMLElement>(
        tagName = "summary",
        applyAttrs = attrs,
        content = contentBuilder
    )
