package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vibez device specifications for Android Compose previews.
 *
 * This extension provides Vibez device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vibez.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vibez get() = object {
    /** Vibez K910 */
    val K910 = "spec:width=1080,height=1920,unit=px,dpi=480"

}
