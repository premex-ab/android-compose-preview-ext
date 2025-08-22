package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Joyar device specifications for Android Compose previews.
 *
 * This extension provides Joyar device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Joyar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Joyar get() = object {
    /** Joyar joyar_mid */
    val JOYAR_MID = "spec:width=1200,height=1920,unit=px,dpi=240"

}
