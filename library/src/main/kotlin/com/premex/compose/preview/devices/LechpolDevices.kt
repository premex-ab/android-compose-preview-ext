package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Lechpol device specifications for Android Compose previews.
 *
 * This extension provides Lechpol device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Lechpol.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Lechpol get() = object {
    /** Lechpol EAGLE1069 */
    val EAGLE1069 = "spec:width=1200,height=1920,unit=px,dpi=320"

}
