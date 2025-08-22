package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Suxi device specifications for Android Compose previews.
 *
 * This extension provides Suxi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Suxi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Suxi get() = object {
    /** Suxi T700 */
    val T700 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Suxi T900 */
    val T900 = "spec:width=1200,height=1920,unit=px,dpi=280"

}
