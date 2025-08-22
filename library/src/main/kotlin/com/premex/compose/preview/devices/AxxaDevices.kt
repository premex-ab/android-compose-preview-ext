package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Axxa device specifications for Android Compose previews.
 *
 * This extension provides Axxa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Axxa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Axxa get() = object {
    /** Axxa AXXA_S45_PLUS */
    val AXXA_S45_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

}
