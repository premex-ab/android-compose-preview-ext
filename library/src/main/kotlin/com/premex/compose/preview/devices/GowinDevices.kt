package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Gowin device specifications for Android Compose previews.
 *
 * This extension provides Gowin device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Gowin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Gowin get() = object {
    /** Gowin QT8-T310 */
    val QT8_T310 = "spec:width=800,height=1280,unit=px,dpi=213"

}
