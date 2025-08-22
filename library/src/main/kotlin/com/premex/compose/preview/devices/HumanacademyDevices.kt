package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Humanacademy device specifications for Android Compose previews.
 *
 * This extension provides Humanacademy device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Humanacademy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Humanacademy get() = object {
    /** Humanacademy HA-008 */
    val HA_008 = "spec:width=800,height=1280,unit=px,dpi=180"

}
