package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Imozen device specifications for Android Compose previews.
 *
 * This extension provides Imozen device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Imozen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Imozen get() = object {
    /** Imozen TC605AN */
    val TC605AN = "spec:width=1080,height=2160,unit=px,dpi=480"

}
