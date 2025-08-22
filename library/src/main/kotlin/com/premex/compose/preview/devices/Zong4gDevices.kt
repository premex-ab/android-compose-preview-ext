package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zong4g device specifications for Android Compose previews.
 *
 * This extension provides Zong4g device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zong4g.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zong4g get() = object {
    /** Zong4g Z1 */
    val Z1 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Zong4g Z2 */
    val Z2 = "spec:width=720,height=1440,unit=px,dpi=320"

}
