package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * E4ua device specifications for Android Compose previews.
 *
 * This extension provides E4ua device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.E4ua.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.E4ua get() = object {
    /** E4ua TAB900 */
    val TAB900 = "spec:width=800,height=1280,unit=px,dpi=213"

}
