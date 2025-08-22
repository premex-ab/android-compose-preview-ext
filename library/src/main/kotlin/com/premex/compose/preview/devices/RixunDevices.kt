package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Rixun device specifications for Android Compose previews.
 *
 * This extension provides Rixun device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Rixun.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Rixun get() = object {
    /** Rixun T107 */
    val T107 = "spec:width=1200,height=1920,unit=px,dpi=240"

}
