package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Irie device specifications for Android Compose previews.
 *
 * This extension provides Irie device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Irie.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Irie get() = object {
    /** Irie FFF-TAB10H */
    val FFF_TAB10H = "spec:width=1200,height=1920,unit=px,dpi=213"

}
