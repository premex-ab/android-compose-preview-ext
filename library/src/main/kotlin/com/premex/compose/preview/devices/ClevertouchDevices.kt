package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Clevertouch device specifications for Android Compose previews.
 *
 * This extension provides Clevertouch device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Clevertouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Clevertouch get() = object {
    /** Clevertouch UX Pro Edge */
    val UX_PRO_EDGE = "spec:width=2160,height=3840,unit=px,dpi=480"

    /** Clevertouch X5 */
    val X5 = "spec:width=2160,height=3840,unit=px,dpi=480"

}
