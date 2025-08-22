package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Greentel device specifications for Android Compose previews.
 *
 * This extension provides Greentel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Greentel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Greentel get() = object {
    /** Greentel A10_premium */
    val A10_PREMIUM = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Greentel A10Pro */
    val A10PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Greentel A8 */
    val A8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Greentel A9 */
    val A9 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Greentel Greentel-A10 */
    val GREENTEL_A10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Greentel Tab-X */
    val TAB_X = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Greentel V2 */
    val V2 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Greentel X1_Light_Lte */
    val X1_LIGHT_LTE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Greentel X2 */
    val X2 = "spec:width=720,height=1280,unit=px,dpi=300"

    /** Greentel X MAX */
    val X_MAX = "spec:width=480,height=800,unit=px,dpi=240"

}
