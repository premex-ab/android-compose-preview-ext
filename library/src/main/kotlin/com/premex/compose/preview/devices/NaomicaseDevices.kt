package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Naomicase device specifications for Android Compose previews.
 *
 * This extension provides Naomicase device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Naomicase.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Naomicase get() = object {
    /** Naomicase N4 */
    val N4 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Naomicase N4MAX */
    val N4MAX = "spec:width=720,height=1600,unit=px,dpi=320"

}
