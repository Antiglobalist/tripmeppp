package com.antiglobalist.tripmeapp.uicore.atoms

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.antiglobalist.tripmeapp.uicore.design.ColorTokens

/** Primary button atom */
@Composable
fun PrimaryButton(
    text: String,
    enabled: Boolean = true,
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
        enabled = enabled,
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = ColorTokens.Primary,
            contentColor = ColorTokens.OnPrimary,
            disabledContainerColor = ColorTokens.Primary.copy(alpha = 0.5f),
            disabledContentColor = ColorTokens.OnPrimary.copy(alpha = 0.7f),
        )
    ) {
        Text(text = text, fontWeight = FontWeight.SemiBold)
    }
}
