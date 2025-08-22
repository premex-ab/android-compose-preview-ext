package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Astrex device specifications for Android Compose previews.
 *
 * This extension provides Astrex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Astrex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Astrex get() = object {
    /** Astrex VegaPro */
    val VEGAPRO = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Astrex Victory */
    val VICTORY = "spec:width=800,height=1280,unit=px,dpi=160"

}
