package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Diamond device specifications for Android Compose previews.
 *
 * This extension provides Diamond device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Diamond.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Diamond get() = object {
    /** Diamond MC32020 */
    val MC32020 = "spec:width=720,height=1440,unit=px,dpi=320"

}
