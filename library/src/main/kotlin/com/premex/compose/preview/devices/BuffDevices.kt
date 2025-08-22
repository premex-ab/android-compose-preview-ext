package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Buff device specifications for Android Compose previews.
 *
 * This extension provides Buff device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Buff.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Buff get() = object {
    /** Buff X9 pro */
    val X9_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

}
