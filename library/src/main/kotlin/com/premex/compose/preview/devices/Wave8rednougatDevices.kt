package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Wave8rednougat device specifications for Android Compose previews.
 *
 * This extension provides Wave8rednougat device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Wave8rednougat.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Wave8rednougat get() = object {
    /** Wave8rednougat WV8R-N */
    val WV8R_N = "spec:width=1536,height=2048,unit=px,dpi=320"

}
