package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Everex device specifications for Android Compose previews.
 *
 * This extension provides Everex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Everex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Everex get() = object {
    /** Everex Fine 7B */
    val FINE_7B = "spec:width=600,height=1024,unit=px,dpi=160"

}
