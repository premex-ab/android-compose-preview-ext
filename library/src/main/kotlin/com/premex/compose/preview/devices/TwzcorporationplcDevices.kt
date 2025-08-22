package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Twzcorporationplc device specifications for Android Compose previews.
 *
 * This extension provides Twzcorporationplc device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Twzcorporationplc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Twzcorporationplc get() = object {
    /** Twzcorporationplc OX_X1 */
    val OX_X1 = "spec:width=240,height=296,unit=px,dpi=120"

    /** Twzcorporationplc V10 */
    val V10 = "spec:width=720,height=1520,unit=px,dpi=320"

}
