package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Attila device specifications for Android Compose previews.
 *
 * This extension provides Attila device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Attila.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Attila get() = object {
    /** Attila WTATTRW2 */
    val WTATTRW2 = "spec:width=720,height=1440,unit=px,dpi=280"

}
