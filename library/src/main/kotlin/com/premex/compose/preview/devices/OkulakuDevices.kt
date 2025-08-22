package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Okulaku device specifications for Android Compose previews.
 *
 * This extension provides Okulaku device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Okulaku.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Okulaku get() = object {
    /** Okulaku K10 */
    val K10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Okulaku ZIDS701 */
    val ZIDS701 = "spec:width=600,height=1024,unit=px,dpi=160"

}
