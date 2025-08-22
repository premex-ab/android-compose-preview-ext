package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Dingdong device specifications for Android Compose previews.
 *
 * This extension provides Dingdong device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Dingdong.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Dingdong get() = object {
    /** Dingdong IB101F_UAG */
    val IB101F_UAG = "spec:width=1200,height=1920,unit=px,dpi=280"

}
