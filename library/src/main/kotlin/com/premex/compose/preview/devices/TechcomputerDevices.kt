package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Techcomputer device specifications for Android Compose previews.
 *
 * This extension provides Techcomputer device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Techcomputer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Techcomputer get() = object {
    /** Techcomputer F102-T610-EEA */
    val F102_T610_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Techcomputer F102-T610-EEA-GG5 */
    val F102_T610_EEA_GG5 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Techcomputer F102-T618-EEA */
    val F102_T618_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Techcomputer TEC-M1310 */
    val TEC_M1310 = "spec:width=1440,height=2160,unit=px,dpi=240"

}
