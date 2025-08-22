package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Plusstyle device specifications for Android Compose previews.
 *
 * This extension provides Plusstyle device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Plusstyle.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Plusstyle get() = object {
    /** Plusstyle PS_TAB_WB01 */
    val PS_TAB_WB01 = "spec:width=1200,height=1920,unit=px,dpi=240"

}
