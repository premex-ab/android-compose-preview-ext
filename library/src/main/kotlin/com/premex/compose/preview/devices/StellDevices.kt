package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Stell device specifications for Android Compose previews.
 *
 * This extension provides Stell device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Stell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Stell get() = object {
    /** Stell M630 */
    val M630 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Stell P760 */
    val P760 = "spec:width=640,height=1280,unit=px,dpi=320"

}
