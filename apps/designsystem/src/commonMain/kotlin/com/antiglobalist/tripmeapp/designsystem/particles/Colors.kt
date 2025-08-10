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

import androidx.compose.ui.graphics.Color

object Colors {
    object Brand {
        val base = Color(0xFF2E6BE6)   
        val dark = Color(0xFF1F4DB0)
        val light = Color(0xFFD6E3FA)
    }

    object Accent { 
        val base = Color(0xFFEA5A0C)   
        val dark = Color(0xFF9F3E09)
        val light = Color(0xFFFBD9C6)
    }

    object Neutral {
        val ink = Color(0xFF111316)
        val graphite = Color(0xFF6B7280)
        val fog = Color(0xFFE6E8EC)
        val cloud = Color(0xFFF5F7FA)
        val mist = Color(0xFFFAFBFD)
        val white = Color(0xFFFFFFFF)
    }

    object Success {
        val base = Color(0xFF17B26A)
        val dark = Color(0xFF067A45)
        val light = Color(0xFFCCF0DE)
    }

    object Info {
        val base = Color(0xFF3AA0F2)
        val dark = Color(0xFF0E5DAA)
        val light = Color(0xFFD6ECFE)
    }

    object Warning {
        val base = Color(0xFFF7B500)
        val dark = Color(0xFF8A6000)
        val light = Color(0xFFFFF1C2)
    }

    object Danger {
        val base = Color(0xFFE5484D)
        val dark = Color(0xFF9E1E24)
        val light = Color(0xFFF8D1D2)
    }

    object Background {
        val whiteDefault = Neutral.white
        val primary = Brand.base
        val neutral = Neutral.cloud
        val black = Neutral.ink
        val accent = Accent.base
        val gray = Neutral.graphite
        val dark = Brand.dark
        val neutralDark = Neutral.fog
        val success = Success.base
        val info = Info.base
        val warning = Warning.base
        val error = Danger.base
    }

    object Icon {
        val defaultDark = Neutral.ink
        val defaultLight = Neutral.white
        val success = Success.base
        val error = Danger.base
        val primary = Brand.base
        val secondary = Neutral.graphite
        val muted = Neutral.fog
        val accent = Accent.base
    }

    object Stroke {
        val subtle = Neutral.fog
        val strong = Neutral.ink
        val brand = Brand.base
    }

    object Text {
        val primary = Neutral.ink
        val secondary = Neutral.graphite
        val inverse = Neutral.white
        val muted = Neutral.fog
        val accent = Accent.base
    }

    object Opacity {
        val black40 = Color.Black.copy(alpha = 0.4f)
        val graphite50 = Neutral.graphite.copy(alpha = 0.5f)
        val white30 = Color.White.copy(alpha = 0.3f)
    }
}
