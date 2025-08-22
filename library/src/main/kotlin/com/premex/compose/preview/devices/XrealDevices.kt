package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Xreal device specifications for Android Compose previews.
 *
 * This extension provides Xreal device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Xreal.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Xreal get() = object {
    /** Xreal Beam Pro */
    val BEAM_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

}
