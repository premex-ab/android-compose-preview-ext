package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Scientia device specifications for Android Compose previews.
 *
 * This extension provides Scientia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Scientia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Scientia get() = object {
    /** Scientia BBT1019863 */
    val BBT1019863 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Scientia eWs10164T */
    val EWS10164T = "spec:width=1200,height=1920,unit=px,dpi=280"

}
