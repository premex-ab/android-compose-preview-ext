package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Rokit device specifications for Android Compose previews.
 *
 * This extension provides Rokit device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Rokit.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Rokit get() = object {
    /** Rokit dingo */
    val DINGO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Rokit IO Light */
    val IO_LIGHT = "spec:width=480,height=854,unit=px,dpi=240"

    /** Rokit IO Pro */
    val IO_PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Rokit Orb_S */
    val ORB_S = "spec:width=480,height=960,unit=px,dpi=240"

}
