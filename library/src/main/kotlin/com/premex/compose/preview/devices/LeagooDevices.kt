package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Leagoo device specifications for Android Compose previews.
 *
 * This extension provides Leagoo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Leagoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Leagoo get() = object {
    /** Leagoo KIICAA MIX */
    val KIICAA_MIX = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Leagoo KIICAA POWER */
    val KIICAA_POWER = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Leagoo LeaPad X */
    val LEAPAD_X = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Leagoo M11 */
    val M11 = "spec:width=480,height=996,unit=px,dpi=240"

    /** Leagoo M12 */
    val M12 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Leagoo M12A */
    val M12A = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Leagoo M13 */
    val M13 = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Leagoo M9 */
    val M9 = "spec:width=640,height=1280,unit=px,dpi=320"

    /** Leagoo M9 Pro */
    val M9_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Leagoo P1 */
    val P1 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Leagoo P1 Pro */
    val P1_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Leagoo Power 2 */
    val POWER_2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Leagoo Power 2 Pro */
    val POWER_2_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Leagoo Power 5 */
    val POWER_5 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Leagoo S11 */
    val S11 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Leagoo S8 */
    val S8 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Leagoo S8 Pro */
    val S8_PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Leagoo S9 */
    val S9 = "spec:width=720,height=1512,unit=px,dpi=320"

    /** Leagoo T5 */
    val T5 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Leagoo T5c */
    val T5C = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Leagoo T8 */
    val T8 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Leagoo T8s */
    val T8S = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Leagoo XRover */
    val XROVER = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Leagoo XRover C */
    val XROVER_C = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Leagoo Z10 */
    val Z10 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Leagoo Z9 */
    val Z9 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Leagoo Z9A */
    val Z9A = "spec:width=480,height=854,unit=px,dpi=240"

}
