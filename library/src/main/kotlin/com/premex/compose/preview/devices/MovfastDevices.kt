package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Movfast device specifications for Android Compose previews.
 *
 * This extension provides Movfast device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Movfast.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Movfast get() = object {
    /** Movfast Ranger2 */
    val RANGER2 = "spec:width=720,height=1440,unit=px,dpi=280"

    /** Movfast Ranger2 Lite */
    val RANGER2_LITE = "spec:width=480,height=800,unit=px,dpi=220"

}
