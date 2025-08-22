package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Fero device specifications for Android Compose previews.
 *
 * This extension provides Fero device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Fero.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Fero get() = object {
    /** Fero A4001 Plus 2019 */
    val A4001_PLUS_2019 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Fero A5003 */
    val A5003 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Fero Royale X2 */
    val ROYALE_X2 = "spec:width=720,height=1280,unit=px,dpi=320"

}
