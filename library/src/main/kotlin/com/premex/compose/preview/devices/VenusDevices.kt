package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Venus device specifications for Android Compose previews.
 *
 * This extension provides Venus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Venus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Venus get() = object {
    /** Venus V5_Plus_ */
    val V5_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Venus Venus V6 */
    val VENUS_V6 = "spec:width=720,height=1440,unit=px,dpi=320"

}
