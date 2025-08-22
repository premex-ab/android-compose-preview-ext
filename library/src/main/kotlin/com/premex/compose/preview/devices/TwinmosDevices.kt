package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Twinmos device specifications for Android Compose previews.
 *
 * This extension provides Twinmos device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Twinmos.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Twinmos get() = object {
    /** Twinmos MQ703G */
    val MQ703G = "spec:width=600,height=1024,unit=px,dpi=220"

}
