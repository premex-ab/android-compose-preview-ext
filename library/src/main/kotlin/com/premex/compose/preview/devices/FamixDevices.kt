package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Famix device specifications for Android Compose previews.
 *
 * This extension provides Famix device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Famix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Famix get() = object {
    /** Famix F10L */
    val F10L = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Famix F11 */
    val F11 = "spec:width=800,height=1280,unit=px,dpi=160"

}
