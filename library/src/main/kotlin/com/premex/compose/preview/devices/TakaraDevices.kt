package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Takara device specifications for Android Compose previews.
 *
 * This extension provides Takara device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Takara.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Takara get() = object {
    /** Takara MID169 */
    val MID169 = "spec:width=600,height=1024,unit=px,dpi=160"

}
