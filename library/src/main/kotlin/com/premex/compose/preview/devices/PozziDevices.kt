package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Pozzi device specifications for Android Compose previews.
 *
 * This extension provides Pozzi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Pozzi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Pozzi get() = object {
    /** Pozzi Pozzi Neo 1 */
    val POZZI_NEO_1 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Pozzi Turbo */
    val TURBO = "spec:width=720,height=1600,unit=px,dpi=220"

}
