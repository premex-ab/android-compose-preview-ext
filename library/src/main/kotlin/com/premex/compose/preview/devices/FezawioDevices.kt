package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Fezawio device specifications for Android Compose previews.
 *
 * This extension provides Fezawio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Fezawio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Fezawio get() = object {
    /** Fezawio F10_EEA */
    val F10_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Fezawio F10_US */
    val F10_US = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Fezawio F11_EEA */
    val F11_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Fezawio F11_US */
    val F11_US = "spec:width=800,height=1280,unit=px,dpi=160"

}
