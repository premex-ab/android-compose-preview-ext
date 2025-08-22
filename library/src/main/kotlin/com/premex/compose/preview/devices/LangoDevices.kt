package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Lango device specifications for Android Compose previews.
 *
 * This extension provides Lango device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Lango.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Lango get() = object {
    /** Lango LANGO OPS8195 */
    val LANGO_OPS8195 = "spec:width=2160,height=3840,unit=px,dpi=480"

}
