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
package com.antiglobalist.tripmeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}