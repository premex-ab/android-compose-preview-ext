package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zinox device specifications for Android Compose previews.
 *
 * This extension provides Zinox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zinox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zinox get() = object {
    /** Zinox Zpad-X8 */
    val ZPAD_X8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Zinox Zpad-X8-PRO */
    val ZPAD_X8_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

}
