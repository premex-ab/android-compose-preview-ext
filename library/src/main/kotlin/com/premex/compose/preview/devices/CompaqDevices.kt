package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Compaq device specifications for Android Compose previews.
 *
 * This extension provides Compaq device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Compaq.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Compaq get() = object {
    /** Compaq CT101 */
    val CT101 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Compaq CT201 */
    val CT201 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Compaq CT211 */
    val CT211 = "spec:width=1080,height=1920,unit=px,dpi=213"

    /** Compaq Q5 */
    val Q5 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Compaq Q6 */
    val Q6 = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Compaq QT10 */
    val QT10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Compaq QTAB */
    val QTAB = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Compaq QTAB10_1 */
    val QTAB10_1 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Compaq QTab10.1_LTE  */
    val QTAB10_1_LTE = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Compaq Qtab 10.1 with keyboard */
    val QTAB_10_1_WITH_KEYBOARD = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Compaq QTAB10_PLUS */
    val QTAB10_PLUS = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Compaq Qtab10Plus */
    val QTAB10PLUS = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Compaq QTab8 */
    val QTAB8 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Compaq QTab8_LTE */
    val QTAB8_LTE = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Compaq QTAB_NOTE */
    val QTAB_NOTE = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Compaq QTabPro */
    val QTABPRO = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Compaq QTabPro */
    val QTABPRO_1200X2000 = "spec:width=1200,height=2000,unit=px,dpi=280"

}
