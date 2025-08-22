package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cellallure device specifications for Android Compose previews.
 *
 * This extension provides Cellallure device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cellallure.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cellallure get() = object {
    /** Cellallure BIENESTAR_SMART */
    val BIENESTAR_SMART = "spec:width=480,height=960,unit=px,dpi=240"

    /** Cellallure Earn */
    val EARN = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Cellallure Fashion_C */
    val FASHION_C = "spec:width=480,height=960,unit=px,dpi=240"

    /** Cellallure Miracle_Y */
    val MIRACLE_Y = "spec:width=720,height=1520,unit=px,dpi=320"

}
