package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hercls device specifications for Android Compose previews.
 *
 * This extension provides Hercls device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hercls.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hercls get() = object {
    /** Hercls HERCLS L925 */
    val HERCLS_L925 = "spec:width=720,height=1440,unit=px,dpi=320"

}
