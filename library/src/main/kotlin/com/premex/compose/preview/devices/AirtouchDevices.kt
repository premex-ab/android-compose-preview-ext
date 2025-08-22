package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Airtouch device specifications for Android Compose previews.
 *
 * This extension provides Airtouch device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Airtouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Airtouch get() = object {
    /** Airtouch AirTouch5 */
    val AIRTOUCH5 = "spec:width=800,height=1280,unit=px,dpi=160"

}
