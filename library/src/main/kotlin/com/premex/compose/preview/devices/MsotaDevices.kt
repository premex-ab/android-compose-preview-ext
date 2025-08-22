package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Msota device specifications for Android Compose previews.
 *
 * This extension provides Msota device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Msota.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Msota get() = object {
    /** Msota Nobby S500 */
    val NOBBY_S500 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Msota Nobby X800 */
    val NOBBY_X800 = "spec:width=720,height=1440,unit=px,dpi=320"

}
