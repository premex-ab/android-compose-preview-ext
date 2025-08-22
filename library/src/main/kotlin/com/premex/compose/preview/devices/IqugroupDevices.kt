package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Iqugroup device specifications for Android Compose previews.
 *
 * This extension provides Iqugroup device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Iqugroup.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Iqugroup get() = object {
    /** Iqugroup IQUSMARTEASYT8W */
    val IQUSMARTEASYT8W = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Iqugroup SMARTEasy_Q50 */
    val SMARTEASY_Q50 = "spec:width=480,height=960,unit=px,dpi=240"

}
