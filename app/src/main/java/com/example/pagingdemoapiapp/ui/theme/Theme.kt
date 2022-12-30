package com.example.pagingdemoapiapp.ui.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

@SuppressLint("ConflictingOnColor")
private val DarkColorPalette = darkColors(
    primary = Blue80,
    onPrimary = White,
    primaryVariant = Blue90,
    secondary = DarkBlue80,
    onSecondary = DarkBlue20,
    secondaryVariant = DarkBlue90,
    error = Red80,
    onError = White,
    background = Grey10,
    onBackground = Grey90,
    surface = BlueGrey30,
    onSurface = BlueGrey80
)

private val LightColorPalette = lightColors(
    primary = Blue40,
    onPrimary = White,
    primaryVariant = Blue90,
    secondary = DarkBlue40,
    onSecondary = White,
    secondaryVariant = DarkBlue90,
    error = Red40,
    onError = White,
    background = Grey99,
    onBackground = Grey10,
    surface = BlueGrey90,
    onSurface = BlueGrey30
)

@Composable
fun PagingDemoApiAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}