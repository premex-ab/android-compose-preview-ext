package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Jetfon device specifications for Android Compose previews.
 *
 * This extension provides Jetfon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Jetfon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Jetfon get() = object {
    /** Jetfon MT1 */
    val MT1 = "spec:width=720,height=1600,unit=px,dpi=320"

}
