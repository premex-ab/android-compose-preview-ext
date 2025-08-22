package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Fossibot device specifications for Android Compose previews.
 *
 * This extension provides Fossibot device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Fossibot.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Fossibot get() = object {
    /** Fossibot DT1 Lite */
    val DT1_LITE = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Fossibot DT2 */
    val DT2 = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Fossibot F101 */
    val F101 = "spec:width=720,height=1440,unit=px,dpi=280"

    /** Fossibot F101 */
    val F101_720X1440 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Fossibot F101 Pro */
    val F101_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Fossibot F102 ROW */
    val F102_ROW = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Fossibot F105 */
    val F105 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Fossibot F106 Pro ROW */
    val F106_PRO_ROW = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Fossibot F109 */
    val F109 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Fossibot F109 S */
    val F109_S = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Fossibot F112 Pro */
    val F112_PRO = "spec:width=720,height=1640,unit=px,dpi=280"

    /** Fossibot S1 */
    val S1 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Fossibot S2 */
    val S2 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Fossibot S3_Pro */
    val S3_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Fossibot Tab_12 */
    val TAB_12 = "spec:width=1200,height=1920,unit=px,dpi=280"

}
