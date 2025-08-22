package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Gtide device specifications for Android Compose previews.
 *
 * This extension provides Gtide device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Gtide.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Gtide get() = object {
    /** Gtide G-TiDE_H1_1 */
    val G_TIDE_H1_1 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Gtide G-TiDE_H1_2 */
    val G_TIDE_H1_2 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Gtide G-TiDE_H1_3 */
    val G_TIDE_H1_3 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Gtide G-TiDE_H1_4 */
    val G_TIDE_H1_4 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Gtide G-TiDE_H1_4G */
    val G_TIDE_H1_4G = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Gtide G-TiDE_P1_2 */
    val G_TIDE_P1_2 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Gtide G-TiDE_P1_4G */
    val G_TIDE_P1_4G = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Gtide H2R */
    val H2R = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Gtide Klap_S1 */
    val KLAP_S1 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Gtide Klap_S1_EEA */
    val KLAP_S1_EEA = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Gtide Zeal1 */
    val ZEAL1 = "spec:width=1200,height=1920,unit=px,dpi=320"

}
