package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Lesia device specifications for Android Compose previews.
 *
 * This extension provides Lesia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Lesia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Lesia get() = object {
    /** Lesia C5 */
    val C5 = "spec:width=480,height=960,unit=px,dpi=198"

    /** Lesia HOT_30 */
    val HOT_30 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Lesia K2s */
    val K2S = "spec:width=480,height=960,unit=px,dpi=198"

    /** Lesia K6 */
    val K6 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Lesia NEO_9 */
    val NEO_9 = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Lesia SMART_7 */
    val SMART_7 = "spec:width=720,height=1600,unit=px,dpi=320"

}
