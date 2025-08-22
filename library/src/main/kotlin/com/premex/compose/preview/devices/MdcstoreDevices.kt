package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mdcstore device specifications for Android Compose previews.
 *
 * This extension provides Mdcstore device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mdcstore.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mdcstore get() = object {
    /** Mdcstore Prime_S */
    val PRIME_S = "spec:width=720,height=1280,unit=px,dpi=320"

}
