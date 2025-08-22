package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Horion device specifications for Android Compose previews.
 *
 * This extension provides Horion device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Horion.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Horion get() = object {
    /** Horion M6APro */
    val M6APRO = "spec:width=2160,height=3840,unit=px,dpi=480"

}
