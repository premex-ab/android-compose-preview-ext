package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Promethean device specifications for Android Compose previews.
 *
 * This extension provides Promethean device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Promethean.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Promethean get() = object {
    /** Promethean Promethean OPS-A1 */
    val PROMETHEAN_OPS_A1 = "spec:width=1080,height=1920,unit=px,dpi=160"

    /** Promethean Promethean OPS-A2 */
    val PROMETHEAN_OPS_A2 = "spec:width=2160,height=3840,unit=px,dpi=320"

}
