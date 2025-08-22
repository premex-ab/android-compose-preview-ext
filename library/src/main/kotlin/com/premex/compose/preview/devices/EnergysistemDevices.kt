package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Energysistem device specifications for Android Compose previews.
 *
 * This extension provides Energysistem device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Energysistem.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Energysistem get() = object {
    /** Energysistem adelroth */
    val ADELROTH = "spec:width=1200,height=1920,unit=px,dpi=240"

}
