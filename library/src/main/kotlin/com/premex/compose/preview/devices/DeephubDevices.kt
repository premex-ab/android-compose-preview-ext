package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Deephub device specifications for Android Compose previews.
 *
 * This extension provides Deephub device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Deephub.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Deephub get() = object {
    /** Deephub DeepHub Ultimate */
    val DEEPHUB_ULTIMATE = "spec:width=2160,height=3840,unit=px,dpi=480"

}
