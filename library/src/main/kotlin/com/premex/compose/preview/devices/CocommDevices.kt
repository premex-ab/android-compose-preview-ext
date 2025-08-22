package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cocomm device specifications for Android Compose previews.
 *
 * This extension provides Cocomm device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cocomm.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cocomm get() = object {
    /** Cocomm F780 */
    val F780 = "spec:width=480,height=854,unit=px,dpi=200"

    /** Cocomm F900 */
    val F900 = "spec:width=600,height=1024,unit=px,dpi=240"

}
