package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Goo device specifications for Android Compose previews.
 *
 * This extension provides Goo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Goo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Goo get() = object {
    /** Goo g08 */
    val G08 = "spec:width=720,height=1440,unit=px,dpi=320"

}
