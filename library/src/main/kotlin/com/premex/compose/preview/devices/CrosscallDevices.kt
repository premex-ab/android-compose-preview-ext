package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Crosscall device specifications for Android Compose previews.
 *
 * This extension provides Crosscall device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Crosscall.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Crosscall get() = object {
    /** Crosscall Action-X3 */
    val ACTION_X3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Crosscall Action-X5 */
    val ACTION_X5 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Crosscall CORE-M4 */
    val CORE_M4 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Crosscall CORE-M4 GO */
    val CORE_M4_GO = "spec:width=480,height=960,unit=px,dpi=240"

    /** Crosscall Core-M5 */
    val CORE_M5 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Crosscall Core-T4 */
    val CORE_T4 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Crosscall Core-T5 */
    val CORE_T5 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Crosscall Core- X3 */
    val CORE_X3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Crosscall Core-X4 */
    val CORE_X4 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Crosscall Core-X5 */
    val CORE_X5 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Crosscall Core-Z5 */
    val CORE_Z5 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Crosscall Stellar-M6 */
    val STELLAR_M6 = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Crosscall Stellar-X5 */
    val STELLAR_X5 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Crosscall Trekker- M1 */
    val TREKKER_M1 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Crosscall TREKKER-M1 CORE */
    val TREKKER_M1_CORE = "spec:width=480,height=854,unit=px,dpi=240"

    /** Crosscall TREKKER- X3 */
    val TREKKER_X3 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Crosscall Trekker- X4 */
    val TREKKER_X4 = "spec:width=1080,height=1920,unit=px,dpi=480"

}
