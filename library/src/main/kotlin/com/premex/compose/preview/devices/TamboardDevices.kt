package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tamboard device specifications for Android Compose previews.
 *
 * This extension provides Tamboard device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tamboard.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tamboard get() = object {
    /** Tamboard TB_GH */
    val TB_GH = "spec:width=2160,height=3840,unit=px,dpi=420"

}
