package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zmbizi device specifications for Android Compose previews.
 *
 * This extension provides Zmbizi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zmbizi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zmbizi get() = object {
    /** Zmbizi ZMBIZI */
    val ZMBIZI = "spec:width=1080,height=2280,unit=px,dpi=480"

    /** Zmbizi ZMBIZI Z2 */
    val ZMBIZI_Z2 = "spec:width=1080,height=2400,unit=px,dpi=480"

}
