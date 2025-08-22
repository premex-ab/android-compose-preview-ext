package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Silentcircle device specifications for Android Compose previews.
 *
 * This extension provides Silentcircle device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Silentcircle.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Silentcircle get() = object {
    /** Silentcircle Blackphone 2 */
    val BLACKPHONE_2 = "spec:width=1080,height=1920,unit=px,dpi=480"

}
