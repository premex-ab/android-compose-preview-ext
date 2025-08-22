package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bkav device specifications for Android Compose previews.
 *
 * This extension provides Bkav device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bkav.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bkav get() = object {
    /** Bkav B2017 */
    val B2017 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Bkav Bphone B86 */
    val BPHONE_B86 = "spec:width=1080,height=2220,unit=px,dpi=440"

}
