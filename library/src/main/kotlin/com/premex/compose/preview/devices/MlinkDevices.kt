package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mlink device specifications for Android Compose previews.
 *
 * This extension provides Mlink device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mlink.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mlink get() = object {
    /** Mlink M6501B */
    val M6501B = "spec:width=540,height=1200,unit=px,dpi=240"

    /** Mlink M761 */
    val M761 = "spec:width=720,height=1520,unit=px,dpi=260"

}
