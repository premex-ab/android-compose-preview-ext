package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Laiq device specifications for Android Compose previews.
 *
 * This extension provides Laiq device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Laiq.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Laiq get() = object {
    /** Laiq GLAM */
    val GLAM = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Laiq STARTRAIL 8 */
    val STARTRAIL_8 = "spec:width=720,height=1280,unit=px,dpi=320"

}
