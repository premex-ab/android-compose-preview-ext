package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Onn device specifications for Android Compose previews.
 *
 * This extension provides Onn device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Onn.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Onn get() = object {
    /** Onn 100003562 */
    val _100003562 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Onn 100011885 */
    val _100011885 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Onn 100011886 */
    val _100011886 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Onn 100015685-A */
    val _100015685_A = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Onn 	100044018 */
    val _100044018 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Onn 100044018G */
    val _100044018G = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Onn 100044018P */
    val _100044018P = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Onn 100071481A */
    val _100071481A = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Onn 100071483 */
    val _100071483 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Onn 100071483A */
    val _100071483A = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Onn 100071485 */
    val _100071485 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Onn 100071485A */
    val _100071485A = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Onn 100071486 */
    val _100071486 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Onn 100092980 */
    val _100092980 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Onn 100092980A */
    val _100092980A = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Onn 100110027 */
    val _100110027 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Onn 100135794  */
    val _100135794 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Onn 100135920 */
    val _100135920 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Onn 100135924 */
    val _100135924 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Onn 10.4“ Tablet Pro */
    val _10_4_TABLET_PRO = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Onn M17QF21W */
    val M17QF21W = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Onn MID8016 */
    val MID8016 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Onn 	onn_100003561 */
    val ONN_100003561 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Onn onn. 11  Tablet Pro */
    val ONN_11_TABLET_PRO = "spec:width=1280,height=1840,unit=px,dpi=280"

    /** Onn onn. 12 Tablet  Pro  */
    val ONN_12_TABLET_PRO = "spec:width=1600,height=2560,unit=px,dpi=280"

    /** Onn PM1042T-W */
    val PM1042T_W = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Onn Tablet Gen 4 */
    val TABLET_GEN_4 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Onn Tablet Gen 4 */
    val TABLET_GEN_4_800X1280 = "spec:width=800,height=1280,unit=px,dpi=180"

}
