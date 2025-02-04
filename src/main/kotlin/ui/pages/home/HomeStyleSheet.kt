package ui.pages.home

import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*

object HomeStyleSheet : StyleSheet()
{
    private val flippingCardAnimationDuration: CSSSizeValue<out CSSUnitTime> = 8.s
    private val flippingCardAnimationTiming: AnimationTimingFunction = AnimationTimingFunction.Linear
    private val flippingCardAnimationPlayState: AnimationPlayState = AnimationPlayState.Running
    private const val FLIPPING_CARD_ANIMATION_ITERATION_COUNT: String = "infinite"

    init {
        "h1, h2" style {
            margin(0.75.vmin)
        }
    }

    val mainContainer by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Row)
        gap(3.vmin)
        media("(orientation: portrait)") {
            self style {
                flexDirection(FlexDirection.Column)
            }
        }
    }

    val rightSideSection by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Start)
    }

    val cursorAtRight by style {
        property("border-right", "2px solid rgba(255,255,255,.75)")
        animation(HomeAnimations.blinkingCursor) {
            duration(1.s)
            timingFunction(AnimationTimingFunction.Companion.steps(50))
            playState(AnimationPlayState.Running)
        }
        property("animation-iteration-count", "infinite")
    }

    val flipCard by style {
        height(40.vmin)
        width(40.vmin)
        borderRadius(50.percent)
        backgroundColor(Color.white)
        border {
            style = LineStyle.Solid
            width = 1.vmin
            color = Color.black
        }
        overflow("hidden")
        animation(HomeAnimations.infiniteRotation) {
            duration(flippingCardAnimationDuration)
            timingFunction(flippingCardAnimationTiming)
            playState(flippingCardAnimationPlayState)
        }
        property("animation-iteration-count", FLIPPING_CARD_ANIMATION_ITERATION_COUNT)
    }

    val flipCardInner by style {
        position(Position.Relative)
        width(40.vmin)
        height(40.vmin)
        textAlign(AlignItems.Center.toString())
        animation(HomeAnimations.infiniteRotation) {
            duration(flippingCardAnimationDuration)
            timingFunction(flippingCardAnimationTiming)
            playState(flippingCardAnimationPlayState)
        }
        property("animation-iteration-count", FLIPPING_CARD_ANIMATION_ITERATION_COUNT)

        property("transition", "transform 1s")
        property("transform-style", "preserve-3d")
    }

    val flipCardSide by style {
        position(Position.Absolute)
        width(40.vmin)
        height(40.vmin)
        property("backface-visibility", "hidden")
    }

    val flipCardFront by style {
    }

    val flipCardBack by style {
        property("transform", "rotateY(180deg)")
    }

    @OptIn(ExperimentalComposeWebApi::class)
    val flipCarImage by style {
        width(40.vmin)
        height(40.vmin)
        filter {
            grayscale(100.percent)
        }
        property("transform", "translateX(-2px)")
    }
}
