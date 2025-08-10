/*
 *
 *  * Copyright (c) 2025 Denis Rodionov
 *  * SPDX-License-Identifier: CC-BY-NC-ND-4.0
 *  *
 *  * This file is part of TripMeApp.
 *  *
 *  * TripMeApp is an open-source Kotlin Multiplatform project licensed under the
 *  * Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License.
 *  *
 *  * You may not use this file or its contents for commercial purposes, nor create
 *  * modified versions for redistribution, without prior written permission from
 *  * the author.
 *  *
 *  * See the LICENSE.md file in the root of the project for full license information.
 *
 */
package com.antiglobalist.tripmeapp.designsystem

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import com.antiglobalist.tripmeapp.designsystem.particles.Colors

/**
 * App theme using color tokens. Hosts typography and shapes in the future.
 */
@Composable
fun DesignSystemTheme(
    useDarkTheme: Boolean = false,
    content: @Composable () -> Unit,
) {
    val lightColors = lightColorScheme(
        primary = Colors.Brand.base,
        onPrimary = Colors.Text.inverse,
        secondary = Colors.Accent.base,
        onSecondary = Colors.Text.inverse,
        background = Colors.Background.neutral,
        onBackground = Colors.Text.primary,
        surface = Colors.Neutral.white,
        onSurface = Colors.Text.primary,
        error = Colors.Danger.base,
        onError = Colors.Text.inverse,
    )
    val darkColors = darkColorScheme(
        primary = Colors.Brand.dark,
        onPrimary = Colors.Text.inverse,
        secondary = Colors.Accent.dark,
        onSecondary = Colors.Text.inverse,
        background = Colors.Neutral.ink,
        onBackground = Colors.Neutral.white,
        surface = Colors.Neutral.graphite,
        onSurface = Colors.Neutral.white,
        error = Colors.Danger.dark,
        onError = Colors.Text.inverse,
    )

    MaterialTheme(
        colorScheme = if (useDarkTheme) darkColors else lightColors,
        content = content,
    )
}
