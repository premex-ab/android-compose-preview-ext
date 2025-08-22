package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Highscreen device specifications for Android Compose previews.
 *
 * This extension provides Highscreen device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Highscreen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Highscreen get() = object {
    /** Highscreen Bay */
    val BAY = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Highscreen Expanse */
    val EXPANSE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Highscreen Fest XL */
    val FEST_XL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Highscreen Fest XL PRO */
    val FEST_XL_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Highscreen Max3 */
    val MAX3 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Highscreen Power Five */
    val POWER_FIVE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Highscreen PowerFiveMax2 */
    val POWERFIVEMAX2 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Highscreen PowerFiveMaxLite */
    val POWERFIVEMAXLITE = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Highscreen Power Four */
    val POWER_FOUR = "spec:width=480,height=854,unit=px,dpi=240"

    /** Highscreen Power Ice */
    val POWER_ICE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Highscreen Power Ice EVO */
    val POWER_ICE_EVO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Highscreen PowerIceMax */
    val POWERICEMAX = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Highscreen Power Rage */
    val POWER_RAGE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Highscreen PowerRageEvo */
    val POWERRAGEEVO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Highscreen Prime L */
    val PRIME_L = "spec:width=720,height=1280,unit=px,dpi=320"

}
