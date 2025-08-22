package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Parrotmobile device specifications for Android Compose previews.
 *
 * This extension provides Parrotmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Parrotmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Parrotmobile get() = object {
    /** Parrotmobile Prestige */
    val PRESTIGE = "spec:width=720,height=1440,unit=px,dpi=360"

}
