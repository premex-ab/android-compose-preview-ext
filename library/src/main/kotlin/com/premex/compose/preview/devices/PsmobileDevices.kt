package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Psmobile device specifications for Android Compose previews.
 *
 * This extension provides Psmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Psmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Psmobile get() = object {
    /** Psmobile Neo_Pro */
    val NEO_PRO = "spec:width=480,height=960,unit=px,dpi=240"

}
