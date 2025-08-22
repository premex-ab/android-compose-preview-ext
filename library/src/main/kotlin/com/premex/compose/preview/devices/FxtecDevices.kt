package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Fxtec device specifications for Android Compose previews.
 *
 * This extension provides Fxtec device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Fxtec.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Fxtec get() = object {
    /** Fxtec Fxtec QX1000 */
    val FXTEC_QX1000 = "spec:width=1080,height=2160,unit=px,dpi=480"

}
