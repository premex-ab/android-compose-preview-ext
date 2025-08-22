package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Insys device specifications for Android Compose previews.
 *
 * This extension provides Insys device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Insys.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Insys get() = object {
    /** Insys GW2-L1049 */
    val GW2_L1049 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Insys HK9-4010_EEA */
    val HK9_4010_EEA = "spec:width=480,height=800,unit=px,dpi=240"

    /** Insys HN2-M16P */
    val HN2_M16P = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Insys HN2-M16Q */
    val HN2_M16Q = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Insys IH8-S559 */
    val IH8_S559 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Insys IH9-L614 */
    val IH9_L614 = "spec:width=720,height=1520,unit=px,dpi=280"

    /** Insys WH2-9832 */
    val WH2_9832 = "spec:width=800,height=1280,unit=px,dpi=213"

}
