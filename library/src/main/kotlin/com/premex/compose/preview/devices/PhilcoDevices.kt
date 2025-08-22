package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Philco device specifications for Android Compose previews.
 *
 * This extension provides Philco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Philco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Philco get() = object {
    /** Philco Hit Max */
    val HIT_MAX = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Philco Hit P10 */
    val HIT_P10 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Philco HIT P10a */
    val HIT_P10A = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Philco Hit P12 */
    val HIT_P12 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Philco HIT_P8 */
    val HIT_P8 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Philco P13 */
    val P13 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Philco PCS01 */
    val PCS01 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Philco PCS02 */
    val PCS02 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Philco PHILCO_TP7A6 */
    val PHILCO_TP7A6 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Philco PTB7PAP_ PTB7PAB _ PTB7PAR */
    val PTB7PAP_PTB7PAB_PTB7PAR = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Philco PTB7QSG_3G */
    val PTB7QSG_3G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Philco PTB7R */
    val PTB7R = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Philco PTB8R */
    val PTB8R = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Philco PTB8R4G */
    val PTB8R4G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Philco TP10A332 */
    val TP10A332 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Philco TP10A3N */
    val TP10A3N = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Philco TP10A464 */
    val TP10A464 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Philco TP10F */
    val TP10F = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Philco TP7A464 */
    val TP7A464 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Philco TP7A4N */
    val TP7A4N = "spec:width=600,height=1024,unit=px,dpi=160"

}
