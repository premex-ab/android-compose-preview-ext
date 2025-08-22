package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vestel device specifications for Android Compose previews.
 *
 * This extension provides Vestel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vestel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vestel get() = object {
    /** Vestel 5000 */
    val _5000 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vestel 5530 */
    val _5530 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vestel Venus E2 Plus */
    val VENUS_E2_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vestel Venus E3 */
    val VENUS_E3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vestel Venus E4 */
    val VENUS_E4 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Vestel Venus E5 */
    val VENUS_E5 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Vestel Venus Go */
    val VENUS_GO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vestel venus_v3_5010 */
    val VENUS_V3_5010 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vestel Venus V3 5020 */
    val VENUS_V3_5020 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vestel Venus V3 5040 */
    val VENUS_V3_5040 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vestel Venus_V3_5040_2GB */
    val VENUS_V3_5040_2GB = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vestel Venus V3 5070 */
    val VENUS_V3_5070 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Vestel Venus V3 5570 */
    val VENUS_V3_5570 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Vestel Venus V3 5580 */
    val VENUS_V3_5580 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Vestel Venus_V4 */
    val VENUS_V4 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vestel Venus V5 */
    val VENUS_V5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vestel Venus V7 */
    val VENUS_V7 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Vestel Venus Z10 */
    val VENUS_Z10 = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Vestel Venus Z30 */
    val VENUS_Z30 = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** Vestel Venus Z40 */
    val VENUS_Z40 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Vestel Vestel_5000_2gb */
    val VESTEL_5000_2GB = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vestel Vestel Z20 */
    val VESTEL_Z20 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Vestel VTAB1050 */
    val VTAB1050 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Vestel V Tab 7010 */
    val V_TAB_7010 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Vestel V TAB 7020A */
    val V_TAB_7020A = "spec:width=720,height=1280,unit=px,dpi=240"

    /** Vestel V TAB 7810 */
    val V_TAB_7810 = "spec:width=768,height=1024,unit=px,dpi=160"

    /** Vestel V TAB Z1 */
    val V_TAB_Z1 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Vestel VTABZ1A */
    val VTABZ1A = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Vestel V TAB Z2 LTE */
    val V_TAB_Z2_LTE = "spec:width=1200,height=1920,unit=px,dpi=280"

}
