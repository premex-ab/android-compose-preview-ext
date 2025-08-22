package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Funker device specifications for Android Compose previews.
 *
 * This extension provides Funker device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Funker.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Funker get() = object {
    /** Funker E500i */
    val E500I = "spec:width=480,height=960,unit=px,dpi=240"

}
