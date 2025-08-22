package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tianyu device specifications for Android Compose previews.
 *
 * This extension provides Tianyu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tianyu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tianyu get() = object {
    /** Tianyu S40E */
    val S40E = "spec:width=720,height=1440,unit=px,dpi=320"

}
