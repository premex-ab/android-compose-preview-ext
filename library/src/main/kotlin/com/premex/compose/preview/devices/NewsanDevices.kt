package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Newsan device specifications for Android Compose previews.
 *
 * This extension provides Newsan device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Newsan.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Newsan get() = object {
    /** Newsan N405 */
    val N405 = "spec:width=480,height=800,unit=px,dpi=240"

}
