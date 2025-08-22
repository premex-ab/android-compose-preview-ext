package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tkds device specifications for Android Compose previews.
 *
 * This extension provides Tkds device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tkds.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tkds get() = object {
    /** Tkds T_101H */
    val T_101H = "spec:width=800,height=1280,unit=px,dpi=160"

}
