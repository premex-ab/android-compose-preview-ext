package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Generalluxe device specifications for Android Compose previews.
 *
 * This extension provides Generalluxe device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Generalluxe.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Generalluxe get() = object {
    /** Generalluxe Shahin_III */
    val SHAHIN_III = "spec:width=1080,height=2340,unit=px,dpi=480"

}
