package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Generalmobile device specifications for Android Compose previews.
 *
 * This extension provides Generalmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Generalmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Generalmobile get() = object {
    /** Generalmobile 4G */
    val _4G = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Generalmobile 4G Dual */
    val _4G_DUAL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Generalmobile 5 */
    val _5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Generalmobile e-tab 20 */
    val E_TAB_20 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Generalmobile E-tab 4 */
    val E_TAB_4 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Generalmobile Etab5 */
    val ETAB5 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Generalmobile G518 */
    val G518 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Generalmobile General Mobile 5 d */
    val GENERAL_MOBILE_5_D = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Generalmobile GM10 */
    val GM10 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Generalmobile GM 20 */
    val GM_20 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Generalmobile GM 20 Pro */
    val GM_20_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Generalmobile GM 21  */
    val GM_21 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Generalmobile GM 21 Plus */
    val GM_21_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Generalmobile GM 21 Pro */
    val GM_21_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Generalmobile GM 22  */
    val GM_22 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Generalmobile GM 22 Plus */
    val GM_22_PLUS = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Generalmobile GM 22 Pro */
    val GM_22_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Generalmobile GM 23 Dual */
    val GM_23_DUAL = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Generalmobile GM 23 SE Dual */
    val GM_23_SE_DUAL = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Generalmobile GM 24 Pro  */
    val GM_24_PRO = "spec:width=1080,height=2412,unit=px,dpi=480"

    /** Generalmobile GM5 Plus */
    val GM5_PLUS = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Generalmobile GM5 Plus d */
    val GM5_PLUS_D = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Generalmobile GM5 Plus Turkcell */
    val GM5_PLUS_TURKCELL = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Generalmobile GM 6 d */
    val GM_6_D = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Generalmobile GM 6 ds */
    val GM_6_DS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Generalmobile GM 6 s */
    val GM_6_S = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Generalmobile GM 8 */
    val GM_8 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Generalmobile GM 8 d */
    val GM_8_D = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Generalmobile GM8 Go */
    val GM8_GO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Generalmobile GM 9 Go */
    val GM_9_GO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Generalmobile GM 9 Plus */
    val GM_9_PLUS = "spec:width=1080,height=2280,unit=px,dpi=480"

    /** Generalmobile GM 9 Pro */
    val GM_9_PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Generalmobile GM Era 50 */
    val GM_ERA_50 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Generalmobile GM Phoenix 5G d */
    val GM_PHOENIX_5G_D = "spec:width=1080,height=2400,unit=px,dpi=480"

}
