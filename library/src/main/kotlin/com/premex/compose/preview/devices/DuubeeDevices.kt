package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Duubee device specifications for Android Compose previews.
 *
 * This extension provides Duubee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Duubee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Duubee get() = object {
    /** Duubee DT1052 */
    val DT1052 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Duubee W1 */
    val W1 = "spec:width=240,height=296,unit=px,dpi=120"

}
