package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Omax device specifications for Android Compose previews.
 *
 * This extension provides Omax device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Omax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Omax get() = object {
    /** Omax 7PAN */
    val _7PAN = "spec:width=2160,height=3840,unit=px,dpi=420"

}
