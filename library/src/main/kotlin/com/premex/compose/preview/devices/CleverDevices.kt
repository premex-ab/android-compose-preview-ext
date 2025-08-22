package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Clever device specifications for Android Compose previews.
 *
 * This extension provides Clever device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Clever.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Clever get() = object {
    /** Clever T45 */
    val T45 = "spec:width=600,height=1024,unit=px,dpi=160"

}
