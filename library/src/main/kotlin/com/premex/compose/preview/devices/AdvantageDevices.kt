package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Advantage device specifications for Android Compose previews.
 *
 * This extension provides Advantage device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Advantage.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Advantage get() = object {
    /** Advantage I101MTK */
    val I101MTK = "spec:width=800,height=1280,unit=px,dpi=160"

}
