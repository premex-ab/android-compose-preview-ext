package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Akai device specifications for Android Compose previews.
 *
 * This extension provides Akai device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Akai.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Akai get() = object {
    /** Akai MD1063 */
    val MD1063 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Akai SP5504G */
    val SP5504G = "spec:width=480,height=960,unit=px,dpi=200"

}
