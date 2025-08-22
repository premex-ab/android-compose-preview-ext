package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hatch device specifications for Android Compose previews.
 *
 * This extension provides Hatch device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hatch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hatch get() = object {
    /** Hatch Hatch_103S */
    val HATCH_103S = "spec:width=1200,height=1920,unit=px,dpi=240"

}
