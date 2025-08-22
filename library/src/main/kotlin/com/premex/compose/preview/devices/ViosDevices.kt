package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vios device specifications for Android Compose previews.
 *
 * This extension provides Vios device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vios.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vios get() = object {
    /** Vios 65PB1_2 */
    val _65PB1_2 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Vios VIOS_series */
    val VIOS_SERIES = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Vios VTAB7 */
    val VTAB7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Vios VTABX */
    val VTABX = "spec:width=800,height=1280,unit=px,dpi=213"

}
