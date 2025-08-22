package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Menfop device specifications for Android Compose previews.
 *
 * This extension provides Menfop device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Menfop.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Menfop get() = object {
    /** Menfop HaierP8B */
    val HAIERP8B = "spec:width=800,height=1280,unit=px,dpi=160"

}
