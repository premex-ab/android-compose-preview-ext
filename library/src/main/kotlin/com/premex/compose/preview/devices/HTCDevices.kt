package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * HTC device specifications for Android Compose previews.
 *
 * This extension provides HTC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.HTC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.HTC get() = object {
    /** HTC 10 */
    val _10 = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** HTC 10 evo */
    val _10_EVO = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** HTC 710C */
    val _710C = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC 8060 */
    val _8060 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC 8088 */
    val _8088 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC 9088 */
    val _9088 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC 919d */
    val _919D = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC Butterfly */
    val BUTTERFLY = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC Butterfly 2 */
    val BUTTERFLY_2 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC Butterfly S */
    val BUTTERFLY_S = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC Butterfly s 9060 */
    val BUTTERFLY_S_9060 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC D626q */
    val D626Q = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC D628u */
    val D628U = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC D816d */
    val D816D = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC D820f */
    val D820F = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC D820t */
    val D820T = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire 10 compact */
    val DESIRE_10_COMPACT = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire 10 lifestyle */
    val DESIRE_10_LIFESTYLE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire 10 pro */
    val DESIRE_10_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC Desire 12 */
    val DESIRE_12 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** HTC Desire 12s */
    val DESIRE_12S = "spec:width=720,height=1440,unit=px,dpi=320"

    /** HTC Desire 20 Pro */
    val DESIRE_20_PRO = "spec:width=1080,height=2340,unit=px,dpi=400"

    /** HTC Desire 310 */
    val DESIRE_310 = "spec:width=480,height=854,unit=px,dpi=240"

    /** HTC Desire 320 */
    val DESIRE_320 = "spec:width=480,height=854,unit=px,dpi=240"

    /** HTC Desire 326G dual sim */
    val DESIRE_326G_DUAL_SIM = "spec:width=480,height=854,unit=px,dpi=240"

    /** HTC Desire 500 */
    val DESIRE_500 = "spec:width=480,height=800,unit=px,dpi=240"

    /** HTC Desire 510 */
    val DESIRE_510 = "spec:width=480,height=854,unit=px,dpi=240"

    /** HTC Desire 520 */
    val DESIRE_520 = "spec:width=480,height=854,unit=px,dpi=240"

    /** HTC Desire 526 */
    val DESIRE_526 = "spec:width=540,height=960,unit=px,dpi=240"

    /** HTC Desire 526G+ dual sim */
    val DESIRE_526G_DUAL_SIM = "spec:width=540,height=960,unit=px,dpi=240"

    /** HTC Desire 526GPLUS */
    val DESIRE_526GPLUS = "spec:width=540,height=960,unit=px,dpi=240"

    /** HTC Desire 530 */
    val DESIRE_530 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire 550/ 555 */
    val DESIRE_550_555 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire 600 Dual SIM */
    val DESIRE_600_DUAL_SIM = "spec:width=540,height=960,unit=px,dpi=240"

    /** HTC Desire 601 */
    val DESIRE_601 = "spec:width=540,height=960,unit=px,dpi=240"

    /** HTC Desire 610 */
    val DESIRE_610 = "spec:width=480,height=854,unit=px,dpi=240"

    /** HTC Desire 610 */
    val DESIRE_610_540X960 = "spec:width=540,height=960,unit=px,dpi=240"

    /** HTC Desire 620 */
    val DESIRE_620 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire 620G dual sim */
    val DESIRE_620G_DUAL_SIM = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire 626 */
    val DESIRE_626 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire 626G+ dual sim */
    val DESIRE_626G_DUAL_SIM = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire 626s */
    val DESIRE_626S = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire626s */
    val DESIRE626S = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire 630 dual sim */
    val DESIRE_630_DUAL_SIM = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire 650 */
    val DESIRE_650 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire 650 dual sim */
    val DESIRE_650_DUAL_SIM = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire 728 */
    val DESIRE_728 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire 728 dual sim */
    val DESIRE_728_DUAL_SIM = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire 728G dual sim */
    val DESIRE_728G_DUAL_SIM = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire815G */
    val DESIRE815G = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire 816 */
    val DESIRE_816 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire 816 dual sim */
    val DESIRE_816_DUAL_SIM = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire 816G dual */
    val DESIRE_816G_DUAL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire 820 */
    val DESIRE_820 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire 820G PLUS dual sim */
    val DESIRE_820G_PLUS_DUAL_SIM = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire 820q dual sim */
    val DESIRE_820Q_DUAL_SIM = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire 820s */
    val DESIRE_820S = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire 820s dual sim */
    val DESIRE_820S_DUAL_SIM = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire 825 */
    val DESIRE_825 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire 825 dual sim */
    val DESIRE_825_DUAL_SIM = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC Desire 826 */
    val DESIRE_826 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC Desire 826 dual sim */
    val DESIRE_826_DUAL_SIM = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC Desire 828 */
    val DESIRE_828 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC Desire 828 dual sim */
    val DESIRE_828_DUAL_SIM = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC Desire 830 */
    val DESIRE_830 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC Desire 830 dual sim */
    val DESIRE_830_DUAL_SIM = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC Desire EYE */
    val DESIRE_EYE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC Desire X */
    val DESIRE_X = "spec:width=480,height=800,unit=px,dpi=240"

    /** HTC E9pt */
    val E9PT = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** HTC enodugls_02401 */
    val ENODUGLS_02401 = "spec:width=1080,height=2436,unit=px,dpi=480"

    /** HTC EVO LTE 4G */
    val EVO_LTE_4G = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC EXODUS 1 */
    val EXODUS_1 = "spec:width=1440,height=2880,unit=px,dpi=640"

    /** HTC HTC 10 evo */
    val HTC_10_EVO = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** HTC HTC 5G Hub */
    val HTC_5G_HUB = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC HTC6435LVW */
    val HTC6435LVW = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC HTC A100 */
    val HTC_A100 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** HTC HTC A101 */
    val HTC_A101 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** HTC HTC A101 Plus */
    val HTC_A101_PLUS = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** HTC HTC A102 */
    val HTC_A102 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** HTC HTC A103 */
    val HTC_A103 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** HTC HTC A103 Plus */
    val HTC_A103_PLUS = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** HTC HTC A104 */
    val HTC_A104 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** HTC HTC AT01 */
    val HTC_AT01 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** HTC HTC Desire19+ */
    val HTC_DESIRE19 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** HTC HTC Desire 19s */
    val HTC_DESIRE_19S = "spec:width=720,height=1520,unit=px,dpi=320"

    /** HTC HTC Desire 20+ */
    val HTC_DESIRE_20 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** HTC HTC Desire 21 Pro 5G */
    val HTC_DESIRE_21_PRO_5G = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** HTC HTC Desire 22 5G */
    val HTC_DESIRE_22_5G = "spec:width=1080,height=2412,unit=px,dpi=480"

    /** HTC  HTC Desire 628 dual sim */
    val HTC_DESIRE_628_DUAL_SIM = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC HTC U11 */
    val HTC_U11 = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** HTC HTC U11+ */
    val HTC_U11_1440X2880 = "spec:width=1440,height=2880,unit=px,dpi=640"

    /** HTC HTC U11 EYEs */
    val HTC_U11_EYES = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** HTC HTC U11 life */
    val HTC_U11_LIFE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC HTC U19e */
    val HTC_U19E = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** HTC HTC U23 */
    val HTC_U23 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** HTC HTC U23 pro */
    val HTC_U23_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** HTC HTC Wildfire X */
    val HTC_WILDFIRE_X = "spec:width=720,height=1520,unit=px,dpi=320"

    /** HTC HTL23 */
    val HTL23 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC HTV31 */
    val HTV31 = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** HTC J Butterfly */
    val J_BUTTERFLY = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC J One */
    val J_ONE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC M8t */
    val M8T = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC M9e */
    val M9E = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC M9ew */
    val M9EW = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** HTC M9px */
    val M9PX = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** HTC Nexus 9 */
    val NEXUS_9 = "spec:width=1536,height=2048,unit=px,dpi=320"

    /** HTC Nexus 9 LTE */
    val NEXUS_9_LTE = "spec:width=1536,height=2048,unit=px,dpi=320"

    /** HTC One */
    val ONE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC One A9 */
    val ONE_A9 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC One A9s */
    val ONE_A9S = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC One Dual 802d */
    val ONE_DUAL_802D = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC One (E8) */
    val ONE_E8 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC One (E8) 时尚版   4G LTE双卡双待联通版 */
    val ONE_E8_4G_LTE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC One E9 dual sim */
    val ONE_E9_DUAL_SIM = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC One (M8) */
    val ONE_M8 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC One (M8) (4G LTE 双卡双待 联通版) */
    val ONE_M8_4G_LTE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC One (M8 EYE) */
    val ONE_M8_EYE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC ONE M8s */
    val ONE_M8S = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC One M9 */
    val ONE_M9 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC One M9+ */
    val ONE_M9_1440X2560 = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** HTC One M9+ (Prime Camera Edition) */
    val ONE_M9_PRIME_CAMERA_EDITION = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC One max */
    val ONE_MAX = "spec:width=1080,height=1920,unit=px,dpi=400"

    /** HTC One max */
    val ONE_MAX_1080X1920 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC One mini */
    val ONE_MINI = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC One mini 2 */
    val ONE_MINI_2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC One S */
    val ONE_S = "spec:width=540,height=960,unit=px,dpi=240"

    /** HTC One S9 */
    val ONE_S9 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC ONE SV */
    val ONE_SV = "spec:width=480,height=800,unit=px,dpi=240"

    /** HTC One X */
    val ONE_X = "spec:width=720,height=1280,unit=px,dpi=320"

    /** HTC One X10 */
    val ONE_X10 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC One X9 */
    val ONE_X9 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC One X9 dual sim */
    val ONE_X9_DUAL_SIM = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC U11 */
    val U11 = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** HTC U11 Life */
    val U11_LIFE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC U12+ */
    val U12 = "spec:width=1440,height=2880,unit=px,dpi=640"

    /** HTC U12 Life */
    val U12_LIFE = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** HTC U20 5G */
    val U20_5G = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** HTC U Play */
    val U_PLAY = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** HTC U Ultra */
    val U_ULTRA = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** HTC Wildfire E */
    val WILDFIRE_E = "spec:width=720,height=1440,unit=px,dpi=320"

    /** HTC Wildfire E1 */
    val WILDFIRE_E1 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** HTC Wildfire_E1_Plus */
    val WILDFIRE_E1_PLUS = "spec:width=720,height=1560,unit=px,dpi=320"

    /** HTC Wildfire E2 */
    val WILDFIRE_E2 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** HTC Wildfire E2 play */
    val WILDFIRE_E2_PLAY = "spec:width=720,height=1640,unit=px,dpi=320"

    /** HTC Wildfire E2 plus */
    val WILDFIRE_E2_PLUS = "spec:width=720,height=1640,unit=px,dpi=320"

    /** HTC Wildfire E3 */
    val WILDFIRE_E3 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** HTC Wildfire E3 lite */
    val WILDFIRE_E3_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

    /** HTC Wildfire E4 */
    val WILDFIRE_E4 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** HTC Wildfire E4 Plus */
    val WILDFIRE_E4_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

    /** HTC Wildfire E5 */
    val WILDFIRE_E5 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** HTC Wildfire E5 Plus */
    val WILDFIRE_E5_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

    /** HTC Wildfire E6 */
    val WILDFIRE_E6 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** HTC Wildfire E6 Plus */
    val WILDFIRE_E6_PLUS = "spec:width=720,height=1612,unit=px,dpi=320"

    /** HTC Wildfire E6 Star */
    val WILDFIRE_E6_STAR = "spec:width=720,height=1612,unit=px,dpi=320"

    /** HTC Wildfire E7 */
    val WILDFIRE_E7 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** HTC Wildfire E Lite */
    val WILDFIRE_E_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** HTC Wildfire E plus */
    val WILDFIRE_E_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

    /** HTC Wildfire E star */
    val WILDFIRE_E_STAR = "spec:width=720,height=1600,unit=px,dpi=320"

    /** HTC Wildfire E ultra */
    val WILDFIRE_E_ULTRA = "spec:width=480,height=960,unit=px,dpi=240"

    /** HTC Wildfire_R70 */
    val WILDFIRE_R70 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** HTC X2-HT */
    val X2_HT = "spec:width=1080,height=1920,unit=px,dpi=480"

}
