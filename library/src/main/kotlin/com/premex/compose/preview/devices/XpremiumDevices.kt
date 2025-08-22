package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Xpremium device specifications for Android Compose previews.
 *
 * This extension provides Xpremium device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Xpremium.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Xpremium get() = object {
    /** Xpremium X1 */
    val X1 = "spec:width=800,height=1280,unit=px,dpi=160"

}
