package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hometech device specifications for Android Compose previews.
 *
 * This extension provides Hometech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hometech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hometech get() = object {
    /** Hometech 7_PREMIUM_PRO */
    val _7_PREMIUM_PRO = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Hometech ALFA_10BS */
    val ALFA_10BS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hometech ALFA_10BT */
    val ALFA_10BT = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Hometech ALFA_10BT_V2 */
    val ALFA_10BT_V2 = "spec:width=1200,height=2000,unit=px,dpi=340"

    /** Hometech Alfa10LT */
    val ALFA10LT = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Hometech ALFA10MX */
    val ALFA10MX = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hometech ALFA10TB */
    val ALFA10TB = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hometech 	ALFA10TX */
    val ALFA10TX = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hometech ALFA10TX_PRO */
    val ALFA10TX_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hometech ALFA_10YC */
    val ALFA_10YC = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hometech Alfa_11_BT */
    val ALFA_11_BT = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Hometech Alfa_12_GX_Pro */
    val ALFA_12_GX_PRO = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Hometech ALFA_7M */
    val ALFA_7M = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Hometech ALFA_8SL */
    val ALFA_8SL = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hometech ALFA_8ST */
    val ALFA_8ST = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hometech ALFA_8TX */
    val ALFA_8TX = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Hometech HOMETECH */
    val HOMETECH = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Hometech HT_8MZ */
    val HT_8MZ = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hometech MID1032_MR */
    val MID1032_MR = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hometech Turkey */
    val TURKEY = "spec:width=600,height=1024,unit=px,dpi=160"

}
