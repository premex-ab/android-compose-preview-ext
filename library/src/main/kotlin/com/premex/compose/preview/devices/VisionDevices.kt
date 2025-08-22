package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vision device specifications for Android Compose previews.
 *
 * This extension provides Vision device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vision.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vision get() = object {
    /** Vision Vision V1  */
    val VISION_V1 = "spec:width=720,height=1440,unit=px,dpi=320"

}
