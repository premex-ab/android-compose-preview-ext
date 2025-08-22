package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Alco device specifications for Android Compose previews.
 *
 * This extension provides Alco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Alco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Alco get() = object {
    /** Alco Alco S9 */
    val ALCO_S9 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Alco RCT6613W23PG */
    val RCT6613W23PG = "spec:width=768,height=1366,unit=px,dpi=160"

    /** Alco VCT9B06Q23EU_eea */
    val VCT9B06Q23EU_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Alco VCT9T48Q34 */
    val VCT9T48Q34 = "spec:width=1080,height=1920,unit=px,dpi=213"

    /** Alco Voyager Pro */
    val VOYAGER_PRO = "spec:width=600,height=1024,unit=px,dpi=160"

}
