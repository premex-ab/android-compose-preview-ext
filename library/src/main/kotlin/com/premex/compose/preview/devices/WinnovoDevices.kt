package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Winnovo device specifications for Android Compose previews.
 *
 * This extension provides Winnovo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Winnovo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Winnovo get() = object {
    /** Winnovo H10 */
    val H10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Winnovo H10Pro_eea */
    val H10PRO_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Winnovo H10_US */
    val H10_US = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Winnovo H7 */
    val H7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Winnovo H7_US */
    val H7_US = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Winnovo H8 */
    val H8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Winnovo H8_US */
    val H8_US = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Winnovo P20-Tab */
    val P20_TAB = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Winnovo T10 */
    val T10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Winnovo T10LTE_eea */
    val T10LTE_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Winnovo T7_eea */
    val T7_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Winnovo T8 */
    val T8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Winnovo TS10 */
    val TS10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Winnovo TS10_EEA */
    val TS10_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Winnovo TS7 */
    val TS7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Winnovo Winnovo */
    val WINNOVO = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Winnovo WinnovoT5 */
    val WINNOVOT5 = "spec:width=1200,height=1920,unit=px,dpi=320"

}
