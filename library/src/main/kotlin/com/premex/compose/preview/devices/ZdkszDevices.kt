package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zdksz device specifications for Android Compose previews.
 *
 * This extension provides Zdksz device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zdksz.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zdksz get() = object {
    /** Zdksz ZDKMP-T30A_ROW */
    val ZDKMP_T30A_ROW = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Zdksz ZDKMP-T30B_ROW */
    val ZDKMP_T30B_ROW = "spec:width=1200,height=1920,unit=px,dpi=320"

}
