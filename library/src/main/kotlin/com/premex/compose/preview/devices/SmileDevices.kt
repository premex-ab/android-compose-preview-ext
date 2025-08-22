package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Smile device specifications for Android Compose previews.
 *
 * This extension provides Smile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Smile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Smile get() = object {
    /** Smile A955Z */
    val A955Z = "spec:width=720,height=1440,unit=px,dpi=320"

}
