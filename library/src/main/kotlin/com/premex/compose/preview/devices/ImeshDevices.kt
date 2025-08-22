package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Imesh device specifications for Android Compose previews.
 *
 * This extension provides Imesh device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Imesh.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Imesh get() = object {
    /** Imesh IM-560 */
    val IM_560 = "spec:width=480,height=800,unit=px,dpi=200"

}
