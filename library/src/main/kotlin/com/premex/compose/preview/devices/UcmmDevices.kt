package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ucmm device specifications for Android Compose previews.
 *
 * This extension provides Ucmm device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ucmm.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ucmm get() = object {
    /** Ucmm T12 */
    val T12 = "spec:width=800,height=1280,unit=px,dpi=213"

}
