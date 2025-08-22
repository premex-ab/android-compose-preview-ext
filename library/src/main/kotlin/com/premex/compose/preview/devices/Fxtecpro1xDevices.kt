package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Fxtecpro1x device specifications for Android Compose previews.
 *
 * This extension provides Fxtecpro1x device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Fxtecpro1x.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Fxtecpro1x get() = object {
    /** Fxtecpro1x QX1050 */
    val QX1050 = "spec:width=1440,height=2960,unit=px,dpi=440"

}
