package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Koobee device specifications for Android Compose previews.
 *
 * This extension provides Koobee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Koobee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Koobee get() = object {
    /** Koobee F2 */
    val F2 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Koobee F2 Plus */
    val F2_PLUS = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** Koobee K20 */
    val K20 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Koobee koobee_K10 */
    val KOOBEE_K10 = "spec:width=720,height=1500,unit=px,dpi=320"

    /** Koobee Koobee_K100 */
    val KOOBEE_K100 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Koobee Koobee K60 */
    val KOOBEE_K60 = "spec:width=1080,height=2244,unit=px,dpi=480"

    /** Koobee koobee_S12 */
    val KOOBEE_S12 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Koobee S16 */
    val S16 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Koobee S19 */
    val S19 = "spec:width=720,height=1560,unit=px,dpi=320"

}
