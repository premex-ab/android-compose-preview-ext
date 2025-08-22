package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Unisced device specifications for Android Compose previews.
 *
 * This extension provides Unisced device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Unisced.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Unisced get() = object {
    /** Unisced UNISCEDTAB24 */
    val UNISCEDTAB24 = "spec:width=800,height=1280,unit=px,dpi=160"

}
