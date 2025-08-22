package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Airpha device specifications for Android Compose previews.
 *
 * This extension provides Airpha device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Airpha.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Airpha get() = object {
    /** Airpha Halo3_Pro */
    val HALO3_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Airpha Halo4 */
    val HALO4 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Airpha Halo4 Pro */
    val HALO4_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

}
