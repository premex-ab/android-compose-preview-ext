package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cryptodata device specifications for Android Compose previews.
 *
 * This extension provides Cryptodata device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cryptodata.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cryptodata get() = object {
    /** Cryptodata Hidr S1 PRO ROW */
    val HIDR_S1_PRO_ROW = "spec:width=1080,height=2460,unit=px,dpi=480"

}
