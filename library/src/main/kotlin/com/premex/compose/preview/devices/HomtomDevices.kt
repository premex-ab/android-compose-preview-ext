package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Homtom device specifications for Android Compose previews.
 *
 * This extension provides Homtom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Homtom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Homtom get() = object {
    /** Homtom c1 */
    val C1 = "spec:width=640,height=1280,unit=px,dpi=320"

    /** Homtom C2 */
    val C2 = "spec:width=640,height=1280,unit=px,dpi=320"

    /** Homtom H5 */
    val H5 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Homtom HT70 */
    val HT70 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Homtom HT80 */
    val HT80 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Homtom P30 pro */
    val P30_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Homtom S16 */
    val S16 = "spec:width=640,height=1136,unit=px,dpi=320"

    /** Homtom S99 */
    val S99 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Homtom Z8 */
    val Z8 = "spec:width=720,height=1280,unit=px,dpi=320"

}
