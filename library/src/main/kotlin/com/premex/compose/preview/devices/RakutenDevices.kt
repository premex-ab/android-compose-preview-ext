package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Rakuten device specifications for Android Compose previews.
 *
 * This extension provides Rakuten device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Rakuten.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Rakuten get() = object {
    /** Rakuten C330 */
    val C330 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Rakuten Rakuten BIG s */
    val RAKUTEN_BIG_S = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Rakuten Rakuten Hand */
    val RAKUTEN_HAND = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Rakuten Rakuten Hand5G */
    val RAKUTEN_HAND5G = "spec:width=720,height=1520,unit=px,dpi=320"

}
