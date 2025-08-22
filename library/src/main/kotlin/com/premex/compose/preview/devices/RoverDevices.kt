package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Rover device specifications for Android Compose previews.
 *
 * This extension provides Rover device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Rover.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Rover get() = object {
    /** Rover CHIPPY */
    val CHIPPY = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Rover R10_M */
    val R10_M = "spec:width=800,height=1280,unit=px,dpi=220"

    /** Rover R8 */
    val R8 = "spec:width=800,height=1280,unit=px,dpi=220"

}
