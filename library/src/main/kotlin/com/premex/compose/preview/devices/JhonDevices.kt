package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Jhon device specifications for Android Compose previews.
 *
 * This extension provides Jhon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Jhon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Jhon get() = object {
    /** Jhon H800 */
    val H800 = "spec:width=1080,height=1920,unit=px,dpi=240"

}
