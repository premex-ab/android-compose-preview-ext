package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Marq device specifications for Android Compose previews.
 *
 * This extension provides Marq device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Marq.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Marq get() = object {
    /** Marq MarQ_M3 */
    val MARQ_M3 = "spec:width=720,height=1560,unit=px,dpi=320"

}
