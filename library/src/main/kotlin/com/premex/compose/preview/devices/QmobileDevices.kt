package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Qmobile device specifications for Android Compose previews.
 *
 * This extension provides Qmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Qmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Qmobile get() = object {
    /** Qmobile A1 */
    val A1 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Qmobile A1 lite */
    val A1_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile Blue 5 */
    val BLUE_5 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Qmobile CS1 */
    val CS1 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile CS1 Plus */
    val CS1_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile Dual One */
    val DUAL_ONE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile E1 */
    val E1 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile E2 */
    val E2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile E3 Dual */
    val E3_DUAL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile ENERGY X1 */
    val ENERGY_X1 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Qmobile ENERGY X2 */
    val ENERGY_X2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile Evok Power */
    val EVOK_POWER = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile Evok Power Lite */
    val EVOK_POWER_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile Fire */
    val FIRE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Qmobile GLi 2020 */
    val GLI_2020 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Qmobile GLi Lite */
    val GLI_LITE = "spec:width=480,height=800,unit=px,dpi=240"

    /** Qmobile HD Plus */
    val HD_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Qmobile i2 POWER */
    val I2_POWER = "spec:width=480,height=854,unit=px,dpi=240"

    /** Qmobile i2 PRO */
    val I2_PRO = "spec:width=480,height=854,unit=px,dpi=240"

    /** Qmobile i5.5 */
    val I5_5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile i5i 2018 */
    val I5I_2018 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Qmobile i6 Metal 2017 */
    val I6_METAL_2017 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Qmobile i6 Metal HD */
    val I6_METAL_HD = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile i6 Metal One */
    val I6_METAL_ONE = "spec:width=480,height=854,unit=px,dpi=240"

    /** Qmobile i7i 2020 */
    val I7I_2020 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Qmobile i8i */
    val I8I = "spec:width=480,height=854,unit=px,dpi=240"

    /** Qmobile i8i 2019 */
    val I8I_2019 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Qmobile i8i PRO */
    val I8I_PRO = "spec:width=480,height=854,unit=px,dpi=240"

    /** Qmobile i8i_Pro_Ⅱ */
    val I8I_PRO_480X960 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Qmobile J1 */
    val J1 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Qmobile J2 */
    val J2 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Qmobile J5 */
    val J5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile J7 */
    val J7 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile J7 PRO */
    val J7_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile KING KONG MAX */
    val KING_KONG_MAX = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile LT100 */
    val LT100 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Qmobile LT360 */
    val LT360 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Qmobile LT500 PRO */
    val LT500_PRO = "spec:width=480,height=854,unit=px,dpi=240"

    /** Qmobile LT550 */
    val LT550 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Qmobile LT700 */
    val LT700 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile LT700 PRO */
    val LT700_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile LT900 */
    val LT900 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Qmobile M350 Pro */
    val M350_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile M6 */
    val M6 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Qmobile Mark 5 */
    val MARK_5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile Phantom_P1 */
    val PHANTOM_P1 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Qmobile Phantom_P1_Pro */
    val PHANTOM_P1_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Qmobile Q Infinity */
    val Q_INFINITY = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Qmobile Q Infinity B */
    val Q_INFINITY_B = "spec:width=480,height=960,unit=px,dpi=240"

    /** Qmobile Q Infinity C */
    val Q_INFINITY_C = "spec:width=480,height=960,unit=px,dpi=240"

    /** Qmobile Q Infinity Cinema */
    val Q_INFINITY_CINEMA = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Qmobile Q Infinity D */
    val Q_INFINITY_D = "spec:width=480,height=960,unit=px,dpi=240"

    /** Qmobile Q Infinity E */
    val Q_INFINITY_E = "spec:width=480,height=960,unit=px,dpi=240"

    /** Qmobile Q Infinity E Lite */
    val Q_INFINITY_E_LITE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Qmobile Q Infinity Prime */
    val Q_INFINITY_PRIME = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Qmobile QTab_Y1_2M */
    val QTAB_Y1_2M = "spec:width=600,height=1024,unit=px,dpi=240"

    /** Qmobile QTab_Y2 */
    val QTAB_Y2 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Qmobile QTab_Y3 */
    val QTAB_Y3 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Qmobile Rocket Pro */
    val ROCKET_PRO = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Qmobile S1 PRO */
    val S1_PRO = "spec:width=480,height=854,unit=px,dpi=240"

    /** Qmobile S2 Pro */
    val S2_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile S4 */
    val S4 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile S6 */
    val S6 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile S6 PLUS */
    val S6_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile S6S */
    val S6S = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile S8 */
    val S8 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile V100 */
    val V100 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Qmobile V500 */
    val V500 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Qmobile V6 Metal */
    val V6_METAL = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Qmobile V7 Metal */
    val V7_METAL = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Qmobile VIEW PRO */
    val VIEW_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Qmobile X1S */
    val X1S = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile X32 */
    val X32 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Qmobile X32 Power */
    val X32_POWER = "spec:width=480,height=800,unit=px,dpi=240"

    /** Qmobile X33 */
    val X33 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Qmobile X36 */
    val X36 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Qmobile X700 PRO */
    val X700_PRO = "spec:width=480,height=854,unit=px,dpi=240"

    /** Qmobile X700 PRO II */
    val X700_PRO_II = "spec:width=480,height=854,unit=px,dpi=240"

    /** Qmobile X700 PRO Lite */
    val X700_PRO_LITE = "spec:width=480,height=854,unit=px,dpi=240"

    /** Qmobile XLi */
    val XLI = "spec:width=480,height=800,unit=px,dpi=240"

    /** Qmobile Z12 */
    val Z12 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Qmobile Z12 PRO */
    val Z12_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Qmobile Z14 */
    val Z14 = "spec:width=1080,height=1920,unit=px,dpi=480"

}
