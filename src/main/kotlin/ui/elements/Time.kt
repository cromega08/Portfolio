package ui.elements

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.ContentBuilder
import org.jetbrains.compose.web.dom.TagElement
import org.w3c.dom.HTMLTimeElement

@Composable
fun Time(
    datetime: String = "",
    attrs: AttrBuilderContext<HTMLTimeElement> = {},
    contentBuilder: ContentBuilder<HTMLTimeElement>
) =
    TagElement<HTMLTimeElement>(
        tagName = "time",
        applyAttrs = {
            if (datetime.isNotBlank()) attr("datetime", datetime)

            attrs()
        },
        content = contentBuilder
    )