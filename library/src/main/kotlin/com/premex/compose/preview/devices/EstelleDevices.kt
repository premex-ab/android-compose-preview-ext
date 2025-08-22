package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Estelle device specifications for Android Compose previews.
 *
 * This extension provides Estelle device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Estelle.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Estelle get() = object {
    /** Estelle EST-001-BLA */
    val EST_001_BLA = "spec:width=1080,height=2160,unit=px,dpi=480"

}
