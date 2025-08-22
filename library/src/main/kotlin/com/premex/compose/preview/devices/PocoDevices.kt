package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Poco device specifications for Android Compose previews.
 *
 * This extension provides Poco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Poco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Poco get() = object {
    /** Poco POCO C31 */
    val POCO_C31 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Poco POCO C50 */
    val POCO_C50 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Poco POCO C51 */
    val POCO_C51 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Poco POCO C55 */
    val POCO_C55 = "spec:width=720,height=1650,unit=px,dpi=320"

    /** Poco POCO C61 */
    val POCO_C61 = "spec:width=720,height=1650,unit=px,dpi=320"

    /** Poco POCO C65 */
    val POCO_C65 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Poco POCO C71 */
    val POCO_C71 = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Poco POCO C75 */
    val POCO_C75 = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Poco POCO C75 5G */
    val POCO_C75_5G = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Poco POCO F2 Pro */
    val POCO_F2_PRO = "spec:width=1080,height=2400,unit=px,dpi=440"

    /** Poco POCO F3 */
    val POCO_F3 = "spec:width=1080,height=2400,unit=px,dpi=440"

    /** Poco POCO F3 GT */
    val POCO_F3_GT = "spec:width=1080,height=2400,unit=px,dpi=440"

    /** Poco POCO F4 */
    val POCO_F4 = "spec:width=1080,height=2400,unit=px,dpi=440"

    /** Poco POCO F4 GT */
    val POCO_F4_GT = "spec:width=1080,height=2400,unit=px,dpi=440"

    /** Poco POCO F5 */
    val POCO_F5 = "spec:width=1080,height=2400,unit=px,dpi=440"

    /** Poco POCO F6 */
    val POCO_F6 = "spec:width=1220,height=2712,unit=px,dpi=480"

    /** Poco POCO F6 Pro */
    val POCO_F6_PRO = "spec:width=1440,height=3200,unit=px,dpi=560"

    /** Poco Poco F7 */
    val POCO_F7 = "spec:width=1280,height=2772,unit=px,dpi=520"

    /** Poco Poco F7 Pro */
    val POCO_F7_PRO = "spec:width=1440,height=3200,unit=px,dpi=600"

    /** Poco Poco F7 Ultra */
    val POCO_F7_ULTRA = "spec:width=1080,height=2400,unit=px,dpi=600"

    /** Poco POCO M2 */
    val POCO_M2 = "spec:width=1080,height=2340,unit=px,dpi=440"

    /** Poco POCO M2 Pro */
    val POCO_M2_PRO = "spec:width=1080,height=2400,unit=px,dpi=440"

    /** Poco POCO M3 */
    val POCO_M3 = "spec:width=1080,height=2340,unit=px,dpi=440"

    /** Poco POCO M3 Pro 5G */
    val POCO_M3_PRO_5G = "spec:width=1080,height=2400,unit=px,dpi=440"

    /** Poco POCO M4 5G */
    val POCO_M4_5G = "spec:width=1080,height=2408,unit=px,dpi=440"

    /** Poco POCO M4 Pro */
    val POCO_M4_PRO = "spec:width=1080,height=2400,unit=px,dpi=440"

    /** Poco POCO M4 Pro 5G */
    val POCO_M4_PRO_5G = "spec:width=1080,height=2400,unit=px,dpi=440"

    /** Poco POCO M5 */
    val POCO_M5 = "spec:width=1080,height=2408,unit=px,dpi=440"

    /** Poco POCO M6 */
    val POCO_M6 = "spec:width=1080,height=2460,unit=px,dpi=440"

    /** Poco POCO M6 Plus 5G */
    val POCO_M6_PLUS_5G = "spec:width=1080,height=2460,unit=px,dpi=440"

    /** Poco POCO M6 Pro */
    val POCO_M6_PRO = "spec:width=1080,height=2400,unit=px,dpi=440"

    /** Poco POCO M6 Pro 5G */
    val POCO_M6_PRO_5G = "spec:width=1080,height=2460,unit=px,dpi=440"

    /** Poco POCO M7 5G */
    val POCO_M7_5G = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Poco Poco M7 Pro 5G */
    val POCO_M7_PRO_5G = "spec:width=1080,height=2400,unit=px,dpi=450"

    /** Poco POCO Pad */
    val POCO_PAD = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Poco POCO X2 */
    val POCO_X2 = "spec:width=1080,height=2400,unit=px,dpi=440"

    /** Poco POCO X3 */
    val POCO_X3 = "spec:width=1080,height=2400,unit=px,dpi=440"

    /** Poco POCO X3 NFC */
    val POCO_X3_NFC = "spec:width=1080,height=2400,unit=px,dpi=440"

    /** Poco POCO X3 Pro */
    val POCO_X3_PRO = "spec:width=1080,height=2400,unit=px,dpi=440"

    /** Poco POCO X4 GT */
    val POCO_X4_GT = "spec:width=1080,height=2460,unit=px,dpi=440"

    /** Poco POCO X4 Pro 5G */
    val POCO_X4_PRO_5G = "spec:width=1080,height=2400,unit=px,dpi=440"

    /** Poco POCO X5 Pro 5G */
    val POCO_X5_PRO_5G = "spec:width=1080,height=2400,unit=px,dpi=440"

    /** Poco POCO X6 5G */
    val POCO_X6_5G = "spec:width=1220,height=2712,unit=px,dpi=480"

    /** Poco POCO X6 Pro 5G */
    val POCO_X6_PRO_5G = "spec:width=1220,height=2712,unit=px,dpi=480"

    /** Poco POCO X7 */
    val POCO_X7 = "spec:width=1220,height=2712,unit=px,dpi=520"

    /** Poco POCO X7 Pro  */
    val POCO_X7_PRO = "spec:width=1220,height=2712,unit=px,dpi=520"

}
