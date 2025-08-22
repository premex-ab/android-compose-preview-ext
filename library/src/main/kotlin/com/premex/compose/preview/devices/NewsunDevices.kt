package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Newsun device specifications for Android Compose previews.
 *
 * This extension provides Newsun device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Newsun.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Newsun get() = object {
    /** Newsun S20 */
    val S20 = "spec:width=600,height=1280,unit=px,dpi=240"

}
