package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Urovo device specifications for Android Compose previews.
 *
 * This extension provides Urovo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Urovo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Urovo get() = object {
    /** Urovo DT20_EEA */
    val DT20_EEA = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Urovo DT40_EEA */
    val DT40_EEA = "spec:width=480,height=800,unit=px,dpi=240"

    /** Urovo DT50 */
    val DT50 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Urovo DT50 5G */
    val DT50_5G = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Urovo DT66 */
    val DT66 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Urovo i6310 */
    val I6310 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Urovo i9000S */
    val I9000S = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Urovo P8100 */
    val P8100 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Urovo P8100P */
    val P8100P = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Urovo RT40 */
    val RT40 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Urovo RT40S */
    val RT40S = "spec:width=480,height=800,unit=px,dpi=240"

    /** Urovo U2 */
    val U2 = "spec:width=480,height=800,unit=px,dpi=200"

}
