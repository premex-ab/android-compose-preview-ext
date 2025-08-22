package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Acdcomputers device specifications for Android Compose previews.
 *
 * This extension provides Acdcomputers device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Acdcomputers.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Acdcomputers get() = object {
    /** Acdcomputers ACD-Tab-10S */
    val ACD_TAB_10S = "spec:width=800,height=1280,unit=px,dpi=213"

}
