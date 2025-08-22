package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Spurt device specifications for Android Compose previews.
 *
 * This extension provides Spurt device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Spurt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Spurt get() = object {
    /** Spurt Spurt_K800 */
    val SPURT_K800 = "spec:width=720,height=1600,unit=px,dpi=320"

}
