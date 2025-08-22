package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Wirelessgate device specifications for Android Compose previews.
 *
 * This extension provides Wirelessgate device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Wirelessgate.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Wirelessgate get() = object {
    /** Wirelessgate wg_tablet_01 */
    val WG_TABLET_01 = "spec:width=800,height=1280,unit=px,dpi=200"

}
