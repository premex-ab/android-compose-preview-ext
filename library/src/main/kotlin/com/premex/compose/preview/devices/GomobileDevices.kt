package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Gomobile device specifications for Android Compose previews.
 *
 * This extension provides Gomobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Gomobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Gomobile get() = object {
    /** Gomobile G860 */
    val G860 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Gomobile GO1452 */
    val GO1452 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Gomobile GO SMART */
    val GO_SMART = "spec:width=480,height=854,unit=px,dpi=240"

    /** Gomobile X6 */
    val X6 = "spec:width=600,height=1280,unit=px,dpi=240"

}
