package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zolon device specifications for Android Compose previews.
 *
 * This extension provides Zolon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zolon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zolon get() = object {
    /** Zolon L16XX */
    val L16XX = "spec:width=1080,height=1920,unit=px,dpi=240"

}
