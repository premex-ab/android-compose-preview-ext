package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mobell device specifications for Android Compose previews.
 *
 * This extension provides Mobell device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mobell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mobell get() = object {
    /** Mobell MBLTab81 */
    val MBLTAB81 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Mobell NOVA P3 */
    val NOVA_P3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Mobell P41 */
    val P41 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Mobell S41 */
    val S41 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Mobell S51 */
    val S51 = "spec:width=480,height=1014,unit=px,dpi=220"

    /** Mobell S61 */
    val S61 = "spec:width=720,height=1440,unit=px,dpi=320"

}
