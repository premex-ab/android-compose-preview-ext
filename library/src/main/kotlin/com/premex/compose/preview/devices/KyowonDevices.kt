package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kyowon device specifications for Android Compose previews.
 *
 * This extension provides Kyowon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kyowon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kyowon get() = object {
    /** Kyowon All&G PAD */
    val ALL_G_PAD = "spec:width=752,height=1280,unit=px,dpi=160"

}
