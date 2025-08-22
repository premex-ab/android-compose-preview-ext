package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Motorolasolutions device specifications for Android Compose previews.
 *
 * This extension provides Motorolasolutions device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Motorolasolutions.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Motorolasolutions get() = object {
    /** Motorolasolutions EVOLVE */
    val EVOLVE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Motorolasolutions LEX F10 */
    val LEX_F10 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Motorolasolutions LEX L10ig */
    val LEX_L10IG = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Motorolasolutions LEX L11 */
    val LEX_L11 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Motorolasolutions MOTOTRBO ION */
    val MOTOTRBO_ION = "spec:width=480,height=800,unit=px,dpi=220"

}
