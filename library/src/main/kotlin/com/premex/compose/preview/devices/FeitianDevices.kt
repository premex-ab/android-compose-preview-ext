package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Feitian device specifications for Android Compose previews.
 *
 * This extension provides Feitian device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Feitian.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Feitian get() = object {
    /** Feitian F100 */
    val F100 = "spec:width=720,height=1280,unit=px,dpi=320"

}
