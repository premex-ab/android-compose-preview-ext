package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Fonos device specifications for Android Compose previews.
 *
 * This extension provides Fonos device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Fonos.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Fonos get() = object {
    /** Fonos FONOS O2 */
    val FONOS_O2 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Fonos M1 */
    val M1 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Fonos O3_EEA */
    val O3_EEA = "spec:width=720,height=1440,unit=px,dpi=320"

}
