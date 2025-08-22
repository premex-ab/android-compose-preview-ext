package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Winmax device specifications for Android Compose previews.
 *
 * This extension provides Winmax device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Winmax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Winmax get() = object {
    /** Winmax Tiger X12 */
    val TIGER_X12 = "spec:width=320,height=385,unit=px,dpi=160"

    /** Winmax TIGER X7 */
    val TIGER_X7 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Winmax X50 */
    val X50 = "spec:width=480,height=960,unit=px,dpi=240"

}
