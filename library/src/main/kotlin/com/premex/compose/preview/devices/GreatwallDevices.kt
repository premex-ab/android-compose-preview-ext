package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Greatwall device specifications for Android Compose previews.
 *
 * This extension provides Greatwall device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Greatwall.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Greatwall get() = object {
    /** Greatwall 100011886_GTW */
    val _100011886_GTW = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Greatwall GWPad-S11 */
    val GWPAD_S11 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Greatwall GWPad-S11-1 */
    val GWPAD_S11_1 = "spec:width=1200,height=1920,unit=px,dpi=280"

}
