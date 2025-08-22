package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Teachmintx device specifications for Android Compose previews.
 *
 * This extension provides Teachmintx device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Teachmintx.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Teachmintx get() = object {
    /** Teachmintx Teachmint_X_PRO */
    val TEACHMINT_X_PRO = "spec:width=2160,height=3840,unit=px,dpi=480"

}
