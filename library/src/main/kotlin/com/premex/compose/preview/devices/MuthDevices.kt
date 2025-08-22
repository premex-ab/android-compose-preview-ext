package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Muth device specifications for Android Compose previews.
 *
 * This extension provides Muth device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Muth.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Muth get() = object {
    /** Muth 8 */
    val _8 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Muth mu 1 */
    val MU_1 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Muth mu6 */
    val MU6 = "spec:width=720,height=1520,unit=px,dpi=320"

}
