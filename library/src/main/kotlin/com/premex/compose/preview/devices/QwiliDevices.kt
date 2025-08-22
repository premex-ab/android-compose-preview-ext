package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Qwili device specifications for Android Compose previews.
 *
 * This extension provides Qwili device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Qwili.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Qwili get() = object {
    /** Qwili pula */
    val PULA = "spec:width=480,height=960,unit=px,dpi=240"

}
