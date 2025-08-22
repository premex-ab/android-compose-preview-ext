package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ysfphone device specifications for Android Compose previews.
 *
 * This extension provides Ysfphone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ysfphone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ysfphone get() = object {
    /** Ysfphone Rugged tablet */
    val RUGGED_TABLET = "spec:width=1200,height=1920,unit=px,dpi=480"

}
