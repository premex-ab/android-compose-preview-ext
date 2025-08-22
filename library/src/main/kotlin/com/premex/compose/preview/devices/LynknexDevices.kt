package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Lynknex device specifications for Android Compose previews.
 *
 * This extension provides Lynknex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Lynknex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Lynknex get() = object {
    /** Lynknex PX5 */
    val PX5 = "spec:width=720,height=1280,unit=px,dpi=320"

}
