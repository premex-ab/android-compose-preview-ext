package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ioutdoor device specifications for Android Compose previews.
 *
 * This extension provides Ioutdoor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ioutdoor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ioutdoor get() = object {
    /** Ioutdoor Polar3_EEA */
    val POLAR3_EEA = "spec:width=720,height=1440,unit=px,dpi=320"

}
