package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Calus device specifications for Android Compose previews.
 *
 * This extension provides Calus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Calus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Calus get() = object {
    /** Calus Note 16 Pro */
    val NOTE_16_PRO = "spec:width=720,height=1640,unit=px,dpi=320"

}
