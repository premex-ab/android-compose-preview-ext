package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Clicktabds device specifications for Android Compose previews.
 *
 * This extension provides Clicktabds device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Clicktabds.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Clicktabds get() = object {
    /** Clicktabds F19 */
    val F19 = "spec:width=800,height=1280,unit=px,dpi=160"

}
