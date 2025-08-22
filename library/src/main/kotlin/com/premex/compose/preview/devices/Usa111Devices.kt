package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Usa111 device specifications for Android Compose previews.
 *
 * This extension provides Usa111 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Usa111.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Usa111 get() = object {
    /** Usa111 IRULU X11 */
    val IRULU_X11 = "spec:width=600,height=1024,unit=px,dpi=160"

}
