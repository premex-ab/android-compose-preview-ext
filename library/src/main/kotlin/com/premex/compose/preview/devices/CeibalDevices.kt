package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ceibal device specifications for Android Compose previews.
 *
 * This extension provides Ceibal device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ceibal.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ceibal get() = object {
    /** Ceibal A102 */
    val A102 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ceibal ACRUX */
    val ACRUX = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ceibal Alfard */
    val ALFARD = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Ceibal BETELGEUSE */
    val BETELGEUSE = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ceibal CEIBAL_HFP_LT */
    val CEIBAL_HFP_LT = "spec:width=2160,height=3840,unit=px,dpi=420"

    /** Ceibal GACRUX */
    val GACRUX = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ceibal Ibirapita */
    val IBIRAPITA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ceibal Kil-82WFDC */
    val KIL_82WFDC = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ceibal RIGEL */
    val RIGEL = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Ceibal TC80RA1 */
    val TC80RA1 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ceibal TC80RA6 */
    val TC80RA6 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ceibal U800B */
    val U800B = "spec:width=800,height=1280,unit=px,dpi=213"

}
