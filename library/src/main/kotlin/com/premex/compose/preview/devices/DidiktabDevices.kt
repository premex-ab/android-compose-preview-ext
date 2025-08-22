package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Didiktab device specifications for Android Compose previews.
 *
 * This extension provides Didiktab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Didiktab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Didiktab get() = object {
    /** Didiktab DT24 */
    val DT24 = "spec:width=800,height=1280,unit=px,dpi=160"

}
