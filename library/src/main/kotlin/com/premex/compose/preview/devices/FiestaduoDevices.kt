package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Fiestaduo device specifications for Android Compose previews.
 *
 * This extension provides Fiestaduo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Fiestaduo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Fiestaduo get() = object {
    /** Fiestaduo iX */
    val IX = "spec:width=720,height=1498,unit=px,dpi=320"

}
