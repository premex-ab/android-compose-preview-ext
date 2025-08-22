package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Telpo device specifications for Android Compose previews.
 *
 * This extension provides Telpo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Telpo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Telpo get() = object {
    /** Telpo M10 */
    val M10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Telpo M1K */
    val M1K = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Telpo M8 */
    val M8 = "spec:width=800,height=1280,unit=px,dpi=240"

}
