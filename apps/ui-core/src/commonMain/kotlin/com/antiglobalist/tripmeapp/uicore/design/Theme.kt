package com.antiglobalist.tripmeapp.uicore.design

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

/**
 * App theme using color tokens. Hosts typography and shapes in the future.
 */
@Composable
fun UiCoreTheme(
    useDarkTheme: Boolean = false,
    content: @Composable () -> Unit,
) {
    val lightColors = lightColorScheme(
        primary = ColorTokens.Primary,
        onPrimary = ColorTokens.OnPrimary,
        secondary = ColorTokens.Secondary,
        onSecondary = ColorTokens.OnSecondary,
        background = ColorTokens.Background,
        onBackground = ColorTokens.OnBackground,
        surface = ColorTokens.Surface,
        onSurface = ColorTokens.OnSurface,
        error = ColorTokens.Error,
        onError = ColorTokens.OnError,
    )
    val darkColors = darkColorScheme(
        primary = ColorTokens.Primary,
        onPrimary = ColorTokens.OnPrimary,
        secondary = ColorTokens.Secondary,
        onSecondary = ColorTokens.OnSecondary,
        background = ColorTokens.OnBackground,
        onBackground = ColorTokens.Background,
        surface = ColorTokens.OnSurface,
        onSurface = ColorTokens.Surface,
        error = ColorTokens.Error,
        onError = ColorTokens.OnError,
    )

    MaterialTheme(
        colorScheme = if (useDarkTheme) darkColors else lightColors,
        content = content,
    )
}
