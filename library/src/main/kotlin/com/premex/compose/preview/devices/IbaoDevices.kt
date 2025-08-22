package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ibao device specifications for Android Compose previews.
 *
 * This extension provides Ibao device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ibao.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ibao get() = object {
    /** Ibao iS1 */
    val IS1 = "spec:width=720,height=1440,unit=px,dpi=320"

}
