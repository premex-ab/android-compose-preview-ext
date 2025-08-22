package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Konka device specifications for Android Compose previews.
 *
 * This extension provides Konka device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Konka.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Konka get() = object {
    /** Konka KC516 */
    val KC516 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Konka KC516_Pro */
    val KC516_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Konka KM7012BK */
    val KM7012BK = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Konka M27S */
    val M27S = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Konka N15 */
    val N15 = "spec:width=540,height=1200,unit=px,dpi=240"

    /** Konka N17 */
    val N17 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Konka N7 */
    val N7 = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Konka RE1 */
    val RE1 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Konka RU1 */
    val RU1 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Konka SE1 */
    val SE1 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Konka SE2 */
    val SE2 = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Konka SP10 */
    val SP10 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Konka SP20 */
    val SP20 = "spec:width=444,height=960,unit=px,dpi=240"

    /** Konka sp6 */
    val SP6 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Konka SP9 */
    val SP9 = "spec:width=720,height=1440,unit=px,dpi=320"

}
