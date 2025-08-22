package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Legamaster device specifications for Android Compose previews.
 *
 * This extension provides Legamaster device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Legamaster.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Legamaster get() = object {
    /** Legamaster EVOLVE2 */
    val EVOLVE2 = "spec:width=2160,height=3840,unit=px,dpi=480"

}
