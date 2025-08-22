package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Oteeto device specifications for Android Compose previews.
 *
 * This extension provides Oteeto device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Oteeto.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Oteeto get() = object {
    /** Oteeto OE1 */
    val OE1 = "spec:width=800,height=1280,unit=px,dpi=240"

}
