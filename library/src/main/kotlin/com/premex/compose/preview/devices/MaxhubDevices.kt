package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Maxhub device specifications for Android Compose previews.
 *
 * This extension provides Maxhub device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Maxhub.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Maxhub get() = object {
    /** Maxhub E3 */
    val E3 = "spec:width=2160,height=3840,unit=px,dpi=480"

    /** Maxhub U30 */
    val U30 = "spec:width=2160,height=3840,unit=px,dpi=480"

}
