package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Onescreen device specifications for Android Compose previews.
 *
 * This extension provides Onescreen device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Onescreen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Onescreen get() = object {
    /** Onescreen OneScreen T7 */
    val ONESCREEN_T7 = "spec:width=2160,height=3840,unit=px,dpi=480"

    /** Onescreen Wandr_W1 */
    val WANDR_W1 = "spec:width=2160,height=3840,unit=px,dpi=320"

}
