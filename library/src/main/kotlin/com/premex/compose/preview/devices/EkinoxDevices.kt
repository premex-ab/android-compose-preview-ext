package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ekinox device specifications for Android Compose previews.
 *
 * This extension provides Ekinox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ekinox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ekinox get() = object {
    /** Ekinox E6 */
    val E6 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Ekinox E8_Ultra */
    val E8_ULTRA = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Ekinox K5 */
    val K5 = "spec:width=540,height=1132,unit=px,dpi=240"

}
