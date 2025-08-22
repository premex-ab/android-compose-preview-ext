package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Olympia device specifications for Android Compose previews.
 *
 * This extension provides Olympia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Olympia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Olympia get() = object {
    /** Olympia NEO */
    val NEO = "spec:width=480,height=960,unit=px,dpi=240"

    /** Olympia NEO_Mini */
    val NEO_MINI = "spec:width=480,height=854,unit=px,dpi=240"

    /** Olympia TREK */
    val TREK = "spec:width=720,height=1440,unit=px,dpi=320"

}
