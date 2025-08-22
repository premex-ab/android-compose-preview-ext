package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Famousfones device specifications for Android Compose previews.
 *
 * This extension provides Famousfones device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Famousfones.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Famousfones get() = object {
    /** Famousfones Famous_5 */
    val FAMOUS_5 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Famousfones Famous_5Plus */
    val FAMOUS_5PLUS = "spec:width=480,height=960,unit=px,dpi=240"

    /** Famousfones Famous Red 5+ */
    val FAMOUS_RED_5 = "spec:width=720,height=1498,unit=px,dpi=320"

    /** Famousfones Famous_TAB_10 */
    val FAMOUS_TAB_10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Famousfones Fonos-O1 */
    val FONOS_O1 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Famousfones Red_Royal_Edition */
    val RED_ROYAL_EDITION = "spec:width=720,height=1440,unit=px,dpi=320"

}
