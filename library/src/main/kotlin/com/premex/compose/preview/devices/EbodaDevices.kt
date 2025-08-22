package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Eboda device specifications for Android Compose previews.
 *
 * This extension provides Eboda device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Eboda.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Eboda get() = object {
    /** Eboda Eclipse G400M */
    val ECLIPSE_G400M = "spec:width=480,height=800,unit=px,dpi=240"

}
