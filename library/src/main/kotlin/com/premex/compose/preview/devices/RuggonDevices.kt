package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ruggon device specifications for Android Compose previews.
 *
 * This extension provides Ruggon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ruggon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ruggon get() = object {
    /** Ruggon PA501 */
    val PA501 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Ruggon PA501BWR */
    val PA501BWR = "spec:width=1200,height=1920,unit=px,dpi=240"

}
