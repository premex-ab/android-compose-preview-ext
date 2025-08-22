package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Elecson device specifications for Android Compose previews.
 *
 * This extension provides Elecson device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Elecson.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Elecson get() = object {
    /** Elecson Prime X */
    val PRIME_X = "spec:width=720,height=1640,unit=px,dpi=340"

}
