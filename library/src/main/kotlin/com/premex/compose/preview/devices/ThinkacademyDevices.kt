package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Thinkacademy device specifications for Android Compose previews.
 *
 * This extension provides Thinkacademy device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Thinkacademy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Thinkacademy get() = object {
    /** Thinkacademy T100 */
    val T100 = "spec:width=1200,height=1920,unit=px,dpi=240"

}
