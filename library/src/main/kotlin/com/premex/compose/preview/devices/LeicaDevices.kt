package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Leica device specifications for Android Compose previews.
 *
 * This extension provides Leica device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Leica.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Leica get() = object {
    /** Leica Leica CSX8 */
    val LEICA_CSX8 = "spec:width=1200,height=1920,unit=px,dpi=320"

}
