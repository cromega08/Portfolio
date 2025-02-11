package ui.pages.generic

import org.jetbrains.compose.web.css.*

object GlobalStyleSheet : StyleSheet()
{
    init {
        "*" style {
            boxSizing("border-box")
            fontFamily("JetBrains Mono", "serif")
            property("font-optical-sizing", "auto")
        }

        "body, #root" style {
            overflow("hidden")
        }

        "body" style {
            backgroundColor(Color.transparent)
            backgroundImage("url('data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAIAAACRXR/mAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAIGNIUk0AAHolAACAgwAA+f8AAIDpAAB1MAAA6mAAADqYAAAXb5JfxUYAAABnSURBVHja7M5RDYAwDEXRDgmvEocnlrQS2SwUFST9uEfBGWs9c97nbGtDcquqiKhOImLs/UpuzVzWEi1atGjRokWLFi1atGjRokWLFi1atGjRokWLFi1af7Ukz8xWp8z8AAAA//8DAJ4LoEAAlL1nAAAAAElFTkSuQmCC')")
            backgroundRepeat("repeat")
            backgroundPosition("0 0")
            animation(GlobalAnimations.backgroundScrolling) {
                duration(1.s)
                timingFunction(AnimationTimingFunction.Linear)
                playState(AnimationPlayState.Running)
            }
            property("animation-iteration-count", "infinite")
        }
    }

    val bodyContainer by style {
        top(0.px)
        left(0.px)
        display(DisplayStyle.Grid)
        gridTemplateColumns("repeat(1, 99vw)")
        gridTemplateRows("14.3vh 69.33vh 14.3vh")
        gridTemplateAreas(
            "h",
            "m",
            "f"
        )
        height(100.percent)
        width(100.percent)
        padding(0.px)
    }

    val flexboxCenteredDefault by style {
        display(DisplayStyle.Flex)
        alignItems(alignItems = AlignItems.Center)
        justifyContent(justifyContent = JustifyContent.Center)
    }

    val flexboxRow by style {
        flexDirection(FlexDirection.Row)
        flexWrap(FlexWrap.Wrap)
        gap(2.5.vmin)
    }

    val flexboxColumn by style {
        flexDirection(FlexDirection.Column)
        gap(2.5.vmin)
    }

    val utilityButtons by style {
        width(5.vmax)
        height(5.vmax)
        backgroundColor(Color.white)
        border {
            width(1.5.px)
            color(Color.black)
            style(LineStyle.Solid)
        }
        media("(orientation: portrait)"){
            self style {
                width(6.vmax)
                height(6.vmax)
            }
        }
    }

    val utilityButtonsIcon by style {
        width(4.vmax)
        height(4.vmax)
    }

    val paddingSmall by style {
        padding(1.vmin)
    }

    val paddingMedium by style {
        padding(2.5.vmin)
    }

    val sectionFlexboxWrap by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Start)
        flexWrap(FlexWrap.Wrap)
        gap(3.vmin)
        overflowY("scroll")
        overflowX("hidden")
    }
}