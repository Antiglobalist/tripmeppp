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
package com.antiglobalist.tripmeapp.designsystem.particles

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

object TextVariant {
    val heading1: TextStyle = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Medium, color = Colors.Text.primary)
    val heading2: TextStyle = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Medium, color = Colors.Text.primary)
    val heading3: TextStyle = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Medium, color = Colors.Text.primary)

    val bodyLarge: TextStyle = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Normal, color = Colors.Text.primary)
    val bodyMedium: TextStyle = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Normal, color = Colors.Text.primary)
    val bodyMediumBold: TextStyle = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Colors.Text.primary)
    val bodySmall: TextStyle = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Normal, color = Colors.Text.primary)

    val captionMedium: TextStyle = TextStyle(fontSize = 12.sp, fontWeight = FontWeight.Medium, color = Colors.Text.primary)
    val captionRegular: TextStyle = TextStyle(fontSize = 12.sp, fontWeight = FontWeight.Normal, color = Colors.Text.primary)

    val labelSmall: TextStyle = TextStyle(fontSize = 10.sp, fontWeight = FontWeight.Medium, color = Colors.Text.primary)

    val buttonLarge: TextStyle = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Medium, color = Colors.Text.primary)
    val buttonMedium: TextStyle = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Medium, color = Colors.Text.primary)
    val buttonSmall: TextStyle = TextStyle(fontSize = 12.sp, fontWeight = FontWeight.Medium, color = Colors.Text.primary)

    val numberLarge: TextStyle = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Medium, color = Colors.Text.primary)
    val numberSmall: TextStyle = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Normal, color = Colors.Text.primary)
    val badgeNumber: TextStyle = TextStyle(fontSize = 8.sp, fontWeight = FontWeight.Bold, color = Colors.Text.primary)
}
