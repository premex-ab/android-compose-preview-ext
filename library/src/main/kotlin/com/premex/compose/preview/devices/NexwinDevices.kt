package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Nexwin device specifications for Android Compose previews.
 *
 * This extension provides Nexwin device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Nexwin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Nexwin get() = object {
    /** Nexwin interactive flat panel display */
    val INTERACTIVE_FLAT_PANEL_DISPLAY = "spec:width=2160,height=3840,unit=px,dpi=320"

}
