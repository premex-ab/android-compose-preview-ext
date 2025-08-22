package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Rephone device specifications for Android Compose previews.
 *
 * This extension provides Rephone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Rephone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Rephone get() = object {
    /** Rephone rephone */
    val REPHONE = "spec:width=1080,height=2340,unit=px,dpi=480"

}
