package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Japantaxi device specifications for Android Compose previews.
 *
 * This extension provides Japantaxi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Japantaxi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Japantaxi get() = object {
    /** Japantaxi IRIS ITAB05 */
    val IRIS_ITAB05 = "spec:width=1200,height=1920,unit=px,dpi=240"

}
