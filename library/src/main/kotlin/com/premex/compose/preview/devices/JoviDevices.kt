package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Jovi device specifications for Android Compose previews.
 *
 * This extension provides Jovi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Jovi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Jovi get() = object {
    /** Jovi JOVI V50 Lite 5G */
    val JOVI_V50_LITE_5G = "spec:width=1080,height=2392,unit=px,dpi=440"

    /** Jovi JOVI Y19s */
    val JOVI_Y19S = "spec:width=720,height=1608,unit=px,dpi=300"

    /** Jovi JOVI Y29 */
    val JOVI_Y29 = "spec:width=720,height=1608,unit=px,dpi=300"

    /** Jovi V50 */
    val V50 = "spec:width=1080,height=2392,unit=px,dpi=440"

}
