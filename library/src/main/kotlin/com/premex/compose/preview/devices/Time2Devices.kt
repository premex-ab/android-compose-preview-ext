package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Time2 device specifications for Android Compose previews.
 *
 * This extension provides Time2 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Time2.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Time2 get() = object {
    /** Time2 TIME2 */
    val TIME2 = "spec:width=800,height=1280,unit=px,dpi=160"

}
