package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Baken device specifications for Android Compose previews.
 *
 * This extension provides Baken device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Baken.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Baken get() = object {
    /** Baken M10 */
    val M10 = "spec:width=800,height=1280,unit=px,dpi=160"

}
