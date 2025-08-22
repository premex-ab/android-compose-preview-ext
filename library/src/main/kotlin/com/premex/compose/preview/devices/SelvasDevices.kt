package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Selvas device specifications for Android Compose previews.
 *
 * This extension provides Selvas device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Selvas.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Selvas get() = object {
    /** Selvas BrailleSense_EEA */
    val BRAILLESENSE_EEA = "spec:width=1080,height=1920,unit=px,dpi=280"

    /** Selvas BrailleSense Polaris */
    val BRAILLESENSE_POLARIS = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Selvas H620B */
    val H620B = "spec:width=1080,height=1920,unit=px,dpi=280"

}
