package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Alpha device specifications for Android Compose previews.
 *
 * This extension provides Alpha device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Alpha.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Alpha get() = object {
    /** Alpha T1_Pro */
    val T1_PRO = "spec:width=600,height=1024,unit=px,dpi=213"

}
