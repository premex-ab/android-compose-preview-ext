package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Atvio device specifications for Android Compose previews.
 *
 * This extension provides Atvio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Atvio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Atvio get() = object {
    /** Atvio 100011886BK */
    val _100011886BK = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Atvio ATVIO */
    val ATVIO = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Atvio MID1032 */
    val MID1032 = "spec:width=800,height=1280,unit=px,dpi=160"

}
