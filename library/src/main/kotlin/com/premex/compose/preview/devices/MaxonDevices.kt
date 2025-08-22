package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Maxon device specifications for Android Compose previews.
 *
 * This extension provides Maxon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Maxon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Maxon get() = object {
    /** Maxon MAXON_MX4 */
    val MAXON_MX4 = "spec:width=480,height=800,unit=px,dpi=220"

    /** Maxon MAXON_MX70PRO */
    val MAXON_MX70PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Maxon MX50 */
    val MX50 = "spec:width=480,height=960,unit=px,dpi=240"

}
