package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Qincn device specifications for Android Compose previews.
 *
 * This extension provides Qincn device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Qincn.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Qincn get() = object {
    /** Qincn F22 Pro */
    val F22_PRO = "spec:width=640,height=960,unit=px,dpi=320"

}
