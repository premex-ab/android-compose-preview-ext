package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hyfheyuefeng device specifications for Android Compose previews.
 *
 * This extension provides Hyfheyuefeng device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hyfheyuefeng.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hyfheyuefeng get() = object {
    /** Hyfheyuefeng SQ126G */
    val SQ126G = "spec:width=1200,height=2000,unit=px,dpi=320"

}
