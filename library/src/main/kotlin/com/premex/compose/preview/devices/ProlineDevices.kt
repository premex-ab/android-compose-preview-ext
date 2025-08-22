package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Proline device specifications for Android Compose previews.
 *
 * This extension provides Proline device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Proline.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Proline get() = object {
    /** Proline base10.3g silver */
    val BASE10_3G_SILVER = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Proline H10888M */
    val H10888M = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Proline Proline FalconXL */
    val PROLINE_FALCONXL = "spec:width=720,height=1440,unit=px,dpi=320"

}
