package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Wacom device specifications for Android Compose previews.
 *
 * This extension provides Wacom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Wacom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Wacom get() = object {
    /** Wacom Cintiq Companion Hybrid 13HD */
    val CINTIQ_COMPANION_HYBRID_13HD = "spec:width=1080,height=1920,unit=px,dpi=160"

}
