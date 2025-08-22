package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Daewoo device specifications for Android Compose previews.
 *
 * This extension provides Daewoo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Daewoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Daewoo get() = object {
    /** Daewoo DW-TN7RK16 */
    val DW_TN7RK16 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Daewoo Neon */
    val NEON = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Daewoo X7 */
    val X7 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Daewoo X9 */
    val X9 = "spec:width=720,height=1600,unit=px,dpi=320"

}
