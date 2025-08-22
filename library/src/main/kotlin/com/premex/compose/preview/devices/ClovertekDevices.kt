package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Clovertek device specifications for Android Compose previews.
 *
 * This extension provides Clovertek device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Clovertek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Clovertek get() = object {
    /** Clovertek G65 */
    val G65 = "spec:width=720,height=1600,unit=px,dpi=320"

}
