package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kuva device specifications for Android Compose previews.
 *
 * This extension provides Kuva device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kuva.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kuva get() = object {
    /** Kuva Pad */
    val PAD = "spec:width=800,height=1280,unit=px,dpi=160"

}
