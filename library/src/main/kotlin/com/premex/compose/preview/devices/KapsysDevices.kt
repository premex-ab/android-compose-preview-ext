package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kapsys device specifications for Android Compose previews.
 *
 * This extension provides Kapsys device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kapsys.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kapsys get() = object {
    /** Kapsys SmartVision2 */
    val SMARTVISION2 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Kapsys SmartVision3 */
    val SMARTVISION3 = "spec:width=640,height=960,unit=px,dpi=260"

}
