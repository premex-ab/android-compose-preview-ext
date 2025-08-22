package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hexabyte device specifications for Android Compose previews.
 *
 * This extension provides Hexabyte device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hexabyte.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hexabyte get() = object {
    /** Hexabyte HB_X7 */
    val HB_X7 = "spec:width=600,height=1024,unit=px,dpi=160"

}
