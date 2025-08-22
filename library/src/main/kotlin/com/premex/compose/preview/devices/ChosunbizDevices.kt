package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Chosunbiz device specifications for Android Compose previews.
 *
 * This extension provides Chosunbiz device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Chosunbiz.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Chosunbiz get() = object {
    /** Chosunbiz Chosunbiz */
    val CHOSUNBIZ = "spec:width=1200,height=1920,unit=px,dpi=320"

}
