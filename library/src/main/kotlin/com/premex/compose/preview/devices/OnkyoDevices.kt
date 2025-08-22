package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Onkyo device specifications for Android Compose previews.
 *
 * This extension provides Onkyo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Onkyo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Onkyo get() = object {
    /** Onkyo DP-CMX1 */
    val DP_CMX1 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Onkyo DP-X1 */
    val DP_X1 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Onkyo DP-X1A */
    val DP_X1A = "spec:width=720,height=1280,unit=px,dpi=320"

}
