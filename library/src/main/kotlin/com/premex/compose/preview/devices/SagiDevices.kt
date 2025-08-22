package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sagi device specifications for Android Compose previews.
 *
 * This extension provides Sagi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sagi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sagi get() = object {
    /** Sagi E5501 */
    val E5501 = "spec:width=480,height=960,unit=px,dpi=240"

}
