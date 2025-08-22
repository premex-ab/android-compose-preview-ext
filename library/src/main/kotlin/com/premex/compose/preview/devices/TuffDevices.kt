package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tuff device specifications for Android Compose previews.
 *
 * This extension provides Tuff device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tuff.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tuff get() = object {
    /** Tuff T500 */
    val T500 = "spec:width=720,height=1440,unit=px,dpi=320"

}
