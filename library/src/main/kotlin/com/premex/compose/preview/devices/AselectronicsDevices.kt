package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Aselectronics device specifications for Android Compose previews.
 *
 * This extension provides Aselectronics device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Aselectronics.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Aselectronics get() = object {
    /** Aselectronics AS1 */
    val AS1 = "spec:width=720,height=1612,unit=px,dpi=280"

}
