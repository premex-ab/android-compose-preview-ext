package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Prestige device specifications for Android Compose previews.
 *
 * This extension provides Prestige device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Prestige.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Prestige get() = object {
    /** Prestige PMT5778_4G */
    val PMT5778_4G = "spec:width=1200,height=1920,unit=px,dpi=240"

}
