package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Moviltelcotrade device specifications for Android Compose previews.
 *
 * This extension provides Moviltelcotrade device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Moviltelcotrade.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Moviltelcotrade get() = object {
    /** Moviltelcotrade L506 */
    val L506 = "spec:width=368,height=448,unit=px,dpi=180"

}
