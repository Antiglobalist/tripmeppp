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
package com.antiglobalist.tripmeapp.designsystem.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.antiglobalist.tripmeapp.designsystem.particles.Colors
import com.antiglobalist.tripmeapp.designsystem.particles.ComponentHeight
import com.antiglobalist.tripmeapp.designsystem.particles.IconSize
import com.antiglobalist.tripmeapp.designsystem.particles.Padding
import com.antiglobalist.tripmeapp.designsystem.particles.Spacing
import com.antiglobalist.tripmeapp.designsystem.particles.TextVariant
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import tripmeapp.apps.core.designsystem.generated.resources.Res
import tripmeapp.apps.core.designsystem.generated.resources.compose_multiplatform

enum class AppButtonVariant {
    Primary,
    Secondary,
    Tertiary,
    Link,
    Danger,
    Circle,
    Muted
}

@Composable
fun AppButton(
    title: String,
    modifier: Modifier = Modifier,
    icon: Any? = null,
    variant: AppButtonVariant = AppButtonVariant.Primary,
    height: Dp = ComponentHeight.default,
    isLoading: Boolean = false,
    enabled: Boolean = true,
    onClick: () -> Unit = {},
) {
    val cornerRadius = 8.dp
    val horizontalPadding = when {
        variant == AppButtonVariant.Circle -> 0.dp
        height == ComponentHeight.small && title.isNotEmpty() -> Padding.semiExtraSmall
        height == ComponentHeight.small && title.isEmpty() -> ((ComponentHeight.small - IconSize.mediumSmall) / 2)
        else -> Padding.small
    }
    val iconSize = when (height) {
        ComponentHeight.small -> IconSize.small
        else -> IconSize.mediumSmall
    }
    val textStyle: TextStyle = when (height) {
        ComponentHeight.small -> TextVariant.buttonSmall
        else -> TextVariant.buttonMedium
    }

    val bg = when (variant) {
        AppButtonVariant.Primary -> Colors.Background.accent
        AppButtonVariant.Secondary -> Colors.Background.primary
        AppButtonVariant.Tertiary -> Colors.Background.neutralDark
        AppButtonVariant.Link -> Color.Transparent
        AppButtonVariant.Danger -> Colors.Danger.base
        AppButtonVariant.Circle -> Colors.Background.whiteDefault
        AppButtonVariant.Muted -> Colors.Opacity.graphite50
    }
    val bgDisabled = if (bg == Color.Transparent) Color.Transparent else bg.copy(alpha = 0.4f)
    val fg = when (variant) {
        AppButtonVariant.Link, AppButtonVariant.Circle, AppButtonVariant.Muted, AppButtonVariant.Danger -> Colors.Text.inverse
        else -> Colors.Text.primary
    }
    val fgDisabled = fg.copy(alpha = 0.4f)

    Button(
        onClick = onClick,
        enabled = enabled,
        contentPadding = PaddingValues(0.dp),
        modifier = modifier.height(height),
        colors = ButtonDefaults.buttonColors(
            containerColor = bg,
            disabledContainerColor = bgDisabled,
            contentColor = fg,
            disabledContentColor = fgDisabled
        ),
        shape = if (variant == AppButtonVariant.Circle) CircleShape else RoundedCornerShape(cornerRadius),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .then(if (variant != AppButtonVariant.Circle) Modifier else Modifier)
                .padding(horizontal = if (variant == AppButtonVariant.Circle) 0.dp else horizontalPadding)
        ) {
            if (isLoading) {
                // simple spinner substitute by three dots; replace with your own
                Text("…", color = LocalContentColor.current, style = textStyle)
                if (variant != AppButtonVariant.Circle) Spacer(Modifier.width(Spacing.extraSmall))
            } else if (icon != null) {
                when (icon) {
                    is DrawableResource -> {
                        Icon(painter = painterResource(icon), contentDescription = null, modifier = Modifier.size(iconSize))
                    }
                }
                if (variant != AppButtonVariant.Circle && title.isNotEmpty()) {
                    Spacer(Modifier.width(Spacing.extraSmall))
                }
            }
            if (variant != AppButtonVariant.Circle && title.isNotEmpty()) {
                Text(
                    text = title,
                    style = textStyle,
                    textDecoration = if (variant == AppButtonVariant.Link) TextDecoration.Underline else TextDecoration.None,
                    color = LocalContentColor.current,
                )
            }
        }
    }
}

@Preview
@Composable
private fun AppButtonPreview() {
    Column(
        modifier = Modifier
            .background(Colors.Background.neutral)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        val icon: DrawableResource = Res.drawable.compose_multiplatform
        AppButton(title = "Primary", variant = AppButtonVariant.Primary, icon = icon)
        AppButton(title = "Secondary", variant = AppButtonVariant.Secondary, icon = icon)
        AppButton(title = "Tertiary", variant = AppButtonVariant.Tertiary, icon = icon)
        AppButton(title = "Danger", variant = AppButtonVariant.Danger, icon = icon)
        AppButton(title = "Link", variant = AppButtonVariant.Link)
        AppButton(title = "", variant = AppButtonVariant.Circle, icon = icon, height = ComponentHeight.small)
        AppButton(title = "Muted", variant = AppButtonVariant.Muted)
    }
}
