package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zoomme device specifications for Android Compose previews.
 *
 * This extension provides Zoomme device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zoomme.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zoomme get() = object {
    /** Zoomme M2 */
    val M2 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Zoomme M3 */
    val M3 = "spec:width=600,height=1280,unit=px,dpi=240"

}
