package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hoffmann device specifications for Android Compose previews.
 *
 * This extension provides Hoffmann device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hoffmann.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hoffmann get() = object {
    /** Hoffmann X-Go */
    val X_GO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Hoffmann X Max */
    val X_MAX = "spec:width=720,height=1280,unit=px,dpi=320"

}
