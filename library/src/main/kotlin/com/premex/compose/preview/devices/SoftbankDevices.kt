package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Softbank device specifications for Android Compose previews.
 *
 * This extension provides Softbank device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Softbank.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Softbank get() = object {
    /** Softbank 602ZT */
    val _602ZT = "spec:width=720,height=1280,unit=px,dpi=320"

}
