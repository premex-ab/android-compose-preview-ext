package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Meiigoo device specifications for Android Compose previews.
 *
 * This extension provides Meiigoo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Meiigoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Meiigoo get() = object {
    /** Meiigoo S8 */
    val S8 = "spec:width=1080,height=2160,unit=px,dpi=480"

}
