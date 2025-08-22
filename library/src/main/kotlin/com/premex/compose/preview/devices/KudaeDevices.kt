package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kudae device specifications for Android Compose previews.
 *
 * This extension provides Kudae device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kudae.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kudae get() = object {
    /** Kudae K10 */
    val K10 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Kudae K101 */
    val K101 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Kudae K10 PRO */
    val K10_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

}
