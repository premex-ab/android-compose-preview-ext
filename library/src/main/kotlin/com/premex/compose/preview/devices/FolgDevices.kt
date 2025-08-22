package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Folg device specifications for Android Compose previews.
 *
 * This extension provides Folg device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Folg.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Folg get() = object {
    /** Folg FOLG_GT_10 */
    val FOLG_GT_10 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Folg FOLG_Tab_10s */
    val FOLG_TAB_10S = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Folg FT01 */
    val FT01 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Folg  FT02  */
    val FT02 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Folg KS20 */
    val KS20 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Folg S18 */
    val S18 = "spec:width=1200,height=1920,unit=px,dpi=360"

    /** Folg S19 */
    val S19 = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Folg S20 */
    val S20 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Folg S30 */
    val S30 = "spec:width=1200,height=1920,unit=px,dpi=320"

}
