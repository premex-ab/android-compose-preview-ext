package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Noamobile device specifications for Android Compose previews.
 *
 * This extension provides Noamobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Noamobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Noamobile get() = object {
    /** Noamobile Fresh 4G */
    val FRESH_4G = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Noamobile Hummer_2019_R */
    val HUMMER_2019_R = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Noamobile N1 */
    val N1 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Noamobile N10 */
    val N10 = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** Noamobile N7 */
    val N7 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Noamobile N8 */
    val N8 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Noamobile NOA_N20 */
    val NOA_N20 = "spec:width=1080,height=2280,unit=px,dpi=480"

    /** Noamobile NOA_P1 */
    val NOA_P1 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Noamobile SPRINT 4G */
    val SPRINT_4G = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Noamobile Vivo 4G_r */
    val VIVO_4G_R = "spec:width=640,height=1280,unit=px,dpi=320"

}
