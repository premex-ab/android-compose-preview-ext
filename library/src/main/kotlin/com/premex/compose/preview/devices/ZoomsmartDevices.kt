package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zoomsmart device specifications for Android Compose previews.
 *
 * This extension provides Zoomsmart device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zoomsmart.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zoomsmart get() = object {
    /** Zoomsmart LT600T */
    val LT600T = "spec:width=1200,height=1920,unit=px,dpi=360"

    /** Zoomsmart LT800 */
    val LT800 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Zoomsmart ZM800_EEA */
    val ZM800_EEA = "spec:width=800,height=1280,unit=px,dpi=240"

}
