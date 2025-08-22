package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Phoenix device specifications for Android Compose previews.
 *
 * This extension provides Phoenix device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Phoenix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Phoenix get() = object {
    /** Phoenix PHONETABPRO */
    val PHONETABPRO = "spec:width=1200,height=1920,unit=px,dpi=240"

}
