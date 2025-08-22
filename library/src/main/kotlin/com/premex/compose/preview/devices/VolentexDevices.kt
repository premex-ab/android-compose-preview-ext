package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Volentex device specifications for Android Compose previews.
 *
 * This extension provides Volentex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Volentex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Volentex get() = object {
    /** Volentex M10 */
    val M10 = "spec:width=800,height=1280,unit=px,dpi=160"

}
