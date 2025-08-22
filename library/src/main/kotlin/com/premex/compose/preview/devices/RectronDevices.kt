package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Rectron device specifications for Android Compose previews.
 *
 * This extension provides Rectron device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Rectron.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Rectron get() = object {
    /** Rectron MX101M2 */
    val MX101M2 = "spec:width=800,height=1280,unit=px,dpi=213"

}
