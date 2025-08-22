package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vtex device specifications for Android Compose previews.
 *
 * This extension provides Vtex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vtex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vtex get() = object {
    /** Vtex MT8768 */
    val MT8768 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Vtex VK102W */
    val VK102W = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Vtex 	VK802W */
    val VK802W = "spec:width=800,height=1280,unit=px,dpi=188"

}
