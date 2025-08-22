package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tpad device specifications for Android Compose previews.
 *
 * This extension provides Tpad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tpad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tpad get() = object {
    /** Tpad TPAD-T30B_EEA */
    val TPAD_T30B_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

}
