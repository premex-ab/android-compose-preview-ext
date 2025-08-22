package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Irainbow device specifications for Android Compose previews.
 *
 * This extension provides Irainbow device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Irainbow.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Irainbow get() = object {
    /** Irainbow B12017 */
    val B12017 = "spec:width=800,height=1280,unit=px,dpi=160"

}
