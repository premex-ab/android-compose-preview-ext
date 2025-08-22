package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mobiistar device specifications for Android Compose previews.
 *
 * This extension provides Mobiistar device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mobiistar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mobiistar get() = object {
    /** Mobiistar C1 Lite */
    val C1_LITE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Mobiistar LAI Zumbo S 2017 Lite */
    val LAI_ZUMBO_S_2017_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Mobiistar mobiistar C1 */
    val MOBIISTAR_C1 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Mobiistar mobiistar C1 Shine */
    val MOBIISTAR_C1_SHINE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Mobiistar mobiistar C2 */
    val MOBIISTAR_C2 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Mobiistar mobiistar E1 Selfie */
    val MOBIISTAR_E1_SELFIE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Mobiistar mobiistar E Selfie */
    val MOBIISTAR_E_SELFIE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Mobiistar mobiistar X */
    val MOBIISTAR_X = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Mobiistar X1 Dual */
    val X1_DUAL = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Mobiistar X1 Notch */
    val X1_NOTCH = "spec:width=720,height=1498,unit=px,dpi=320"

    /** Mobiistar X1 Selfie */
    val X1_SELFIE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Mobiistar XQ Dual */
    val XQ_DUAL = "spec:width=1080,height=1920,unit=px,dpi=480"

}
