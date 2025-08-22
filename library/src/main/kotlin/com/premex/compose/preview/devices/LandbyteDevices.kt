package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Landbyte device specifications for Android Compose previews.
 *
 * This extension provides Landbyte device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Landbyte.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Landbyte get() = object {
    /** Landbyte Lt6248 */
    val LT6248 = "spec:width=600,height=1024,unit=px,dpi=160"

}
