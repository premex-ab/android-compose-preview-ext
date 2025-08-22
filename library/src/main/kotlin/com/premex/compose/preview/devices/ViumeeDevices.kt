package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Viumee device specifications for Android Compose previews.
 *
 * This extension provides Viumee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Viumee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Viumee get() = object {
    /** Viumee EV7 Pro */
    val EV7_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

}
