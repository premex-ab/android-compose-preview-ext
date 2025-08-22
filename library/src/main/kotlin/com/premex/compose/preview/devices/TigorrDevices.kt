package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tigorr device specifications for Android Compose previews.
 *
 * This extension provides Tigorr device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tigorr.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tigorr get() = object {
    /** Tigorr Z7 */
    val Z7 = "spec:width=720,height=1600,unit=px,dpi=320"

}
