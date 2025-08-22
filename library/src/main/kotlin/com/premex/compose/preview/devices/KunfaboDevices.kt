package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kunfabo device specifications for Android Compose previews.
 *
 * This extension provides Kunfabo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kunfabo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kunfabo get() = object {
    /** Kunfabo F99Pro */
    val F99PRO = "spec:width=720,height=1520,unit=px,dpi=320"

}
