package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Touchviewinteractive device specifications for Android Compose previews.
 *
 * This extension provides Touchviewinteractive device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Touchviewinteractive.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Touchviewinteractive get() = object {
    /** Touchviewinteractive TVULTRA98_G5 */
    val TVULTRA98_G5 = "spec:width=2160,height=3840,unit=px,dpi=420"

}
