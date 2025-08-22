package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ahaa device specifications for Android Compose previews.
 *
 * This extension provides Ahaa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ahaa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ahaa get() = object {
    /** Ahaa IFPD */
    val IFPD = "spec:width=2160,height=3840,unit=px,dpi=420"

}
