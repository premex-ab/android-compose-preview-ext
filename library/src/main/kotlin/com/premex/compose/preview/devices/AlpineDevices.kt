package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Alpine device specifications for Android Compose previews.
 *
 * This extension provides Alpine device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Alpine.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Alpine get() = object {
    /** Alpine INE-AX809 */
    val INE_AX809 = "spec:width=720,height=1280,unit=px,dpi=160"

    /** Alpine Intelligent vehicle network system */
    val INTELLIGENT_VEHICLE_NETWORK_SYSTEM = "spec:width=720,height=1280,unit=px,dpi=160"

}
