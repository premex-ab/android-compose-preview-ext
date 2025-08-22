package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Dunhoo device specifications for Android Compose previews.
 *
 * This extension provides Dunhoo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Dunhoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Dunhoo get() = object {
    /** Dunhoo UPad2 */
    val UPAD2 = "spec:width=800,height=1280,unit=px,dpi=213"

}
