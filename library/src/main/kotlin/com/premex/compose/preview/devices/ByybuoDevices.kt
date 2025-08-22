package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Byybuo device specifications for Android Compose previews.
 *
 * This extension provides Byybuo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Byybuo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Byybuo get() = object {
    /** Byybuo A10_EU */
    val A10_EU = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Byybuo A10_L */
    val A10_L = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Byybuo BYYBUO_SmartPad_A10 */
    val BYYBUO_SMARTPAD_A10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Byybuo BYYBUO_SmartPad_T10 */
    val BYYBUO_SMARTPAD_T10 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Byybuo SmartPad_A10_EU */
    val SMARTPAD_A10_EU = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Byybuo SmartPad_A10_L */
    val SMARTPAD_A10_L = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Byybuo SmartPad_A70W */
    val SMARTPAD_A70W = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Byybuo SmartPad_A70W_EU */
    val SMARTPAD_A70W_EU = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Byybuo SmartPad_K7 */
    val SMARTPAD_K7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Byybuo SmartPad_K7_EU */
    val SMARTPAD_K7_EU = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Byybuo SmartPad_T10_EU */
    val SMARTPAD_T10_EU = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Byybuo SmartPad_T20 */
    val SMARTPAD_T20 = "spec:width=800,height=1280,unit=px,dpi=200"

}
