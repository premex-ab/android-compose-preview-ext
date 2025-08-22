package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kalley device specifications for Android Compose previews.
 *
 * This extension provides Kalley device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kalley.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kalley get() = object {
    /** Kalley Black */
    val BLACK = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Kalley Black 1 */
    val BLACK_1 = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Kalley Black_3CR */
    val BLACK_3CR = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Kalley Black_5 */
    val BLACK_5 = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Kalley Black_C_Plus */
    val BLACK_C_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Kalley Black_E */
    val BLACK_E = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Kalley Black G */
    val BLACK_G = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Kalley Black_G_2 */
    val BLACK_G_2 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Kalley Black G3 */
    val BLACK_G3 = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Kalley BLACK_PRO */
    val BLACK_PRO = "spec:width=720,height=1500,unit=px,dpi=320"

    /** Kalley Black_X */
    val BLACK_X = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Kalley Black_Z */
    val BLACK_Z = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Kalley Element 4 Plus */
    val ELEMENT_4_PLUS = "spec:width=480,height=800,unit=px,dpi=240"

    /** Kalley Element 5 Plus */
    val ELEMENT_5_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

    /** Kalley ELEMENT MAX */
    val ELEMENT_MAX = "spec:width=480,height=996,unit=px,dpi=240"

    /** Kalley Element Play */
    val ELEMENT_PLAY = "spec:width=480,height=960,unit=px,dpi=240"

    /** Kalley ELEMENT_PRO_2 */
    val ELEMENT_PRO_2 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Kalley SILVER_MAX */
    val SILVER_MAX = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Kalley Silver Max Lite */
    val SILVER_MAX_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Kalley 	Silver Max Pro */
    val SILVER_MAX_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Kalley Silver_Max_Pro_2 */
    val SILVER_MAX_PRO_2 = "spec:width=720,height=1600,unit=px,dpi=320"

}
