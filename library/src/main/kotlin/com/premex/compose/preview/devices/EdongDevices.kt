package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Edong device specifications for Android Compose previews.
 *
 * This extension provides Edong device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Edong.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Edong get() = object {
    /** Edong 1EY4G */
    val _1EY4G = "spec:width=800,height=1280,unit=px,dpi=160"

}
