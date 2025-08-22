package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ttfone device specifications for Android Compose previews.
 *
 * This extension provides Ttfone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ttfone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ttfone get() = object {
    /** Ttfone TT20_eea */
    val TT20_EEA = "spec:width=480,height=800,unit=px,dpi=240"

}
