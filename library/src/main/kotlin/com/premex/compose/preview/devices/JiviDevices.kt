package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Jivi device specifications for Android Compose previews.
 *
 * This extension provides Jivi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Jivi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Jivi get() = object {
    /** Jivi Xtreme_3 */
    val XTREME_3 = "spec:width=480,height=960,unit=px,dpi=240"

}
