package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Wainyok device specifications for Android Compose previews.
 *
 * This extension provides Wainyok device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Wainyok.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Wainyok get() = object {
    /** Wainyok P10S_EEA */
    val P10S_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Wainyok P10X */
    val P10X = "spec:width=800,height=1280,unit=px,dpi=160"

}
