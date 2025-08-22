package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hyundai device specifications for Android Compose previews.
 *
 * This extension provides Hyundai device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hyundai.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hyundai get() = object {
    /** Hyundai 10LA2 */
    val _10LA2 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Hyundai 7LB1 */
    val _7LB1 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Hyundai 8LAB1 */
    val _8LAB1 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hyundai E435 Plus */
    val E435_PLUS = "spec:width=480,height=800,unit=px,dpi=240"

    /** Hyundai E456GO */
    val E456GO = "spec:width=480,height=800,unit=px,dpi=240"

    /** Hyundai E475 */
    val E475 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Hyundai E485 */
    val E485 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Hyundai e501 */
    val E501 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Hyundai e502 */
    val E502 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Hyundai E506 */
    val E506 = "spec:width=480,height=854,unit=px,dpi=200"

    /** Hyundai e551 Lite */
    val E551_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Hyundai E553 */
    val E553 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Hyundai E554 */
    val E554 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Hyundai E601F */
    val E601F = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Hyundai E602 */
    val E602 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Hyundai E603 */
    val E603 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Hyundai Eternity_G25 */
    val ETERNITY_G25 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Hyundai Eternity H68 */
    val ETERNITY_H68 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Hyundai HT0703W08 */
    val HT0703W08 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Hyundai HT0705W08/Koral_7W4 */
    val HT0705W08_KORAL_7W4 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Hyundai HT0802W16/Koral_8W2 */
    val HT0802W16_KORAL_8W2 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hyundai HT10LA1MSGNA02 */
    val HT10LA1MSGNA02 = "spec:width=1200,height=1920,unit=px,dpi=360"

    /** Hyundai HT10LA2MSGNA01 */
    val HT10LA2MSGNA01 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Hyundai HT10LB2MBKLTM */
    val HT10LB2MBKLTM = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hyundai HT10LB2MBKLTM02 */
    val HT10LB2MBKLTM02 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Hyundai HT10LB3MBKLTM */
    val HT10LB3MBKLTM = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hyundai HT10LB3MBKWW */
    val HT10LB3MBKWW = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hyundai HT10LB4MSGNA01 */
    val HT10LB4MSGNA01 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hyundai HT10LC1MBKLTM */
    val HT10LC1MBKLTM = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Hyundai HT10LC1MBKLTM01 */
    val HT10LC1MBKLTM01 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hyundai HT10WB2MSG01 */
    val HT10WB2MSG01 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Hyundai HT10WB3MSG01 */
    val HT10WB3MSG01 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hyundai HT7GB1MBK_ */
    val HT7GB1MBK = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Hyundai HT7WB1RBK */
    val HT7WB1RBK = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Hyundai HT7WC1PBK */
    val HT7WC1PBK = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Hyundai HT8LA1RBKNA01 */
    val HT8LA1RBKNA01 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Hyundai HT8LAB1PBKLTM */
    val HT8LAB1PBKLTM = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Hyundai HT8WB1RBK01 */
    val HT8WB1RBK01 = "spec:width=1200,height=1920,unit=px,dpi=300"

    /** Hyundai HT8WB1RBK02 */
    val HT8WB1RBK02 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hyundai HT8WB1RBK02A */
    val HT8WB1RBK02A = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hyundai HT8WB1RBK03 */
    val HT8WB1RBK03 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hyundai HY_BDL163G_001 */
    val HY_BDL163G_001 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Hyundai HyLine_Plus */
    val HYLINE_PLUS = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Hyundai HyLine_Pro */
    val HYLINE_PRO = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Hyundai HyLine_Pro */
    val HYLINE_PRO_720X1600 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Hyundai HyLine_Pro_X */
    val HYLINE_PRO_X = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Hyundai Hytab_Plus */
    val HYTAB_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hyundai HyTab_Plus_10LC2 */
    val HYTAB_PLUS_10LC2 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hyundai HyTab_Plus_7WA1 */
    val HYTAB_PLUS_7WA1 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Hyundai Hytab Plus 8LB1 */
    val HYTAB_PLUS_8LB1 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hyundai Hytab_Pro */
    val HYTAB_PRO = "spec:width=1200,height=1920,unit=px,dpi=360"

    /** Hyundai Hyundai_Eternity_G50 */
    val HYUNDAI_ETERNITY_G50 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Hyundai Hyundai_Eternity_G57 */
    val HYUNDAI_ETERNITY_G57 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Hyundai Hyundai_Eternity_G60 */
    val HYUNDAI_ETERNITY_G60 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Hyundai Hyundai Koral 10X */
    val HYUNDAI_KORAL_10X = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hyundai Hyundai Koral 7M3X */
    val HYUNDAI_KORAL_7M3X = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Hyundai Hyundai Koral_7M4 */
    val HYUNDAI_KORAL_7M4 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Hyundai Hyundai Smartboard */
    val HYUNDAI_SMARTBOARD = "spec:width=2160,height=3840,unit=px,dpi=480"

    /** Hyundai Koral */
    val KORAL = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Hyundai Koral */
    val KORAL_800X1280 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hyundai Koral_10LB1 */
    val KORAL_10LB1 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hyundai Koral_10X2 */
    val KORAL_10X2 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hyundai Koral_10X3 */
    val KORAL_10X3 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hyundai Koral 10XL */
    val KORAL_10XL = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hyundai Koral_7W4X */
    val KORAL_7W4X = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Hyundai L465 */
    val L465 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Hyundai L503F */
    val L503F = "spec:width=480,height=960,unit=px,dpi=240"

    /** Hyundai L503F Plus */
    val L503F_PLUS = "spec:width=480,height=960,unit=px,dpi=213"

    /** Hyundai L506 */
    val L506 = "spec:width=480,height=854,unit=px,dpi=200"

    /** Hyundai L553 */
    val L553 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Hyundai L601F */
    val L601F = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Hyundai L604 */
    val L604 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Hyundai L610 */
    val L610 = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Hyundai L622 */
    val L622 = "spec:width=720,height=1520,unit=px,dpi=280"

    /** Hyundai L651 */
    val L651 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Hyundai L681 */
    val L681 = "spec:width=720,height=1640,unit=px,dpi=260"

    /** Hyundai Seoul 9 */
    val SEOUL_9 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Hyundai Seoul_S8 */
    val SEOUL_S8 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Hyundai Ultra Active */
    val ULTRA_ACTIVE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Hyundai Ultra Dream */
    val ULTRA_DREAM = "spec:width=480,height=854,unit=px,dpi=240"

    /** Hyundai Ultra Energy Lite */
    val ULTRA_ENERGY_LITE = "spec:width=480,height=854,unit=px,dpi=240"

    /** Hyundai Ultra Energy Plus */
    val ULTRA_ENERGY_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Hyundai Ultra Latitude */
    val ULTRA_LATITUDE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Hyundai Ultra Live II */
    val ULTRA_LIVE_II = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Hyundai Ultra Shadow */
    val ULTRA_SHADOW = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Hyundai Ultra Shine */
    val ULTRA_SHINE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Hyundai Ultra Storm */
    val ULTRA_STORM = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Hyundai Ultra Style */
    val ULTRA_STYLE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Hyundai Ultra Sync */
    val ULTRA_SYNC = "spec:width=480,height=854,unit=px,dpi=240"

    /** Hyundai Ultra Trend */
    val ULTRA_TREND = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Hyundai Ultra Vision */
    val ULTRA_VISION = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Hyundai Ultra Vision Plus */
    val ULTRA_VISION_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

}
