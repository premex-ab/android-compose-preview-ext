package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Nio device specifications for Android Compose previews.
 *
 * This extension provides Nio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Nio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Nio get() = object {
    /** Nio N2301 */
    val N2301 = "spec:width=1440,height=3200,unit=px,dpi=600"

    /** Nio N2401 */
    val N2401 = "spec:width=1440,height=3168,unit=px,dpi=600"

}
