package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Olla device specifications for Android Compose previews.
 *
 * This extension provides Olla device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Olla.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Olla get() = object {
    /** Olla M5 */
    val M5 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Olla M6 */
    val M6 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Olla M8 */
    val M8 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Olla Note3 */
    val NOTE3 = "spec:width=1080,height=2340,unit=px,dpi=480"

}
