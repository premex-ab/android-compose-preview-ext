package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Jesy device specifications for Android Compose previews.
 *
 * This extension provides Jesy device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Jesy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Jesy get() = object {
    /** Jesy JESY J20 */
    val JESY_J20 = "spec:width=1080,height=2340,unit=px,dpi=480"

}
