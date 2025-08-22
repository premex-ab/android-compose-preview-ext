package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Arrow device specifications for Android Compose previews.
 *
 * This extension provides Arrow device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Arrow.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Arrow get() = object {
    /** Arrow M916H */
    val M916H = "spec:width=720,height=1560,unit=px,dpi=320"

}
