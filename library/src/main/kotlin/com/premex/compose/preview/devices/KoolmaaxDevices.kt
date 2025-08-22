package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Koolmaax device specifications for Android Compose previews.
 *
 * This extension provides Koolmaax device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Koolmaax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Koolmaax get() = object {
    /** Koolmaax GEMINI */
    val GEMINI = "spec:width=480,height=960,unit=px,dpi=220"

}
