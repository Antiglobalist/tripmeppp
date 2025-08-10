package com.antiglobalist.tripmeapp.uicore.molecules

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.antiglobalist.tripmeapp.uicore.design.UiCoreTheme
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import tripmeapp.apps.ui_core.generated.resources.Res
import tripmeapp.apps.ui_core.generated.resources.compose_multiplatform

/** Molecule: row with icon and text */
@Composable
fun IconTextRow(
    icon: Painter,
    text: String,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier.padding(8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Icon(painter = icon, contentDescription = null, tint = MaterialTheme.colorScheme.onSurface)
        Text(text = text, color = MaterialTheme.colorScheme.onSurface)
    }
}

@Preview
@Composable
private fun IconTextRowPreview() {
    UiCoreTheme {
        IconTextRow(
            icon = painterResource(Res.drawable.compose_multiplatform),
            text = "Preview item",
        )
    }
}
