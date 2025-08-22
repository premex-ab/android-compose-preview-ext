package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Glofiish device specifications for Android Compose previews.
 *
 * This extension provides Glofiish device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Glofiish.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Glofiish get() = object {
    /** Glofiish Gpad_U */
    val GPAD_U = "spec:width=720,height=1512,unit=px,dpi=320"

}
