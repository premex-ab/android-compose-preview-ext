package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vava device specifications for Android Compose previews.
 *
 * This extension provides Vava device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vava.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vava get() = object {
    /** Vava V1 */
    val V1 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Vava V2 */
    val V2 = "spec:width=540,height=1080,unit=px,dpi=240"

    /** Vava XP3 */
    val XP3 = "spec:width=640,height=1280,unit=px,dpi=320"

}
