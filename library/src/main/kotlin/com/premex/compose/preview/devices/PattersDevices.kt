package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Patters device specifications for Android Compose previews.
 *
 * This extension provides Patters device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Patters.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Patters get() = object {
    /** Patters P7 */
    val P7 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Patters P9 */
    val P9 = "spec:width=480,height=960,unit=px,dpi=240"

}
