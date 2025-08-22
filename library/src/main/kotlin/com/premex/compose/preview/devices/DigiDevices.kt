package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Digi device specifications for Android Compose previews.
 *
 * This extension provides Digi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Digi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Digi get() = object {
    /** Digi Digi C1 */
    val DIGI_C1 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Digi Digi C2 */
    val DIGI_C2 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Digi Digi_K2_EEA */
    val DIGI_K2_EEA = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Digi Digi R1 */
    val DIGI_R1 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Digi Digi R2 */
    val DIGI_R2 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Digi INFINITY MAX  */
    val INFINITY_MAX = "spec:width=720,height=1600,unit=px,dpi=320"

}
