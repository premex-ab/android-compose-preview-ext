package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Czelectronics device specifications for Android Compose previews.
 *
 * This extension provides Czelectronics device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Czelectronics.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Czelectronics get() = object {
    /** Czelectronics M3CRD */
    val M3CRD = "spec:width=320,height=480,unit=px,dpi=160"

    /** Czelectronics M5CRD */
    val M5CRD = "spec:width=480,height=854,unit=px,dpi=240"

}
