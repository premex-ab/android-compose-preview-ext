package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Venturer device specifications for Android Compose previews.
 *
 * This extension provides Venturer device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Venturer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Venturer get() = object {
    /** Venturer CT9A06P23_eea */
    val CT9A06P23_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Venturer Mariner 10 Pro */
    val MARINER_10_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Venturer VCT9B06Q22_eea */
    val VCT9B06Q22_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Venturer VCT9B06Q23 */
    val VCT9B06Q23 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Venturer VCT9F0A68R23EU */
    val VCT9F0A68R23EU = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Venturer VCT9F78Q22 */
    val VCT9F78Q22 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Venturer VCT9F78Q22-A0 */
    val VCT9F78Q22_A0 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Venturer VCT9F78Q22-A1 */
    val VCT9F78Q22_A1 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Venturer VCT9F78Q22-E */
    val VCT9F78Q22_E = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Venturer VCT9F78Q22EU_eea */
    val VCT9F78Q22EU_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Venturer VCT9F8A68RD */
    val VCT9F8A68RD = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Venturer VCT9T48Q34EU_eea */
    val VCT9T48Q34EU_EEA = "spec:width=1080,height=1920,unit=px,dpi=213"

}
