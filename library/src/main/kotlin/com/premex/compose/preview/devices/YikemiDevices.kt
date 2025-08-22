package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Yikemi device specifications for Android Compose previews.
 *
 * This extension provides Yikemi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Yikemi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Yikemi get() = object {
    /** Yikemi Pad6_Plus_EEA */
    val PAD6_PLUS_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

}
