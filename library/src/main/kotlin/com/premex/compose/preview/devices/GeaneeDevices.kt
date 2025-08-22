package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Geanee device specifications for Android Compose previews.
 *
 * This extension provides Geanee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Geanee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Geanee get() = object {
    /** Geanee ADP-503G */
    val ADP_503G = "spec:width=540,height=960,unit=px,dpi=240"

    /** Geanee JT07-90 */
    val JT07_90 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Geanee JT10-90 */
    val JT10_90 = "spec:width=800,height=1280,unit=px,dpi=160"

}
