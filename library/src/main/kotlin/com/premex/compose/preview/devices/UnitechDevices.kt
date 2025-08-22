package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Unitech device specifications for Android Compose previews.
 *
 * This extension provides Unitech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Unitech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Unitech get() = object {
    /** Unitech EA320 */
    val EA320 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Unitech EA500Plus */
    val EA500PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Unitech EA510 */
    val EA510 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Unitech EA520 */
    val EA520 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Unitech EA520_US */
    val EA520_US = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Unitech EA630 */
    val EA630 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Unitech EA630_Plus */
    val EA630_PLUS = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Unitech EA660 */
    val EA660 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Unitech HT330 */
    val HT330 = "spec:width=480,height=800,unit=px,dpi=220"

    /** Unitech HT730 */
    val HT730 = "spec:width=480,height=800,unit=px,dpi=160"

    /** Unitech PA760 */
    val PA760 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Unitech PA768e */
    val PA768E = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Unitech RT112 */
    val RT112 = "spec:width=1200,height=1920,unit=px,dpi=340"

    /** Unitech TB85 */
    val TB85 = "spec:width=800,height=1280,unit=px,dpi=320"

    /** Unitech TB85Plus */
    val TB85PLUS = "spec:width=800,height=1280,unit=px,dpi=320"

    /** Unitech WD200 */
    val WD200 = "spec:width=480,height=800,unit=px,dpi=240"

}
