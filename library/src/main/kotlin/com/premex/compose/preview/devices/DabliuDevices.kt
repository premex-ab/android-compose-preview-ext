package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Dabliu device specifications for Android Compose previews.
 *
 * This extension provides Dabliu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Dabliu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Dabliu get() = object {
    /** Dabliu E13R_B65G */
    val E13R_B65G = "spec:width=2160,height=3840,unit=px,dpi=420"

}
