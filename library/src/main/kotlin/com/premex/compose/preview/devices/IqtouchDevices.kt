package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Iqtouch device specifications for Android Compose previews.
 *
 * This extension provides Iqtouch device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Iqtouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Iqtouch get() = object {
    /** Iqtouch iMax_EC1053 */
    val IMAX_EC1053 = "spec:width=800,height=1280,unit=px,dpi=213"

}
