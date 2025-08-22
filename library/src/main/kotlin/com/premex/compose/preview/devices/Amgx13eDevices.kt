package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Amgx13e device specifications for Android Compose previews.
 *
 * This extension provides Amgx13e device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Amgx13e.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Amgx13e get() = object {
    /** Amgx13e ASPE2201 */
    val ASPE2201 = "spec:width=720,height=1600,unit=px,dpi=320"

}
