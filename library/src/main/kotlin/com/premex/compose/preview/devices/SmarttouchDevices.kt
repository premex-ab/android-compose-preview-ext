package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Smarttouch device specifications for Android Compose previews.
 *
 * This extension provides Smarttouch device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Smarttouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Smarttouch get() = object {
    /** Smarttouch ST IR13 */
    val ST_IR13 = "spec:width=2160,height=3840,unit=px,dpi=480"

}
