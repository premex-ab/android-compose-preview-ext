package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Blackshark device specifications for Android Compose previews.
 *
 * This extension provides Blackshark device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Blackshark.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Blackshark get() = object {
    /** Blackshark 黑鲨游戏手机 2 Pro */
    val _2_PRO = "spec:width=1080,height=2340,unit=px,dpi=440"

    /** Blackshark Black Shark 2 */
    val BLACK_SHARK_2 = "spec:width=1080,height=2340,unit=px,dpi=440"

    /** Blackshark Black shark 4 pro */
    val BLACK_SHARK_4_PRO = "spec:width=1080,height=2400,unit=px,dpi=440"

    /** Blackshark KLE-A0 */
    val KLE_A0 = "spec:width=1080,height=2400,unit=px,dpi=440"

    /** Blackshark MBU-A0 */
    val MBU_A0 = "spec:width=1440,height=3120,unit=px,dpi=560"

    /** Blackshark Pad6 */
    val PAD6 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Blackshark Shark 1S  */
    val SHARK_1S = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Blackshark SHARK KSR-A0 */
    val SHARK_KSR_A0 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blackshark SHARK PRS-A0 */
    val SHARK_PRS_A0 = "spec:width=1080,height=2400,unit=px,dpi=440"

}
