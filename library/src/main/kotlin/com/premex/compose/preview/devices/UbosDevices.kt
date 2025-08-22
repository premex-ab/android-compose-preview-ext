package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ubos device specifications for Android Compose previews.
 *
 * This extension provides Ubos device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ubos.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ubos get() = object {
    /** Ubos UTAB */
    val UTAB = "spec:width=1200,height=1920,unit=px,dpi=280"

}
