package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vernee device specifications for Android Compose previews.
 *
 * This extension provides Vernee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vernee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vernee get() = object {
    /** Vernee Active */
    val ACTIVE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Vernee M3 */
    val M3 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Vernee M5 */
    val M5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vernee M6 */
    val M6 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Vernee M7_EEA */
    val M7_EEA = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Vernee M8 Pro */
    val M8_PRO = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** Vernee MIX 2 */
    val MIX_2 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Vernee T3 Pro */
    val T3_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Vernee Thor E */
    val THOR_E = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vernee Thor Plus */
    val THOR_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vernee V2 Pro */
    val V2_PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Vernee X1 */
    val X1 = "spec:width=1080,height=2160,unit=px,dpi=400"

    /** Vernee X2_euro */
    val X2_EURO = "spec:width=720,height=1440,unit=px,dpi=320"

}
