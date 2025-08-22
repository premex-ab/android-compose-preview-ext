package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Beafon device specifications for Android Compose previews.
 *
 * This extension provides Beafon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Beafon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Beafon get() = object {
    /** Beafon Class_C250 */
    val CLASS_C250 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Beafon M5 */
    val M5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Beafon M6s */
    val M6S = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Beafon M7 */
    val M7 = "spec:width=720,height=1440,unit=px,dpi=280"

    /** Beafon M7 Lite */
    val M7_LITE = "spec:width=720,height=1440,unit=px,dpi=280"

    /** Beafon MX1 */
    val MX1 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Beafon TL20 */
    val TL20 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Beafon TW10 */
    val TW10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Beafon  TW20_EEA  */
    val TW20_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

}
