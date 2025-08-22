package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Elink device specifications for Android Compose previews.
 *
 * This extension provides Elink device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Elink.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Elink get() = object {
    /** Elink T201 */
    val T201 = "spec:width=1200,height=2000,unit=px,dpi=320"

}
