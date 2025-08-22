package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Samsung device specifications for Android Compose previews.
 *
 * This extension provides Samsung device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Samsung.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Samsung get() = object {
    /** Samsung Elite */
    val ELITE = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy 070 */
    val GALAXY_070 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy A01 */
    val GALAXY_A01 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Samsung Galaxy A01 Core */
    val GALAXY_A01_CORE = "spec:width=720,height=1480,unit=px,dpi=320"

    /** Samsung Galaxy A03 */
    val GALAXY_A03 = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Samsung Galaxy A03 Core */
    val GALAXY_A03_CORE = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Samsung Galaxy A03s */
    val GALAXY_A03S = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Samsung Galaxy A03s */
    val GALAXY_A03S_720X1600 = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Samsung Galaxy A04 */
    val GALAXY_A04 = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Samsung Galaxy A04e */
    val GALAXY_A04E = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Samsung Galaxy A04s */
    val GALAXY_A04S = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Samsung Galaxy A05 */
    val GALAXY_A05 = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Samsung Galaxy A05s */
    val GALAXY_A05S = "spec:width=1080,height=2400,unit=px,dpi=450"

    /** Samsung Galaxy A06 */
    val GALAXY_A06 = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Samsung Galaxy A06 5G */
    val GALAXY_A06_5G = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Samsung Galaxy A07 */
    val GALAXY_A07 = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Samsung Galaxy A10 */
    val GALAXY_A10 = "spec:width=720,height=1520,unit=px,dpi=280"

    /** Samsung Galaxy A10e */
    val GALAXY_A10E = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Samsung Galaxy A10s */
    val GALAXY_A10S = "spec:width=720,height=1520,unit=px,dpi=280"

    /** Samsung Galaxy A11 */
    val GALAXY_A11 = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Samsung Galaxy A12 */
    val GALAXY_A12 = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Samsung Galaxy A13 */
    val GALAXY_A13 = "spec:width=1080,height=2408,unit=px,dpi=450"

    /** Samsung Galaxy A13 5G */
    val GALAXY_A13_5G = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Samsung Galaxy A14 */
    val GALAXY_A14 = "spec:width=1080,height=2408,unit=px,dpi=450"

    /** Samsung Galaxy A14 5G */
    val GALAXY_A14_5G = "spec:width=1080,height=2408,unit=px,dpi=450"

    /** Samsung Galaxy A15 */
    val GALAXY_A15 = "spec:width=1080,height=2340,unit=px,dpi=450"

    /** Samsung Galaxy A15 5G */
    val GALAXY_A15_5G = "spec:width=1080,height=2340,unit=px,dpi=450"

    /** Samsung Galaxy A16 */
    val GALAXY_A16 = "spec:width=1080,height=2340,unit=px,dpi=450"

    /** Samsung Galaxy A16 5G */
    val GALAXY_A16_5G = "spec:width=1080,height=2340,unit=px,dpi=450"

    /** Samsung Galaxy A20 */
    val GALAXY_A20 = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Samsung Galaxy A20 */
    val GALAXY_A20_720X1560 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Samsung Galaxy A20e */
    val GALAXY_A20E = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Samsung Galaxy A20s */
    val GALAXY_A20S = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Samsung Galaxy A21 */
    val GALAXY_A21 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Samsung Galaxy A21 */
    val GALAXY_A21_720X1600 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Samsung Galaxy A21s */
    val GALAXY_A21S = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Samsung Galaxy A22 */
    val GALAXY_A22 = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Samsung Galaxy A22 5G */
    val GALAXY_A22_5G = "spec:width=1080,height=2408,unit=px,dpi=450"

    /** Samsung Galaxy A22 5G */
    val GALAXY_A22_5G_720X1560 = "spec:width=720,height=1560,unit=px,dpi=300"

    /** Samsung Galaxy A23 */
    val GALAXY_A23 = "spec:width=1080,height=2408,unit=px,dpi=450"

    /** Samsung Galaxy A23 5G */
    val GALAXY_A23_5G = "spec:width=1080,height=2408,unit=px,dpi=450"

    /** Samsung Galaxy A23 5G */
    val GALAXY_A23_5G_720X1560 = "spec:width=720,height=1560,unit=px,dpi=300"

    /** Samsung Galaxy A24 */
    val GALAXY_A24 = "spec:width=1080,height=2340,unit=px,dpi=450"

    /** Samsung Galaxy A25 5G */
    val GALAXY_A25_5G = "spec:width=1080,height=2340,unit=px,dpi=450"

    /** Samsung Galaxy A25 5G */
    val GALAXY_A25_5G_720X1600 = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Samsung Galaxy A26 5G */
    val GALAXY_A26_5G = "spec:width=1080,height=2340,unit=px,dpi=450"

    /** Samsung Galaxy A2 Core */
    val GALAXY_A2_CORE = "spec:width=540,height=960,unit=px,dpi=240"

    /** Samsung Galaxy A3 */
    val GALAXY_A3 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Samsung Galaxy A30 */
    val GALAXY_A30 = "spec:width=1080,height=2340,unit=px,dpi=420"

    /** Samsung Galaxy A30s */
    val GALAXY_A30S = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Samsung Galaxy A31 */
    val GALAXY_A31 = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Samsung Galaxy A32 */
    val GALAXY_A32 = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Samsung Galaxy A3(2016) */
    val GALAXY_A3_2016 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy A3(2017) */
    val GALAXY_A3_2017 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy A32 5G */
    val GALAXY_A32_5G = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Samsung Galaxy A33 5G */
    val GALAXY_A33_5G = "spec:width=1080,height=2400,unit=px,dpi=450"

    /** Samsung Galaxy A34 5G */
    val GALAXY_A34_5G = "spec:width=1080,height=2340,unit=px,dpi=450"

    /** Samsung Galaxy A35 5G */
    val GALAXY_A35_5G = "spec:width=1080,height=2340,unit=px,dpi=450"

    /** Samsung Galaxy A36 5G */
    val GALAXY_A36_5G = "spec:width=1080,height=2340,unit=px,dpi=450"

    /** Samsung Galaxy A40 */
    val GALAXY_A40 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Samsung Galaxy A40s */
    val GALAXY_A40S = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Samsung Galaxy A41 */
    val GALAXY_A41 = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Samsung Galaxy A42 5G */
    val GALAXY_A42_5G = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Samsung Galaxy A5 */
    val GALAXY_A5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy A50 */
    val GALAXY_A50 = "spec:width=1080,height=2340,unit=px,dpi=420"

    /** Samsung Galaxy A50s */
    val GALAXY_A50S = "spec:width=1080,height=2340,unit=px,dpi=420"

    /** Samsung Galaxy A51 */
    val GALAXY_A51 = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Samsung Galaxy A51 5G */
    val GALAXY_A51_5G = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Samsung Galaxy A52 */
    val GALAXY_A52 = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Samsung Galaxy A5 (2016) */
    val GALAXY_A5_2016 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy A5(2017) */
    val GALAXY_A5_2017 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy A52 5G */
    val GALAXY_A52_5G = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Samsung Galaxy A52s 5G */
    val GALAXY_A52S_5G = "spec:width=1080,height=2400,unit=px,dpi=450"

    /** Samsung Galaxy A53 5G */
    val GALAXY_A53_5G = "spec:width=1080,height=2400,unit=px,dpi=450"

    /** Samsung Galaxy A53 5G UW */
    val GALAXY_A53_5G_UW = "spec:width=1080,height=2376,unit=px,dpi=450"

    /** Samsung Galaxy A54 5G */
    val GALAXY_A54_5G = "spec:width=1080,height=2340,unit=px,dpi=450"

    /** Samsung Galaxy A55 5G */
    val GALAXY_A55_5G = "spec:width=1080,height=2340,unit=px,dpi=450"

    /** Samsung Galaxy A56 5G */
    val GALAXY_A56_5G = "spec:width=1080,height=2340,unit=px,dpi=450"

    /** Samsung Galaxy A6+ */
    val GALAXY_A6 = "spec:width=1080,height=2220,unit=px,dpi=420"

    /** Samsung Galaxy A6 */
    val GALAXY_A6_720X1480 = "spec:width=720,height=1480,unit=px,dpi=320"

    /** Samsung Galaxy A60 */
    val GALAXY_A60 = "spec:width=1080,height=2340,unit=px,dpi=420"

    /** Samsung Galaxy A7 */
    val GALAXY_A7 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy A7 */
    val GALAXY_A7_1080X2220 = "spec:width=1080,height=2220,unit=px,dpi=420"

    /** Samsung Galaxy A70 */
    val GALAXY_A70 = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Samsung Galaxy A70s */
    val GALAXY_A70S = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Samsung Galaxy A71 */
    val GALAXY_A71 = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Samsung Galaxy A71 5G */
    val GALAXY_A71_5G = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Samsung Galaxy A72 */
    val GALAXY_A72 = "spec:width=1080,height=2400,unit=px,dpi=450"

    /** Samsung Galaxy A7(2016) */
    val GALAXY_A7_2016 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy A7(2017) */
    val GALAXY_A7_2017 = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Samsung Galaxy A7 (2018) */
    val GALAXY_A7_2018 = "spec:width=1080,height=2220,unit=px,dpi=420"

    /** Samsung Galaxy A73 5G */
    val GALAXY_A73_5G = "spec:width=1080,height=2400,unit=px,dpi=450"

    /** Samsung Galaxy A8 */
    val GALAXY_A8 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy A80 */
    val GALAXY_A80 = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Samsung Galaxy A8(2016) */
    val GALAXY_A8_2016 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy A8+(2018) */
    val GALAXY_A8_2018 = "spec:width=1080,height=2220,unit=px,dpi=420"

    /** Samsung Galaxy A8(2018) */
    val GALAXY_A8_2018_1080X2220 = "spec:width=1080,height=2220,unit=px,dpi=480"

    /** Samsung Galaxy A8s */
    val GALAXY_A8S = "spec:width=1080,height=2340,unit=px,dpi=420"

    /** Samsung Galaxy A8 Star */
    val GALAXY_A8_STAR = "spec:width=1080,height=2220,unit=px,dpi=420"

    /** Samsung Galaxy A90 5G */
    val GALAXY_A90_5G = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Samsung Galaxy-A9(2016) */
    val GALAXY_A9_2016 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy A9 (2018) */
    val GALAXY_A9_2018 = "spec:width=1080,height=2220,unit=px,dpi=420"

    /** Samsung Galaxy A9 Pro */
    val GALAXY_A9_PRO = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Samsung Galaxy A9 Pro */
    val GALAXY_A9_PRO_1080X2340 = "spec:width=1080,height=2340,unit=px,dpi=420"

    /** Samsung Galaxy A9 Star */
    val GALAXY_A9_STAR = "spec:width=1080,height=2220,unit=px,dpi=420"

    /** Samsung Galaxy A9 Star Lite */
    val GALAXY_A9_STAR_LITE = "spec:width=1080,height=2220,unit=px,dpi=420"

    /** Samsung Galaxy Ace */
    val GALAXY_ACE = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Ace2 */
    val GALAXY_ACE2 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Ace3 */
    val GALAXY_ACE3 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Ace3 Duos TV */
    val GALAXY_ACE3_DUOS_TV = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Ace 4 */
    val GALAXY_ACE_4 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Ace4 */
    val GALAXY_ACE4 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Ace4 Lite */
    val GALAXY_ACE4_LITE = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Ace4 Neo */
    val GALAXY_ACE4_NEO = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Ace Style */
    val GALAXY_ACE_STYLE = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Active neo */
    val GALAXY_ACTIVE_NEO = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Alpha */
    val GALAXY_ALPHA = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy Avant */
    val GALAXY_AVANT = "spec:width=540,height=960,unit=px,dpi=240"

    /** Samsung Galaxy Beam */
    val GALAXY_BEAM = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy C5 */
    val GALAXY_C5 = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Samsung Galaxy C5 */
    val GALAXY_C5_1080X1920 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy C5 Pro */
    val GALAXY_C5_PRO = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Samsung Galaxy C7 */
    val GALAXY_C7 = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Samsung Galaxy C7 Pro */
    val GALAXY_C7_PRO = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Samsung Galaxy C8 */
    val GALAXY_C8 = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Samsung Galaxy C9 Pro */
    val GALAXY_C9_PRO = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Samsung Galaxy Camera */
    val GALAXY_CAMERA = "spec:width=720,height=1196,unit=px,dpi=320"

    /** Samsung Galaxy Camera 2 */
    val GALAXY_CAMERA_2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy Chat */
    val GALAXY_CHAT = "spec:width=240,height=320,unit=px,dpi=120"

    /** Samsung Galaxy Core */
    val GALAXY_CORE = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Core */
    val GALAXY_CORE_540X960 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Samsung Galaxy Core 2 */
    val GALAXY_CORE_2 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Core2 */
    val GALAXY_CORE2 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Core Advance */
    val GALAXY_CORE_ADVANCE = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Core Lite */
    val GALAXY_CORE_LITE = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Core LTE */
    val GALAXY_CORE_LTE = "spec:width=540,height=960,unit=px,dpi=240"

    /** Samsung Galaxy Core Max */
    val GALAXY_CORE_MAX = "spec:width=540,height=960,unit=px,dpi=240"

    /** Samsung Galaxy Core Plus */
    val GALAXY_CORE_PLUS = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Core Prime */
    val GALAXY_CORE_PRIME = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Discover */
    val GALAXY_DISCOVER = "spec:width=320,height=480,unit=px,dpi=160"

    /** Samsung Galaxy E5 */
    val GALAXY_E5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy E7 */
    val GALAXY_E7 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy Elite */
    val GALAXY_ELITE = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Exhibit */
    val GALAXY_EXHIBIT = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Express */
    val GALAXY_EXPRESS = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Express2 */
    val GALAXY_EXPRESS2 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Samsung Galaxy F12 */
    val GALAXY_F12 = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Samsung Galaxy F15 5G */
    val GALAXY_F15_5G = "spec:width=1080,height=2340,unit=px,dpi=450"

    /** Samsung Galaxy F22 */
    val GALAXY_F22 = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Samsung Galaxy F23 5G */
    val GALAXY_F23_5G = "spec:width=1080,height=2408,unit=px,dpi=450"

    /** Samsung Galaxy F34 5G */
    val GALAXY_F34_5G = "spec:width=1080,height=2340,unit=px,dpi=450"

    /** Samsung Galaxy F41 */
    val GALAXY_F41 = "spec:width=1080,height=2340,unit=px,dpi=420"

    /** Samsung Galaxy F42 5G */
    val GALAXY_F42_5G = "spec:width=1080,height=2408,unit=px,dpi=450"

    /** Samsung Galaxy F52 5G */
    val GALAXY_F52_5G = "spec:width=1080,height=2408,unit=px,dpi=450"

    /** Samsung Galaxy F54 5G */
    val GALAXY_F54_5G = "spec:width=1080,height=2400,unit=px,dpi=450"

    /** Samsung Galaxy F62 */
    val GALAXY_F62 = "spec:width=1080,height=2400,unit=px,dpi=450"

    /** Samsung Galaxy Fame */
    val GALAXY_FAME = "spec:width=320,height=480,unit=px,dpi=160"

    /** Samsung Galaxy Fame Lite Duos */
    val GALAXY_FAME_LITE_DUOS = "spec:width=320,height=480,unit=px,dpi=160"

    /** Samsung Galaxy Feel */
    val GALAXY_FEEL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy Feel2 */
    val GALAXY_FEEL2 = "spec:width=720,height=1480,unit=px,dpi=320"

    /** Samsung Galaxy Flip7 FE */
    val GALAXY_FLIP7_FE = "spec:width=1080,height=2640,unit=px,dpi=480"

    /** Samsung Galaxy Fold */
    val GALAXY_FOLD = "spec:width=1536,height=2152,unit=px,dpi=420"

    /** Samsung Galaxy Folder */
    val GALAXY_FOLDER = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Folder2 */
    val GALAXY_FOLDER2 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Golden */
    val GALAXY_GOLDEN = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Go Prime */
    val GALAXY_GO_PRIME = "spec:width=540,height=960,unit=px,dpi=240"

    /** Samsung Galaxy Grand */
    val GALAXY_GRAND = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Grand2 */
    val GALAXY_GRAND2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy Grand Duos */
    val GALAXY_GRAND_DUOS = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Grand Max */
    val GALAXY_GRAND_MAX = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy Grand Neo */
    val GALAXY_GRAND_NEO = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Grand Neo Plus */
    val GALAXY_GRAND_NEO_PLUS = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Grand Prime */
    val GALAXY_GRAND_PRIME = "spec:width=540,height=960,unit=px,dpi=240"

    /** Samsung Galaxy Grand Prime Plus */
    val GALAXY_GRAND_PRIME_PLUS = "spec:width=540,height=960,unit=px,dpi=240"

    /** Samsung Galaxy J */
    val GALAXY_J = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy J1 */
    val GALAXY_J1 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy J1 (2016) */
    val GALAXY_J1_2016 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy J1 Ace */
    val GALAXY_J1_ACE = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy J1 Mini */
    val GALAXY_J1_MINI = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy J1 Mini Prime */
    val GALAXY_J1_MINI_PRIME = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy J2 */
    val GALAXY_J2 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Samsung Galaxy J2(2016) */
    val GALAXY_J2_2016 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J2 Core */
    val GALAXY_J2_CORE = "spec:width=540,height=960,unit=px,dpi=240"

    /** Samsung Galaxy J2 Prime */
    val GALAXY_J2_PRIME = "spec:width=540,height=960,unit=px,dpi=240"

    /** Samsung Galaxy J2 Pro */
    val GALAXY_J2_PRO = "spec:width=540,height=960,unit=px,dpi=240"

    /** Samsung Galaxy J2 Pro */
    val GALAXY_J2_PRO_720X1280 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J2 Pure */
    val GALAXY_J2_PURE = "spec:width=540,height=960,unit=px,dpi=240"

    /** Samsung Galaxy J3 */
    val GALAXY_J3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J3(2016) */
    val GALAXY_J3_2016 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J3(2017) */
    val GALAXY_J3_2017 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J3(2018) */
    val GALAXY_J3_2018 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J3 Achieve */
    val GALAXY_J3_ACHIEVE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J3 Aura */
    val GALAXY_J3_AURA = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J3 Emerge */
    val GALAXY_J3_EMERGE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J3 Mission */
    val GALAXY_J3_MISSION = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J3 Orbit */
    val GALAXY_J3_ORBIT = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J3 Pop */
    val GALAXY_J3_POP = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J3 Prime */
    val GALAXY_J3_PRIME = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J3 Pro */
    val GALAXY_J3_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J3 Star */
    val GALAXY_J3_STAR = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J3 V */
    val GALAXY_J3_V = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J4 */
    val GALAXY_J4 = "spec:width=720,height=1280,unit=px,dpi=280"

    /** Samsung Galaxy J4+ */
    val GALAXY_J4_720X1480 = "spec:width=720,height=1480,unit=px,dpi=280"

    /** Samsung Galaxy J4 Core */
    val GALAXY_J4_CORE = "spec:width=720,height=1480,unit=px,dpi=320"

    /** Samsung Galaxy J5 */
    val GALAXY_J5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J5(2016) */
    val GALAXY_J5_2016 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J5 Prime */
    val GALAXY_J5_PRIME = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J5 Pro */
    val GALAXY_J5_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J6+ */
    val GALAXY_J6 = "spec:width=720,height=1480,unit=px,dpi=280"

    /** Samsung Galaxy J6 */
    val GALAXY_J6_720X1480 = "spec:width=720,height=1480,unit=px,dpi=320"

    /** Samsung Galaxy J7+ */
    val GALAXY_J7 = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Samsung Galaxy J7 */
    val GALAXY_J7_720X1280 = "spec:width=720,height=1280,unit=px,dpi=280"

    /** Samsung Galaxy J7 */
    val GALAXY_J7_720X1280_1 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J7(2015) */
    val GALAXY_J7_2015 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J7(2016) */
    val GALAXY_J7_2016 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy J7(2016) */
    val GALAXY_J7_2016_720X1280 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J7(2017) */
    val GALAXY_J7_2017 = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Samsung Galaxy J7 Aura */
    val GALAXY_J7_AURA = "spec:width=720,height=1280,unit=px,dpi=280"

    /** Samsung Galaxy J7 Crown */
    val GALAXY_J7_CROWN = "spec:width=720,height=1280,unit=px,dpi=280"

    /** Samsung Galaxy J7 Duo */
    val GALAXY_J7_DUO = "spec:width=720,height=1280,unit=px,dpi=280"

    /** Samsung Galaxy J7 Max */
    val GALAXY_J7_MAX = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Samsung Galaxy J7 Neo */
    val GALAXY_J7_NEO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J7 Perx */
    val GALAXY_J7_PERX = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J7 Pop */
    val GALAXY_J7_POP = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J7 Prime */
    val GALAXY_J7_PRIME = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy J7 Prime */
    val GALAXY_J7_PRIME_720X1280 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J7 Prime2 */
    val GALAXY_J7_PRIME2 = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Samsung Galaxy J7 Pro */
    val GALAXY_J7_PRO = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Samsung Galaxy J7 Refine */
    val GALAXY_J7_REFINE = "spec:width=720,height=1280,unit=px,dpi=280"

    /** Samsung Galaxy J7 Sky Pro */
    val GALAXY_J7_SKY_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy J7 Star */
    val GALAXY_J7_STAR = "spec:width=720,height=1280,unit=px,dpi=280"

    /** Samsung Galaxy J7 V */
    val GALAXY_J7_V = "spec:width=720,height=1280,unit=px,dpi=280"

    /** Samsung Galaxy Jean */
    val GALAXY_JEAN = "spec:width=1080,height=2220,unit=px,dpi=420"

    /** Samsung Galaxy Jump3 */
    val GALAXY_JUMP3 = "spec:width=1080,height=2408,unit=px,dpi=450"

    /** Samsung Galaxy Jump4 */
    val GALAXY_JUMP4 = "spec:width=1080,height=2340,unit=px,dpi=450"

    /** Samsung Galaxy K Zoom */
    val GALAXY_K_ZOOM = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy M01 */
    val GALAXY_M01 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Samsung Galaxy M02 */
    val GALAXY_M02 = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Samsung Galaxy M02s */
    val GALAXY_M02S = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Samsung Galaxy M04 */
    val GALAXY_M04 = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Samsung Galaxy M10 */
    val GALAXY_M10 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Samsung Galaxy M10s */
    val GALAXY_M10S = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Samsung Galaxy M11 */
    val GALAXY_M11 = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Samsung Galaxy M12 */
    val GALAXY_M12 = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Samsung Galaxy M13 */
    val GALAXY_M13 = "spec:width=1080,height=2408,unit=px,dpi=450"

    /** Samsung Galaxy M14 5G */
    val GALAXY_M14_5G = "spec:width=1080,height=2408,unit=px,dpi=450"

    /** Samsung Galaxy M16 5G */
    val GALAXY_M16_5G = "spec:width=1080,height=2340,unit=px,dpi=450"

    /** Samsung Galaxy M20 */
    val GALAXY_M20 = "spec:width=1080,height=2340,unit=px,dpi=420"

    /** Samsung Galaxy M21 2021 Edition */
    val GALAXY_M21_2021_EDITION = "spec:width=1080,height=2340,unit=px,dpi=420"

    /** Samsung Galaxy M22 */
    val GALAXY_M22 = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Samsung Galaxy M30 */
    val GALAXY_M30 = "spec:width=1080,height=2340,unit=px,dpi=420"

    /** Samsung Galaxy M30s */
    val GALAXY_M30S = "spec:width=1080,height=2340,unit=px,dpi=420"

    /** Samsung Galaxy M31 */
    val GALAXY_M31 = "spec:width=1080,height=2340,unit=px,dpi=420"

    /** Samsung Galaxy M31s */
    val GALAXY_M31S = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Samsung Galaxy M32 */
    val GALAXY_M32 = "spec:width=1080,height=2400,unit=px,dpi=450"

    /** Samsung Galaxy M32 5G */
    val GALAXY_M32_5G = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Samsung Galaxy M33 5G */
    val GALAXY_M33_5G = "spec:width=1080,height=2408,unit=px,dpi=450"

    /** Samsung Galaxy M35 5G */
    val GALAXY_M35_5G = "spec:width=1080,height=2340,unit=px,dpi=450"

    /** Samsung Galaxy M40 */
    val GALAXY_M40 = "spec:width=1080,height=2340,unit=px,dpi=420"

    /** Samsung Galaxy M42 5G */
    val GALAXY_M42_5G = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Samsung Galaxy M51 */
    val GALAXY_M51 = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Samsung Galaxy M52 5G */
    val GALAXY_M52_5G = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Samsung Galaxy M53 5G */
    val GALAXY_M53_5G = "spec:width=1080,height=2400,unit=px,dpi=450"

    /** Samsung Galaxy M55s 5G */
    val GALAXY_M55S_5G = "spec:width=1080,height=2400,unit=px,dpi=450"

    /** Samsung Galaxy M56 5G */
    val GALAXY_M56_5G = "spec:width=1080,height=2340,unit=px,dpi=450"

    /** Samsung Galaxy M62 */
    val GALAXY_M62 = "spec:width=1080,height=2400,unit=px,dpi=450"

    /** Samsung Galaxy Mega2 */
    val GALAXY_MEGA2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy Mega 5.8 */
    val GALAXY_MEGA_5_8 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Samsung Galaxy Mega 6.3 */
    val GALAXY_MEGA_6_3 = "spec:width=720,height=1280,unit=px,dpi=240"

    /** Samsung Galaxy Mega Plus */
    val GALAXY_MEGA_PLUS = "spec:width=540,height=960,unit=px,dpi=240"

    /** Samsung Galaxy Nexus */
    val GALAXY_NEXUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy Note */
    val GALAXY_NOTE = "spec:width=800,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy Note10 */
    val GALAXY_NOTE10 = "spec:width=1080,height=2280,unit=px,dpi=420"

    /** Samsung Galaxy Note10+ */
    val GALAXY_NOTE10_1440X3040 = "spec:width=1440,height=3040,unit=px,dpi=420"

    /** Samsung Galaxy Note 10.1 */
    val GALAXY_NOTE_10_1 = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Samsung Galaxy Note 10.1 */
    val GALAXY_NOTE_10_1_752X1280 = "spec:width=752,height=1280,unit=px,dpi=160"

    /** Samsung Galaxy Note 10.1 */
    val GALAXY_NOTE_10_1_800X1280 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Samsung Galaxy Note 10.1 2014 Edition */
    val GALAXY_NOTE_10_1_2014_EDITION = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Samsung Galaxy Note10 5G */
    val GALAXY_NOTE10_5G = "spec:width=1080,height=2280,unit=px,dpi=420"

    /** Samsung Galaxy Note10+ 5G */
    val GALAXY_NOTE10_5G_1440X3040 = "spec:width=1440,height=3040,unit=px,dpi=420"

    /** Samsung Galaxy Note10 Lite */
    val GALAXY_NOTE10_LITE = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Samsung Galaxy Note2 */
    val GALAXY_NOTE2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy Note20 */
    val GALAXY_NOTE20 = "spec:width=1080,height=2248,unit=px,dpi=450"

    /** Samsung Galaxy Note20 5G */
    val GALAXY_NOTE20_5G = "spec:width=1080,height=2248,unit=px,dpi=450"

    /** Samsung Galaxy Note20 Ultra */
    val GALAXY_NOTE20_ULTRA = "spec:width=1080,height=2248,unit=px,dpi=420"

    /** Samsung Galaxy Note20 Ultra 5G */
    val GALAXY_NOTE20_ULTRA_5G = "spec:width=1080,height=2248,unit=px,dpi=420"

    /** Samsung Galaxy Note20 Ultra 5G */
    val GALAXY_NOTE20_ULTRA_5G_1440X3088 = "spec:width=1440,height=3088,unit=px,dpi=420"

    /** Samsung Galaxy Note3 */
    val GALAXY_NOTE3 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy Note3 Neo */
    val GALAXY_NOTE3_NEO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy Note4 */
    val GALAXY_NOTE4 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy Note4 */
    val GALAXY_NOTE4_1440X2560 = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** Samsung Galaxy Note4 S-LTE */
    val GALAXY_NOTE4_S_LTE = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** Samsung Galaxy Note5 */
    val GALAXY_NOTE5 = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Samsung Galaxy Note5 */
    val GALAXY_NOTE5_1080X1920 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy Note5 */
    val GALAXY_NOTE5_DPI560 = "spec:width=1080,height=1920,unit=px,dpi=560"

    /** Samsung Galaxy Note7 */
    val GALAXY_NOTE7 = "spec:width=1440,height=2560,unit=px,dpi=560"

    /** Samsung Galaxy Note7 */
    val GALAXY_NOTE7_1440X2560 = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** Samsung Galaxy Note8 */
    val GALAXY_NOTE8 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy Note8 */
    val GALAXY_NOTE8_1080X2220 = "spec:width=1080,height=2220,unit=px,dpi=420"

    /** Samsung Galaxy Note8 */
    val GALAXY_NOTE8_DPI420 = "spec:width=1440,height=2960,unit=px,dpi=420"

    /** Samsung Galaxy Note 8.0 */
    val GALAXY_NOTE_8_0 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Samsung Galaxy Note9 */
    val GALAXY_NOTE9 = "spec:width=1440,height=2960,unit=px,dpi=420"

    /** Samsung Galaxy Note Edge */
    val GALAXY_NOTE_EDGE = "spec:width=1600,height=2560,unit=px,dpi=640"

    /** Samsung Galaxy Note Fan Edition */
    val GALAXY_NOTE_FAN_EDITION = "spec:width=1440,height=2560,unit=px,dpi=420"

    /** Samsung Galaxy Note II */
    val GALAXY_NOTE_II = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy Note Pro 12.2 */
    val GALAXY_NOTE_PRO_12_2 = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Samsung Galaxy On5 */
    val GALAXY_ON5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy On5 2016 时尚版 */
    val GALAXY_ON5_2016 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy On5 Pro */
    val GALAXY_ON5_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy On7 */
    val GALAXY_ON7 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy On7(2016) */
    val GALAXY_ON7_2016 = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Samsung Galaxy On7(2016) */
    val GALAXY_ON7_2016_1080X1920 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy On7 Prime */
    val GALAXY_ON7_PRIME = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Samsung Galaxy On7 Pro */
    val GALAXY_ON7_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy On8 */
    val GALAXY_ON8 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy On8 */
    val GALAXY_ON8_720X1480 = "spec:width=720,height=1480,unit=px,dpi=280"

    /** Samsung Galaxy Pocket2 */
    val GALAXY_POCKET2 = "spec:width=240,height=320,unit=px,dpi=120"

    /** Samsung Galaxy Pocket Neo */
    val GALAXY_POCKET_NEO = "spec:width=240,height=320,unit=px,dpi=120"

    /** Samsung Galaxy Pop */
    val GALAXY_POP = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy Prevail2 */
    val GALAXY_PREVAIL2 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Quantum2 */
    val GALAXY_QUANTUM2 = "spec:width=1440,height=3200,unit=px,dpi=450"

    /** Samsung Galaxy Rugby */
    val GALAXY_RUGBY = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Rugby Pro */
    val GALAXY_RUGBY_PRO = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy S 轻奢版 */
    val GALAXY_S = "spec:width=1080,height=2220,unit=px,dpi=420"

    /** Samsung Galaxy S10 */
    val GALAXY_S10 = "spec:width=1440,height=3040,unit=px,dpi=420"

    /** Samsung Galaxy S10 5G */
    val GALAXY_S10_5G = "spec:width=1440,height=3040,unit=px,dpi=420"

    /** Samsung Galaxy S10e */
    val GALAXY_S10E = "spec:width=1080,height=2280,unit=px,dpi=480"

    /** Samsung Galaxy S10 Lite */
    val GALAXY_S10_LITE = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Samsung Galaxy S10+ Olympic Games Edition */
    val GALAXY_S10_OLYMPIC_GAMES_EDITION = "spec:width=1440,height=3040,unit=px,dpi=420"

    /** Samsung Galaxy S2 */
    val GALAXY_S2 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy S2 */
    val GALAXY_S2_480X800 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy S20 */
    val GALAXY_S20 = "spec:width=1440,height=3200,unit=px,dpi=480"

    /** Samsung Galaxy S20+ 5G */
    val GALAXY_S20_5G = "spec:width=1440,height=3200,unit=px,dpi=450"

    /** Samsung Galaxy S20 5G */
    val GALAXY_S20_5G_1440X3200 = "spec:width=1440,height=3200,unit=px,dpi=480"

    /** Samsung Galaxy S20 FE */
    val GALAXY_S20_FE = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Samsung Galaxy S20 FE 5G */
    val GALAXY_S20_FE_5G = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Samsung Galaxy S20 Ultra 5G */
    val GALAXY_S20_ULTRA_5G = "spec:width=1440,height=3200,unit=px,dpi=240"

    /** Samsung Galaxy S20 Ultra 5G */
    val GALAXY_S20_ULTRA_5G_1440X3200 = "spec:width=1440,height=3200,unit=px,dpi=420"

    /** Samsung Galaxy S21 5G */
    val GALAXY_S21_5G = "spec:width=1080,height=2248,unit=px,dpi=480"

    /** Samsung Galaxy S21+ 5G */
    val GALAXY_S21_5G_1080X2400 = "spec:width=1080,height=2400,unit=px,dpi=450"

    /** Samsung Galaxy S21 5G */
    val GALAXY_S21_5G_DPI480 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Samsung Galaxy S21 FE 5G */
    val GALAXY_S21_FE_5G = "spec:width=1080,height=2248,unit=px,dpi=480"

    /** Samsung Galaxy S21 FE 5G */
    val GALAXY_S21_FE_5G_1080X2340 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Samsung Galaxy S21 Ultra 5G */
    val GALAXY_S21_ULTRA_5G = "spec:width=1440,height=2560,unit=px,dpi=240"

    /** Samsung Galaxy S21 Ultra 5G */
    val GALAXY_S21_ULTRA_5G_1440X3200 = "spec:width=1440,height=3200,unit=px,dpi=450"

    /** Samsung Galaxy S22+ */
    val GALAXY_S22 = "spec:width=1080,height=2340,unit=px,dpi=450"

    /** Samsung Galaxy S22 */
    val GALAXY_S22_1080X2340 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Samsung Galaxy S22 Ultra */
    val GALAXY_S22_ULTRA = "spec:width=1440,height=3088,unit=px,dpi=240"

    /** Samsung Galaxy S22 Ultra */
    val GALAXY_S22_ULTRA_1440X3088 = "spec:width=1440,height=3088,unit=px,dpi=450"

    /** Samsung Galaxy S23+ */
    val GALAXY_S23 = "spec:width=1080,height=2340,unit=px,dpi=450"

    /** Samsung Galaxy S23 */
    val GALAXY_S23_1080X2340 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Samsung Galaxy S23 FE */
    val GALAXY_S23_FE = "spec:width=1080,height=2340,unit=px,dpi=450"

    /** Samsung Galaxy S23 Ultra */
    val GALAXY_S23_ULTRA = "spec:width=1080,height=2248,unit=px,dpi=450"

    /** Samsung Galaxy S23 Ultra */
    val GALAXY_S23_ULTRA_1440X3088 = "spec:width=1440,height=3088,unit=px,dpi=450"

    /** Samsung Galaxy S24 */
    val GALAXY_S24 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Samsung Galaxy S24+ */
    val GALAXY_S24_1440X3120 = "spec:width=1440,height=3120,unit=px,dpi=450"

    /** Samsung Galaxy S24 FE */
    val GALAXY_S24_FE = "spec:width=1080,height=2340,unit=px,dpi=450"

    /** Samsung Galaxy S24 Ultra */
    val GALAXY_S24_ULTRA = "spec:width=1440,height=3120,unit=px,dpi=450"

    /** Samsung Galaxy S25 */
    val GALAXY_S25 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Samsung Galaxy S25+ */
    val GALAXY_S25_1440X3120 = "spec:width=1440,height=3120,unit=px,dpi=450"

    /** Samsung Galaxy S25 Edge */
    val GALAXY_S25_EDGE = "spec:width=1440,height=3120,unit=px,dpi=450"

    /** Samsung Galaxy S25 Ultra */
    val GALAXY_S25_ULTRA = "spec:width=1440,height=3120,unit=px,dpi=450"

    /** Samsung Galaxy S2 Epic */
    val GALAXY_S2_EPIC = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy S2 Epic */
    val GALAXY_S2_EPIC_480X800 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy S2 Plus */
    val GALAXY_S2_PLUS = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy S3 */
    val GALAXY_S3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy S3 Mini */
    val GALAXY_S3_MINI = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy S3 Mini Value Edition */
    val GALAXY_S3_MINI_VALUE_EDITION = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy S3 Neo */
    val GALAXY_S3_NEO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy S3 Slim */
    val GALAXY_S3_SLIM = "spec:width=540,height=960,unit=px,dpi=240"

    /** Samsung Galaxy S4 */
    val GALAXY_S4 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy S4 Active */
    val GALAXY_S4_ACTIVE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy S4 Duos */
    val GALAXY_S4_DUOS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy S4 LTE-A */
    val GALAXY_S4_LTE_A = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy S4 Mini */
    val GALAXY_S4_MINI = "spec:width=540,height=960,unit=px,dpi=240"

    /** Samsung Galaxy S4 Zoom */
    val GALAXY_S4_ZOOM = "spec:width=540,height=960,unit=px,dpi=240"

    /** Samsung Galaxy S5 */
    val GALAXY_S5 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy S5 */
    val GALAXY_S5_1440X2560 = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** Samsung Galaxy S5 Active */
    val GALAXY_S5_ACTIVE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy S5 K Sport */
    val GALAXY_S5_K_SPORT = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy S5 LTE-A */
    val GALAXY_S5_LTE_A = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy S5 mini */
    val GALAXY_S5_MINI = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy S5 Neo */
    val GALAXY_S5_NEO = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy S6 */
    val GALAXY_S6 = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** Samsung Galaxy S6 Active */
    val GALAXY_S6_ACTIVE = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** Samsung Galaxy S6 edge+ */
    val GALAXY_S6_EDGE = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Samsung Galaxy S6 Edge+ */
    val GALAXY_S6_EDGE_1080X1920 = "spec:width=1080,height=1920,unit=px,dpi=560"

    /** Samsung Galaxy S6 Edge+ */
    val GALAXY_S6_EDGE_DPI560 = "spec:width=1440,height=2560,unit=px,dpi=560"

    /** Samsung Galaxy S6 edge */
    val GALAXY_S6_EDGE_DPI640 = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** Samsung Galaxy S7 */
    val GALAXY_S7 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy S7 */
    val GALAXY_S7_1080X1920 = "spec:width=1080,height=1920,unit=px,dpi=640"

    /** Samsung Galaxy S7 Active */
    val GALAXY_S7_ACTIVE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy S7 edge */
    val GALAXY_S7_EDGE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy S7 Edge */
    val GALAXY_S7_EDGE_1080X1920 = "spec:width=1080,height=1920,unit=px,dpi=640"

    /** Samsung Galaxy S7 Edge */
    val GALAXY_S7_EDGE_DPI560 = "spec:width=1440,height=2960,unit=px,dpi=560"

    /** Samsung Galaxy S8+ */
    val GALAXY_S8 = "spec:width=1080,height=2220,unit=px,dpi=420"

    /** Samsung Galaxy S8 */
    val GALAXY_S8_1080X2220 = "spec:width=1080,height=2220,unit=px,dpi=480"

    /** Samsung Galaxy S8+ */
    val GALAXY_S8_DPI420 = "spec:width=1440,height=2960,unit=px,dpi=420"

    /** Samsung Galaxy S8 */
    val GALAXY_S8_DPI480 = "spec:width=1440,height=2960,unit=px,dpi=480"

    /** Samsung Galaxy S8 Active */
    val GALAXY_S8_ACTIVE = "spec:width=1440,height=2960,unit=px,dpi=480"

    /** Samsung Galaxy S9 */
    val GALAXY_S9 = "spec:width=1080,height=2220,unit=px,dpi=320"

    /** Samsung Galaxy S9+ */
    val GALAXY_S9_1080X2220 = "spec:width=1080,height=2220,unit=px,dpi=420"

    /** Samsung Galaxy S9+ */
    val GALAXY_S9_DPI420 = "spec:width=1440,height=2960,unit=px,dpi=420"

    /** Samsung Galaxy S9 */
    val GALAXY_S9_DPI480 = "spec:width=1440,height=2960,unit=px,dpi=480"

    /** Samsung Galaxy S Advance */
    val GALAXY_S_ADVANCE = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy S Duos2 */
    val GALAXY_S_DUOS2 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy S Duos3 */
    val GALAXY_S_DUOS3 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Star */
    val GALAXY_STAR = "spec:width=240,height=320,unit=px,dpi=120"

    /** Samsung Galaxy Star2 Plus */
    val GALAXY_STAR2_PLUS = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Star Plus */
    val GALAXY_STAR_PLUS = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Stellar */
    val GALAXY_STELLAR = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Tab */
    val GALAXY_TAB = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Samsung Galaxy Tab2 10.1  */
    val GALAXY_TAB2_10_1 = "spec:width=752,height=1280,unit=px,dpi=160"

    /** Samsung Galaxy Tab2 10.1 */
    val GALAXY_TAB2_10_1_800X1280 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Samsung Galaxy Tab2 7.0 */
    val GALAXY_TAB2_7_0 = "spec:width=600,height=976,unit=px,dpi=160"

    /** Samsung Galaxy Tab3 10.1 */
    val GALAXY_TAB3_10_1 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Samsung Galaxy Tab3 7.0 */
    val GALAXY_TAB3_7_0 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Samsung Galaxy Tab3 8.0 */
    val GALAXY_TAB3_8_0 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Samsung Galaxy Tab3 Kids */
    val GALAXY_TAB3_KIDS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Samsung Galaxy Tab3 Lite */
    val GALAXY_TAB3_LITE = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Samsung Galaxy Tab3 Lite 7.0 */
    val GALAXY_TAB3_LITE_7_0 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Samsung Galaxy Tab 3V 7.0 */
    val GALAXY_TAB_3V_7_0 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Samsung Galaxy Tab3V 7.0 */
    val GALAXY_TAB3V_7_0 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Samsung Galaxy Tab3 VE 7.0 */
    val GALAXY_TAB3_VE_7_0 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Samsung Galaxy Tab4  */
    val GALAXY_TAB4 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Samsung Galaxy Tab4 10.0 */
    val GALAXY_TAB4_10_0 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Samsung Galaxy Tab4 10.1 */
    val GALAXY_TAB4_10_1 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Samsung Galaxy Tab4 7 */
    val GALAXY_TAB4_7 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Samsung Galaxy Tab4 7.0 */
    val GALAXY_TAB4_7_0 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Samsung Galaxy Tab 4 8.0 */
    val GALAXY_TAB_4_8_0 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Samsung Galaxy Tab4 8.0 */
    val GALAXY_TAB4_8_0 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Samsung Galaxy Tab4 Active */
    val GALAXY_TAB4_ACTIVE = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Samsung Galaxy Tab4 Nook 10.1 */
    val GALAXY_TAB4_NOOK_10_1 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Samsung Galaxy Tab 7.0 Plus */
    val GALAXY_TAB_7_0_PLUS = "spec:width=600,height=976,unit=px,dpi=160"

    /** Samsung Galaxy Tab 7.7 */
    val GALAXY_TAB_7_7 = "spec:width=800,height=1232,unit=px,dpi=160"

    /** Samsung Galaxy Tab A */
    val GALAXY_TAB_A = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Samsung Galaxy Tab A */
    val GALAXY_TAB_A_768X1024 = "spec:width=768,height=1024,unit=px,dpi=160"

    /** Samsung Galaxy Tab A */
    val GALAXY_TAB_A_800X1280 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Samsung Galaxy Tab A (10.5) */
    val GALAXY_TAB_A_10_5 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Samsung Galaxy Tab A (2016) */
    val GALAXY_TAB_A_2016 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Samsung Galaxy Tab A (2016) with S Pen */
    val GALAXY_TAB_A_2016_WITH_S_PEN = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Samsung Galaxy Tab A (2017) */
    val GALAXY_TAB_A_2017 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Samsung Galaxy Tab A6 */
    val GALAXY_TAB_A6 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Samsung Galaxy Tab A7 */
    val GALAXY_TAB_A7 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Samsung Galaxy Tab A 7.0 */
    val GALAXY_TAB_A_7_0 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Samsung Galaxy Tab A 7.0 */
    val GALAXY_TAB_A_7_0_800X1280 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Samsung Galaxy Tab A7 Lite */
    val GALAXY_TAB_A7_LITE = "spec:width=800,height=1340,unit=px,dpi=213"

    /** Samsung Galaxy Tab A 8 */
    val GALAXY_TAB_A_8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Samsung Galaxy Tab A8 */
    val GALAXY_TAB_A8 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Samsung Galaxy Tab A 8.0 */
    val GALAXY_TAB_A_8_0 = "spec:width=768,height=1024,unit=px,dpi=160"

    /** Samsung Galaxy Tab A 8.0 */
    val GALAXY_TAB_A_8_0_800X1280 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Samsung Galaxy Tab A9+ */
    val GALAXY_TAB_A9 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Samsung Galaxy Tab A9 */
    val GALAXY_TAB_A9_800X1340 = "spec:width=800,height=1340,unit=px,dpi=213"

    /** Samsung Galaxy Tab A9+ 5G */
    val GALAXY_TAB_A9_5G = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Samsung Galaxy Tab A 9.7 */
    val GALAXY_TAB_A_9_7 = "spec:width=768,height=1024,unit=px,dpi=160"

    /** Samsung Galaxy Tab Active */
    val GALAXY_TAB_ACTIVE = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Samsung Galaxy Tab Active2 */
    val GALAXY_TAB_ACTIVE2 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Samsung Galaxy Tab Active3 */
    val GALAXY_TAB_ACTIVE3 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Samsung Galaxy Tab Active4 Pro 5G */
    val GALAXY_TAB_ACTIVE4_PRO_5G = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Samsung Galaxy Tab Active5 */
    val GALAXY_TAB_ACTIVE5 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Samsung Galaxy Tab Active5 5G */
    val GALAXY_TAB_ACTIVE5_5G = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Samsung Galaxy Tab Active5 Pro */
    val GALAXY_TAB_ACTIVE5_PRO = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Samsung Galaxy Tab Active5 Pro 5G */
    val GALAXY_TAB_ACTIVE5_PRO_5G = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Samsung Galaxy Tab Active Pro */
    val GALAXY_TAB_ACTIVE_PRO = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Samsung Galaxy Tab Advanced2 */
    val GALAXY_TAB_ADVANCED2 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Samsung Galaxy Tab A Kids Edition */
    val GALAXY_TAB_A_KIDS_EDITION = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Samsung Galaxy Tab A S 8.0 */
    val GALAXY_TAB_A_S_8_0 = "spec:width=768,height=1024,unit=px,dpi=160"

    /** Samsung Galaxy Tab A with S Pen */
    val GALAXY_TAB_A_WITH_S_PEN = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Samsung Galaxy Tab E */
    val GALAXY_TAB_E = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Samsung Galaxy Tab E 8.0 */
    val GALAXY_TAB_E_8_0 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Samsung Galaxy Tab E8.0 */
    val GALAXY_TAB_E8_0 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Samsung Galaxy TabE 8.0 */
    val GALAXY_TABE_8_0 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Samsung Galaxy Tab E 9.6 */
    val GALAXY_TAB_E_9_6 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Samsung Galaxy Tab Plus 7.0 */
    val GALAXY_TAB_PLUS_7_0 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Samsung Galaxy Tab Pro 10.1 */
    val GALAXY_TAB_PRO_10_1 = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Samsung Galaxy Tab Pro 12.2 */
    val GALAXY_TAB_PRO_12_2 = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Samsung Galaxy Tab Pro 8.4 */
    val GALAXY_TAB_PRO_8_4 = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Samsung Galaxy Tab S10+ */
    val GALAXY_TAB_S10 = "spec:width=1752,height=2800,unit=px,dpi=320"

    /** Samsung Galaxy TabS 10.5 */
    val GALAXY_TABS_10_5 = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Samsung Galaxy Tab S10+ 5G */
    val GALAXY_TAB_S10_5G = "spec:width=1752,height=2800,unit=px,dpi=320"

    /** Samsung Galaxy Tab S10 FE */
    val GALAXY_TAB_S10_FE = "spec:width=1440,height=2304,unit=px,dpi=280"

    /** Samsung Galaxy Tab S10 FE+ */
    val GALAXY_TAB_S10_FE_1800X2880 = "spec:width=1800,height=2880,unit=px,dpi=320"

    /** Samsung Galaxy Tab S10 FE 5G */
    val GALAXY_TAB_S10_FE_5G = "spec:width=1440,height=2304,unit=px,dpi=280"

    /** Samsung Galaxy Tab S10 FE+ 5G */
    val GALAXY_TAB_S10_FE_5G_1800X2880 = "spec:width=1800,height=2880,unit=px,dpi=320"

    /** Samsung Galaxy Tab S10 Ultra */
    val GALAXY_TAB_S10_ULTRA = "spec:width=1848,height=2960,unit=px,dpi=280"

    /** Samsung Galaxy Tab S10 Ultra 5G */
    val GALAXY_TAB_S10_ULTRA_5G = "spec:width=1848,height=2960,unit=px,dpi=280"

    /** Samsung Galaxy Tab S2 */
    val GALAXY_TAB_S2 = "spec:width=1536,height=2048,unit=px,dpi=320"

    /** Samsung Galaxy Tab S2 8.0 */
    val GALAXY_TAB_S2_8_0 = "spec:width=1536,height=2048,unit=px,dpi=320"

    /** Samsung Galaxy Tab S2 9.7 */
    val GALAXY_TAB_S2_9_7 = "spec:width=1536,height=2048,unit=px,dpi=320"

    /** Samsung Galaxy TabS2 9.7 */
    val GALAXY_TABS2_9_7 = "spec:width=1536,height=2048,unit=px,dpi=320"

    /** Samsung Galaxy Tab S3 */
    val GALAXY_TAB_S3 = "spec:width=1536,height=2048,unit=px,dpi=320"

    /** Samsung Galaxy TabS3 */
    val GALAXY_TABS3 = "spec:width=1536,height=2048,unit=px,dpi=320"

    /** Samsung Galaxy Tab S4 */
    val GALAXY_TAB_S4 = "spec:width=1600,height=2560,unit=px,dpi=360"

    /** Samsung Galaxy Tab S5e */
    val GALAXY_TAB_S5E = "spec:width=1600,height=2560,unit=px,dpi=360"

    /** Samsung Galaxy Tab S6 */
    val GALAXY_TAB_S6 = "spec:width=1600,height=2560,unit=px,dpi=360"

    /** Samsung Galaxy Tab S6 5G */
    val GALAXY_TAB_S6_5G = "spec:width=1600,height=2560,unit=px,dpi=360"

    /** Samsung Galaxy Tab S6 Lite */
    val GALAXY_TAB_S6_LITE = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Samsung Galaxy Tab S7 */
    val GALAXY_TAB_S7 = "spec:width=1600,height=2560,unit=px,dpi=340"

    /** Samsung Galaxy Tab S7+ */
    val GALAXY_TAB_S7_1752X2800 = "spec:width=1752,height=2800,unit=px,dpi=340"

    /** Samsung Galaxy Tab S7 5G */
    val GALAXY_TAB_S7_5G = "spec:width=1600,height=2560,unit=px,dpi=340"

    /** Samsung Galaxy Tab S7+ 5G */
    val GALAXY_TAB_S7_5G_1752X2800 = "spec:width=1752,height=2800,unit=px,dpi=340"

    /** Samsung Galaxy Tab S7 FE */
    val GALAXY_TAB_S7_FE = "spec:width=1600,height=2560,unit=px,dpi=340"

    /** Samsung Galaxy Tab S7 FE 5G */
    val GALAXY_TAB_S7_FE_5G = "spec:width=1600,height=2560,unit=px,dpi=340"

    /** Samsung Galaxy Tab S8 */
    val GALAXY_TAB_S8 = "spec:width=1600,height=2560,unit=px,dpi=340"

    /** Samsung Galaxy Tab S8+ */
    val GALAXY_TAB_S8_1752X2800 = "spec:width=1752,height=2800,unit=px,dpi=340"

    /** Samsung Galaxy Tab S 8.4 */
    val GALAXY_TAB_S_8_4 = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Samsung Galaxy TabS 8.4 */
    val GALAXY_TABS_8_4 = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Samsung Galaxy Tab S8 5G */
    val GALAXY_TAB_S8_5G = "spec:width=1600,height=2560,unit=px,dpi=340"

    /** Samsung Galaxy Tab S8+ 5G */
    val GALAXY_TAB_S8_5G_1752X2800 = "spec:width=1752,height=2800,unit=px,dpi=340"

    /** Samsung Galaxy Tab S8 Ultra */
    val GALAXY_TAB_S8_ULTRA = "spec:width=1848,height=2960,unit=px,dpi=320"

    /** Samsung Galaxy Tab S8 Ultra 5G */
    val GALAXY_TAB_S8_ULTRA_5G = "spec:width=1848,height=2960,unit=px,dpi=320"

    /** Samsung Galaxy Tab S9 */
    val GALAXY_TAB_S9 = "spec:width=1600,height=2560,unit=px,dpi=340"

    /** Samsung Galaxy Tab S9+ */
    val GALAXY_TAB_S9_1752X2800 = "spec:width=1752,height=2800,unit=px,dpi=340"

    /** Samsung Galaxy Tab S9 5G */
    val GALAXY_TAB_S9_5G = "spec:width=1600,height=2560,unit=px,dpi=340"

    /** Samsung Galaxy Tab S9+ 5G */
    val GALAXY_TAB_S9_5G_1752X2800 = "spec:width=1752,height=2800,unit=px,dpi=340"

    /** Samsung Galaxy Tab S9 FE */
    val GALAXY_TAB_S9_FE = "spec:width=1440,height=2304,unit=px,dpi=280"

    /** Samsung Galaxy Tab S9 FE+ */
    val GALAXY_TAB_S9_FE_1600X2560 = "spec:width=1600,height=2560,unit=px,dpi=340"

    /** Samsung Galaxy Tab S9 FE 5G */
    val GALAXY_TAB_S9_FE_5G = "spec:width=1440,height=2304,unit=px,dpi=280"

    /** Samsung Galaxy Tab S9 FE+ 5G */
    val GALAXY_TAB_S9_FE_5G_1600X2560 = "spec:width=1600,height=2560,unit=px,dpi=340"

    /** Samsung Galaxy Tab S9 Ultra */
    val GALAXY_TAB_S9_ULTRA = "spec:width=1848,height=2960,unit=px,dpi=280"

    /** Samsung Galaxy Tab S9 Ultra 5G */
    val GALAXY_TAB_S9_ULTRA_5G = "spec:width=1848,height=2960,unit=px,dpi=280"

    /** Samsung Galaxy Tap Pro 10.1 */
    val GALAXY_TAP_PRO_10_1 = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Samsung Galaxy Tap Pro 8.4 */
    val GALAXY_TAP_PRO_8_4 = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Samsung Galaxy Trend */
    val GALAXY_TREND = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Trend3 */
    val GALAXY_TREND3 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Trend Duos */
    val GALAXY_TREND_DUOS = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Trend Lite */
    val GALAXY_TREND_LITE = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Trend Plus */
    val GALAXY_TREND_PLUS = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy view */
    val GALAXY_VIEW = "spec:width=1080,height=1920,unit=px,dpi=160"

    /** Samsung Galaxy View2 */
    val GALAXY_VIEW2 = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Samsung Galaxy W */
    val GALAXY_W = "spec:width=720,height=1280,unit=px,dpi=240"

    /** Samsung Galaxy Wide */
    val GALAXY_WIDE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy Wide2 */
    val GALAXY_WIDE2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy Wide3 */
    val GALAXY_WIDE3 = "spec:width=720,height=1280,unit=px,dpi=280"

    /** Samsung Galaxy Wide8 */
    val GALAXY_WIDE8 = "spec:width=1080,height=2340,unit=px,dpi=450"

    /** Samsung Galaxy win */
    val GALAXY_WIN = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Win2 */
    val GALAXY_WIN2 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Win Duos */
    val GALAXY_WIN_DUOS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung Galaxy Win Pro */
    val GALAXY_WIN_PRO = "spec:width=540,height=960,unit=px,dpi=240"

    /** Samsung Galaxy Xcover2 */
    val GALAXY_XCOVER2 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Xcover3 */
    val GALAXY_XCOVER3 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Galaxy Xcover4 */
    val GALAXY_XCOVER4 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy XCover 4s */
    val GALAXY_XCOVER_4S = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung Galaxy XCover 5 */
    val GALAXY_XCOVER_5 = "spec:width=720,height=1480,unit=px,dpi=340"

    /** Samsung Galaxy XCover6 Pro */
    val GALAXY_XCOVER6_PRO = "spec:width=1080,height=2408,unit=px,dpi=450"

    /** Samsung Galaxy XCover7 */
    val GALAXY_XCOVER7 = "spec:width=1080,height=2408,unit=px,dpi=450"

    /** Samsung Galaxy XCover7 Pro */
    val GALAXY_XCOVER7_PRO = "spec:width=1080,height=2408,unit=px,dpi=450"

    /** Samsung Galaxy XCover FieldPro */
    val GALAXY_XCOVER_FIELDPRO = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** Samsung Galaxy XCover Pro */
    val GALAXY_XCOVER_PRO = "spec:width=1080,height=2340,unit=px,dpi=420"

    /** Samsung Galaxy Young */
    val GALAXY_YOUNG = "spec:width=320,height=480,unit=px,dpi=160"

    /** Samsung Galaxy Young2 */
    val GALAXY_YOUNG2 = "spec:width=320,height=480,unit=px,dpi=160"

    /** Samsung Galaxy Young2 Pro */
    val GALAXY_YOUNG2_PRO = "spec:width=320,height=480,unit=px,dpi=160"

    /** Samsung Galaxy Z Flip */
    val GALAXY_Z_FLIP = "spec:width=1080,height=2636,unit=px,dpi=480"

    /** Samsung Galaxy Z Flip3 5G */
    val GALAXY_Z_FLIP3_5G = "spec:width=1080,height=2640,unit=px,dpi=480"

    /** Samsung Galaxy Z Flip4 */
    val GALAXY_Z_FLIP4 = "spec:width=1080,height=2640,unit=px,dpi=480"

    /** Samsung Galaxy Z Flip5 */
    val GALAXY_Z_FLIP5 = "spec:width=1080,height=2640,unit=px,dpi=480"

    /** Samsung Galaxy Z Flip 5G */
    val GALAXY_Z_FLIP_5G = "spec:width=1080,height=2636,unit=px,dpi=480"

    /** Samsung Galaxy Z Flip6 */
    val GALAXY_Z_FLIP6 = "spec:width=1080,height=2640,unit=px,dpi=480"

    /** Samsung Galaxy Z Flip7 */
    val GALAXY_Z_FLIP7 = "spec:width=1080,height=2520,unit=px,dpi=480"

    /** Samsung Galaxy Z Fold2 5G */
    val GALAXY_Z_FOLD2_5G = "spec:width=1768,height=2208,unit=px,dpi=480"

    /** Samsung Galaxy Z Fold3 5G */
    val GALAXY_Z_FOLD3_5G = "spec:width=1768,height=2208,unit=px,dpi=420"

    /** Samsung Galaxy Z Fold4 */
    val GALAXY_Z_FOLD4 = "spec:width=1440,height=2960,unit=px,dpi=420"

    /** Samsung Galaxy Z Fold4 */
    val GALAXY_Z_FOLD4_1812X2176 = "spec:width=1812,height=2176,unit=px,dpi=420"

    /** Samsung Galaxy Z Fold5 */
    val GALAXY_Z_FOLD5 = "spec:width=1812,height=2176,unit=px,dpi=420"

    /** Samsung Galaxy Z Fold6 */
    val GALAXY_Z_FOLD6 = "spec:width=1856,height=2160,unit=px,dpi=420"

    /** Samsung Galaxy Z Fold7 */
    val GALAXY_Z_FOLD7 = "spec:width=1968,height=2184,unit=px,dpi=420"

    /** Samsung Galaxy Z Fold Special Edition */
    val GALAXY_Z_FOLD_SPECIAL_EDITION = "spec:width=1968,height=2184,unit=px,dpi=420"

    /** Samsung Garda */
    val GARDA = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung J1 Mini Prime */
    val J1_MINI_PRIME = "spec:width=480,height=800,unit=px,dpi=240"

    /** Samsung Nexus 10 */
    val NEXUS_10 = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Samsung Roy VE DTV */
    val ROY_VE_DTV = "spec:width=320,height=480,unit=px,dpi=160"

    /** Samsung Samsung Interactive Display */
    val SAMSUNG_INTERACTIVE_DISPLAY = "spec:width=2160,height=3840,unit=px,dpi=480"

    /** Samsung Samsung WAF */
    val SAMSUNG_WAF = "spec:width=2160,height=3840,unit=px,dpi=480"

    /** Samsung SHW-M480S */
    val SHW_M480S = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Samsung SM-G6200 */
    val SM_G6200 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung SM-G9198 */
    val SM_G9198 = "spec:width=768,height=1280,unit=px,dpi=320"

    /** Samsung SM-J260A */
    val SM_J260A = "spec:width=540,height=960,unit=px,dpi=240"

    /** Samsung SM-J337A */
    val SM_J337A = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung SM-J337AZ */
    val SM_J337AZ = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Samsung SM-T230NZ */
    val SM_T230NZ = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Samsung SM-W2018 */
    val SM_W2018 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Samsung 三星W20 */
    val W20 = "spec:width=1536,height=2152,unit=px,dpi=420"

    /** Samsung 三星 W21 5G */
    val W21_5G = "spec:width=1768,height=2208,unit=px,dpi=420"

    /** Samsung 三星W22 5G */
    val W22_5G = "spec:width=900,height=1600,unit=px,dpi=240"

    /** Samsung 心系天下 三星 W23 */
    val W23 = "spec:width=1812,height=2176,unit=px,dpi=420"

    /** Samsung 心系天下 三星 W23 Flip */
    val W23_FLIP = "spec:width=1080,height=2640,unit=px,dpi=480"

}
