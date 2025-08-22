package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Lebest device specifications for Android Compose previews.
 *
 * This extension provides Lebest device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Lebest.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Lebest get() = object {
    /** Lebest L3 */
    val L3 = "spec:width=720,height=1604,unit=px,dpi=260"

    /** Lebest LeBest L2 */
    val LEBEST_L2 = "spec:width=720,height=1612,unit=px,dpi=260"

}
