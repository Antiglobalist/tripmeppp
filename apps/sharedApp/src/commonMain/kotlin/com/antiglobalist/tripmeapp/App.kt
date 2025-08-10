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

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import tripmeapp.apps.sharedapp.generated.resources.Res
import tripmeapp.apps.sharedapp.generated.resources.compose_multiplatform


@Composable
@Preview
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(onClick = { showContent = !showContent }) {
                Text("Click me!")
            }
            AnimatedVisibility(showContent) {
                val greeting = remember { Greeting().greet() }
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Text("Compose: $greeting")
                }
            }
        }
    }
}