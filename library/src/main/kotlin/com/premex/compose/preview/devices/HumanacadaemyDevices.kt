package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Humanacadaemy device specifications for Android Compose previews.
 *
 * This extension provides Humanacadaemy device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Humanacadaemy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Humanacadaemy get() = object {
    /** Humanacadaemy HA-007 */
    val HA_007 = "spec:width=600,height=1024,unit=px,dpi=160"

}
