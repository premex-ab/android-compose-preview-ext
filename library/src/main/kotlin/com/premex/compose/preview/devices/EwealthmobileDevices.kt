package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ewealthmobile device specifications for Android Compose previews.
 *
 * This extension provides Ewealthmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ewealthmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ewealthmobile get() = object {
    /** Ewealthmobile E508 */
    val E508 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Ewealthmobile E5701 */
    val E5701 = "spec:width=720,height=1520,unit=px,dpi=320"

}
