package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Wxunja device specifications for Android Compose previews.
 *
 * This extension provides Wxunja device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Wxunja.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Wxunja get() = object {
    /** Wxunja E10_EEA */
    val E10_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

}
