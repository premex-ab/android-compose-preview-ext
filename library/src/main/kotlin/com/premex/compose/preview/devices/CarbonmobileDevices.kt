package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Carbonmobile device specifications for Android Compose previews.
 *
 * This extension provides Carbonmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Carbonmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Carbonmobile get() = object {
    /** Carbonmobile Carbon 1 Mark II */
    val CARBON_1_MARK_II = "spec:width=1080,height=2160,unit=px,dpi=480"

}
