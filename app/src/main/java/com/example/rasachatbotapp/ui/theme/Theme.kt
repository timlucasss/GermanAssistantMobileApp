package com.example.rasachatbotapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable



private val LightColorPalette = lightColors(
    primary = green,
    primaryVariant = lighterblack,
    secondary = darkergrey,
    secondaryVariant = grey,
    onSecondary = black,
    surface = white,
    onError = blue,
    onSurface = grey,

)

@Composable
fun RasaChatbotAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = LightColorPalette

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}