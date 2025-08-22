package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bluboo device specifications for Android Compose previews.
 *
 * This extension provides Bluboo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bluboo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bluboo get() = object {
    /** Bluboo S1a */
    val S1A = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Bluboo S3 */
    val S3 = "spec:width=1080,height=2160,unit=px,dpi=480"

}
