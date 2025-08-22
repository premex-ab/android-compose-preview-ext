package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tespro device specifications for Android Compose previews.
 *
 * This extension provides Tespro device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tespro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tespro get() = object {
    /** Tespro Mayumi U1 */
    val MAYUMI_U1 = "spec:width=720,height=1520,unit=px,dpi=320"

}
