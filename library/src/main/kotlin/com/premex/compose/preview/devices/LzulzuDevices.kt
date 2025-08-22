package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Lzulzu device specifications for Android Compose previews.
 *
 * This extension provides Lzulzu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Lzulzu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Lzulzu get() = object {
    /** Lzulzu D113 */
    val D113 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Lzulzu D113_EEA */
    val D113_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

}
