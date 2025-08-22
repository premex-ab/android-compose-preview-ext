package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Asanzo device specifications for Android Compose previews.
 *
 * This extension provides Asanzo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Asanzo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Asanzo get() = object {
    /** Asanzo ASANZO A2 */
    val ASANZO_A2 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Asanzo S6 */
    val S6 = "spec:width=600,height=1280,unit=px,dpi=240"

}
