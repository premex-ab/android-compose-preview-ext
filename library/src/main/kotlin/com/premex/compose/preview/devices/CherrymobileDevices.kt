package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cherrymobile device specifications for Android Compose previews.
 *
 * This extension provides Cherrymobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cherrymobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cherrymobile get() = object {
    /** Cherrymobile A840 */
    val A840 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Cherrymobile A850 */
    val A850 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Cherrymobile A860 */
    val A860 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Cherrymobile A890 */
    val A890 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Cherrymobile Aqua_Infinity */
    val AQUA_INFINITY = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Cherrymobile Aqua S10 */
    val AQUA_S10 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Cherrymobile Aqua S10 Pro */
    val AQUA_S10_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Cherrymobile Aqua S10 Pro 5G */
    val AQUA_S10_PRO_5G = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Cherrymobile Aqua S9 */
    val AQUA_S9 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Cherrymobile Aqua S9 Max */
    val AQUA_S9_MAX = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Cherrymobile Aqua SV */
    val AQUA_SV = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Cherrymobile Aqua Tab  */
    val AQUA_TAB = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Cherrymobile Aqua Tab Deluxe */
    val AQUA_TAB_DELUXE = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Cherrymobile Aqua_Tab_Ultra */
    val AQUA_TAB_ULTRA = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Cherrymobile  Cherry Comet  */
    val CHERRY_COMET = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Cherrymobile Cherry S8 Deluxe */
    val CHERRY_S8_DELUXE = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Cherrymobile Flare_A1_Roam */
    val FLARE_A1_ROAM = "spec:width=480,height=960,unit=px,dpi=240"

    /** Cherrymobile Flare HD 4 */
    val FLARE_HD_4 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Cherrymobile Flare_HD_5 */
    val FLARE_HD_5 = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Cherrymobile Flare J1 Lite */
    val FLARE_J1_LITE = "spec:width=480,height=854,unit=px,dpi=240"

    /** Cherrymobile Flare J2 Max */
    val FLARE_J2_MAX = "spec:width=480,height=960,unit=px,dpi=240"

    /** Cherrymobile Flare_J3_Lite */
    val FLARE_J3_LITE = "spec:width=480,height=854,unit=px,dpi=213"

    /** Cherrymobile Flare J3 mini */
    val FLARE_J3_MINI = "spec:width=480,height=960,unit=px,dpi=240"

    /** Cherrymobile Flare J3s */
    val FLARE_J3S = "spec:width=480,height=960,unit=px,dpi=240"

    /** Cherrymobile Flare J5 Mini */
    val FLARE_J5_MINI = "spec:width=480,height=960,unit=px,dpi=240"

    /** Cherrymobile Flare J6 Plus */
    val FLARE_J6_PLUS = "spec:width=720,height=1500,unit=px,dpi=320"

    /** Cherrymobile Flare J7 */
    val FLARE_J7 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Cherrymobile Flare J8 LTE */
    val FLARE_J8_LTE = "spec:width=720,height=1480,unit=px,dpi=320"

    /** Cherrymobile Flare P1 Mini */
    val FLARE_P1_MINI = "spec:width=480,height=800,unit=px,dpi=240"

    /** Cherrymobile Flare P3 lite */
    val FLARE_P3_LITE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Cherrymobile Flare P3 Plus */
    val FLARE_P3_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Cherrymobile Flare S5 */
    val FLARE_S5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Cherrymobile Flare S5 Plus */
    val FLARE_S5_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Cherrymobile Flare S6 */
    val FLARE_S6 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Cherrymobile Flare S7 */
    val FLARE_S7 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Cherrymobile Flare S7 Lite */
    val FLARE_S7_LITE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Cherrymobile Flare S7 Max */
    val FLARE_S7_MAX = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Cherrymobile Flare S7 Mini */
    val FLARE_S7_MINI = "spec:width=480,height=960,unit=px,dpi=240"

    /** Cherrymobile Flare S7 Power */
    val FLARE_S7_POWER = "spec:width=480,height=960,unit=px,dpi=240"

    /** Cherrymobile Flare_S7_Prime */
    val FLARE_S7_PRIME = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Cherrymobile Flare S8 */
    val FLARE_S8 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Cherrymobile Flare S8 Lite */
    val FLARE_S8_LITE = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Cherrymobile Flare S8 Max */
    val FLARE_S8_MAX = "spec:width=1080,height=2244,unit=px,dpi=480"

    /** Cherrymobile Flare_S8_Prime */
    val FLARE_S8_PRIME = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Cherrymobile Flare_S8_Pro */
    val FLARE_S8_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Cherrymobile Flare Tab Pro */
    val FLARE_TAB_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Cherrymobile Flare X */
    val FLARE_X = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Cherrymobile Flare Y3 mini */
    val FLARE_Y3_MINI = "spec:width=480,height=800,unit=px,dpi=240"

    /** Cherrymobile Flare Y5 */
    val FLARE_Y5 = "spec:width=444,height=960,unit=px,dpi=213"

    /** Cherrymobile Flare_Y6_Pro */
    val FLARE_Y6_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Cherrymobile Flare Y7 */
    val FLARE_Y7 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Cherrymobile Flare Y7 LTE */
    val FLARE_Y7_LTE = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Cherrymobile Flare Y7 Pro */
    val FLARE_Y7_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Cherrymobile Magnum 8s */
    val MAGNUM_8S = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Cherrymobile Omage Icon Lite 2 */
    val OMAGE_ICON_LITE_2 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Cherrymobile Omega HD Duo */
    val OMEGA_HD_DUO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Cherrymobile Omega Lite 3s */
    val OMEGA_LITE_3S = "spec:width=480,height=854,unit=px,dpi=240"

    /** Cherrymobile Omega Lite 4 */
    val OMEGA_LITE_4 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Cherrymobile Omega X */
    val OMEGA_X = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Cherrymobile Pulse */
    val PULSE = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Cherrymobile Superion S1 DTV */
    val SUPERION_S1_DTV = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Cherrymobile Superion S2 */
    val SUPERION_S2 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Cherrymobile Superion S2+ */
    val SUPERION_S2_800X1280 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Cherrymobile Superion Tab Pro */
    val SUPERION_TAB_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

}
