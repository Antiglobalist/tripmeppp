package com.antiglobalist.tripmeapp.uicore.samples

import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.material3.Text
import org.jetbrains.compose.resources.painterResource
import com.antiglobalist.tripmeapp.uicore.atoms.HeadingText
import com.antiglobalist.tripmeapp.uicore.atoms.PrimaryButton
import com.antiglobalist.tripmeapp.uicore.design.UiCoreTheme
import com.antiglobalist.tripmeapp.uicore.molecules.IconTextRow

import tripmeapp.apps.ui_core.generated.resources.Res
import tripmeapp.apps.ui_core.generated.resources.compose_multiplatform

@Composable
private fun sampleIcon(): Painter = painterResource(Res.drawable.compose_multiplatform)

@Preview
@Composable
fun UiCorePreview() {
    UiCoreTheme {
        Column(modifier = Modifier.fillMaxWidth()) {
            HeadingText("UiCore Preview")
            PrimaryButton(text = "Action", onClick = {})
            IconTextRow(icon = sampleIcon(), text = "Item")
        }
    }
}
