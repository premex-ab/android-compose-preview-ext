package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Conquest device specifications for Android Compose previews.
 *
 * This extension provides Conquest device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Conquest.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Conquest get() = object {
    /** Conquest Conquest-F5 */
    val CONQUEST_F5 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Conquest CONQUEST S12Pro */
    val CONQUEST_S12PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Conquest conquest_S16 */
    val CONQUEST_S16 = "spec:width=1080,height=2280,unit=px,dpi=480"

    /** Conquest conquest_S20_EEA */
    val CONQUEST_S20_EEA = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Conquest conquest-S20_RU */
    val CONQUEST_S20_RU = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Conquest CONQUEST-S23 */
    val CONQUEST_S23 = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Conquest S21_RU */
    val S21_RU = "spec:width=1080,height=2160,unit=px,dpi=480"

}
