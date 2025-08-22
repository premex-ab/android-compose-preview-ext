package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sprange device specifications for Android Compose previews.
 *
 * This extension provides Sprange device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sprange.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sprange get() = object {
    /** Sprange Sprange_L8 */
    val SPRANGE_L8 = "spec:width=800,height=1280,unit=px,dpi=213"

}
