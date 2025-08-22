package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Axxamobile device specifications for Android Compose previews.
 *
 * This extension provides Axxamobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Axxamobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Axxamobile get() = object {
    /** Axxamobile GEM */
    val GEM = "spec:width=720,height=1280,unit=px,dpi=320"

}
