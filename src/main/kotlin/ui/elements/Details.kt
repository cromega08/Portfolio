package ui.elements

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.ContentBuilder
import org.jetbrains.compose.web.dom.TagElement
import org.w3c.dom.HTMLDetailsElement

@Composable
fun Details(
    attrs: AttrBuilderContext<HTMLDetailsElement> = {},
    contentBuilder: ContentBuilder<HTMLDetailsElement>?
) =
    TagElement<HTMLDetailsElement>(
        tagName = "details",
        applyAttrs = attrs,
        content = contentBuilder
    )
