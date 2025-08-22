package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Figi device specifications for Android Compose previews.
 *
 * This extension provides Figi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Figi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Figi get() = object {
    /** Figi Fj */
    val FJ = "spec:width=600,height=1280,unit=px,dpi=300"

    /** Figi FX */
    val FX = "spec:width=540,height=1132,unit=px,dpi=240"

    /** Figi G6 */
    val G6 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Figi Mtwo */
    val MTWO = "spec:width=480,height=960,unit=px,dpi=240"

    /** Figi Note_11_Pro */
    val NOTE_11_PRO = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Figi Note_1C */
    val NOTE_1C = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Figi Note_1_Lite */
    val NOTE_1_LITE = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Figi Note_3_Pro */
    val NOTE_3_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Figi Note_5 */
    val NOTE_5 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Figi Note_7_Pro */
    val NOTE_7_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

}
