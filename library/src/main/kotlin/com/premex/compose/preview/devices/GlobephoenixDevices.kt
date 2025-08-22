package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Globephoenix device specifications for Android Compose previews.
 *
 * This extension provides Globephoenix device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Globephoenix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Globephoenix get() = object {
    /** Globephoenix PHPHOENIXONETAB */
    val PHPHOENIXONETAB = "spec:width=800,height=1280,unit=px,dpi=160"

}
