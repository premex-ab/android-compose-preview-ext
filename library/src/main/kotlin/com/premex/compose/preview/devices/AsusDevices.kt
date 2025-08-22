package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Asus device specifications for Android Compose previews.
 *
 * This extension provides Asus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Asus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Asus get() = object {
    /** Asus 飛馬2 Plus (T550KLC) */
    val _2_PLUS_T550KLC = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Asus 飛馬 5000 (T551TLC) */
    val _5000_T551TLC = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Asus ASUS Live (G500TG) */
    val ASUS_LIVE_G500TG = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ASUSPRO Tablet (M700KL) */
    val ASUSPRO_TABLET_M700KL = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Asus Commercial tablet 10 (M1000M) */
    val COMMERCIAL_TABLET_10_M1000M = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Asus Eee Pad Transformer Prime */
    val EEE_PAD_TRANSFORMER_PRIME = "spec:width=752,height=1280,unit=px,dpi=160"

    /** Asus Fonepad 7 (FE170CG) */
    val FONEPAD_7_FE170CG = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Asus Fonepad 7 (FE171CG) */
    val FONEPAD_7_FE171CG = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Asus Fonepad 7 (FE375CG) */
    val FONEPAD_7_FE375CG = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Asus Fonepad 7 (FE375CXG) */
    val FONEPAD_7_FE375CXG = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Asus Fonepad 7 (FE375CXG) */
    val FONEPAD_7_FE375CXG_800X1280 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Asus Fonepad 7 LTE (FE375CL) */
    val FONEPAD_7_LTE_FE375CL = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Asus Fonepad 7 LTE (ME372CL) */
    val FONEPAD_7_LTE_ME372CL = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Asus Fonepad 7 (ME175CG) */
    val FONEPAD_7_ME175CG = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Asus Fonepad 7 (ME372CG) */
    val FONEPAD_7_ME372CG = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Asus Fonepad 8 (FE380CG) */
    val FONEPAD_8_FE380CG = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Asus Fonepad 8 (FE380CXG) */
    val FONEPAD_8_FE380CXG = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Asus Fonepad ME371MG */
    val FONEPAD_ME371MG = "spec:width=800,height=1216,unit=px,dpi=213"

    /** Asus Fonepad Note 6 (ME560CG) */
    val FONEPAD_NOTE_6_ME560CG = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Asus MeMO PAD */
    val MEMO_PAD = "spec:width=600,height=976,unit=px,dpi=160"

    /** Asus MeMO Pad 10 (ME102A) */
    val MEMO_PAD_10_ME102A = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Asus MeMo Pad 10 (ME302C) */
    val MEMO_PAD_10_ME302C = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Asus MeMO Pad 7 (FE7010CG) */
    val MEMO_PAD_7_FE7010CG = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Asus MeMO Pad 7 LTE (ME375CL) */
    val MEMO_PAD_7_LTE_ME375CL = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Asus MeMO Pad 7 LTE (ME572CL) */
    val MEMO_PAD_7_LTE_ME572CL = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Asus MeMO Pad 7 (ME170C) */
    val MEMO_PAD_7_ME170C = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Asus MeMO Pad 7 (ME171C) */
    val MEMO_PAD_7_ME171C = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Asus MeMO Pad 7 (ME176C) */
    val MEMO_PAD_7_ME176C = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Asus MeMO Pad 7 (ME176CE) */
    val MEMO_PAD_7_ME176CE = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Asus MeMO Pad 7 (ME176CX) */
    val MEMO_PAD_7_ME176CX = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Asus MeMO Pad 7 (ME572C) */
    val MEMO_PAD_7_ME572C = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Asus MeMO Pad 7 (ME70C) */
    val MEMO_PAD_7_ME70C = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Asus MeMO Pad 8 (AST21) */
    val MEMO_PAD_8_AST21 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Asus MeMO Pad 8 (ME181C) */
    val MEMO_PAD_8_ME181C = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Asus MeMO Pad 8 (ME181CX) */
    val MEMO_PAD_8_ME181CX = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Asus MeMO Pad 8 (ME581C) */
    val MEMO_PAD_8_ME581C = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Asus MeMO Pad 8 (ME581CL) */
    val MEMO_PAD_8_ME581CL = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Asus MeMO Pad FHD 10 (ME302KL) */
    val MEMO_PAD_FHD_10_ME302KL = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Asus MeMO Pad HD 7 (ME173X) */
    val MEMO_PAD_HD_7_ME173X = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Asus MeMo Pad HD 7 (ME173XX) */
    val MEMO_PAD_HD_7_ME173XX = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Asus MeMO Pad HD 8 (ME180A) */
    val MEMO_PAD_HD_8_ME180A = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Asus MeMO Pad (ME103K) */
    val MEMO_PAD_ME103K = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Asus MeMO Pad Smart 10 */
    val MEMO_PAD_SMART_10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Asus Nexus 7 (2012) */
    val NEXUS_7_2012 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Asus Nexus 7 (2013) */
    val NEXUS_7_2013 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Asus PadFone S (PF500KL) */
    val PADFONE_S_PF500KL = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Asus PadFone X (A91) */
    val PADFONE_X_A91 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Asus ROG Phone */
    val ROG_PHONE = "spec:width=1080,height=2160,unit=px,dpi=420"

    /** Asus ROG Phone 3 */
    val ROG_PHONE_3 = "spec:width=1080,height=2340,unit=px,dpi=420"

    /** Asus ROG Phone 5 series */
    val ROG_PHONE_5_SERIES = "spec:width=1080,height=2448,unit=px,dpi=420"

    /** Asus ROG Phone 6D Ultimate */
    val ROG_PHONE_6D_ULTIMATE = "spec:width=1080,height=2448,unit=px,dpi=420"

    /** Asus ROG Phone 6 series */
    val ROG_PHONE_6_SERIES = "spec:width=1080,height=2448,unit=px,dpi=420"

    /** Asus ROG Phone 7 series */
    val ROG_PHONE_7_SERIES = "spec:width=1080,height=2448,unit=px,dpi=420"

    /** Asus ROG Phone II */
    val ROG_PHONE_II = "spec:width=720,height=1280,unit=px,dpi=240"

    /** Asus Smartphone for Snapdragon Insiders */
    val SMARTPHONE_FOR_SNAPDRAGON_INSIDERS = "spec:width=1080,height=2448,unit=px,dpi=420"

    /** Asus TF700T */
    val TF700T = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Asus The new PadFone Infinity (A86) */
    val THE_NEW_PADFONE_INFINITY_A86 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Asus Transformer AiO P1801 */
    val TRANSFORMER_AIO_P1801 = "spec:width=1080,height=1920,unit=px,dpi=160"

    /** Asus Transformer Book Trio */
    val TRANSFORMER_BOOK_TRIO = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Asus Transformer Pad */
    val TRANSFORMER_PAD = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Asus Transformer Pad Infinity (TF701T) */
    val TRANSFORMER_PAD_INFINITY_TF701T = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Asus Transformer Pad (TF103C) */
    val TRANSFORMER_PAD_TF103C = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Asus Transformer Pad (TF103CE) */
    val TRANSFORMER_PAD_TF103CE = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Asus Transformer Pad (TF103CG) */
    val TRANSFORMER_PAD_TF103CG = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Asus Transformer Pad TF300TG */
    val TRANSFORMER_PAD_TF300TG = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Asus Transformer Pad (TF303CL) */
    val TRANSFORMER_PAD_TF303CL = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Asus Transformer Pad (TF303K) */
    val TRANSFORMER_PAD_TF303K = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Asus TX201LAF */
    val TX201LAF = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Asus Zenbo Qrobot */
    val ZENBO_QROBOT = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Asus Zenfone 10 */
    val ZENFONE_10 = "spec:width=1080,height=2400,unit=px,dpi=440"

    /** Asus Zenfone 11 Ultra */
    val ZENFONE_11_ULTRA = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Asus Zenfone 12 Ultra */
    val ZENFONE_12_ULTRA = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Asus ZenFone 2 Laser (ZE500KG) */
    val ZENFONE_2_LASER_ZE500KG = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ZenFone 2 Laser (ZE500KL) */
    val ZENFONE_2_LASER_ZE500KL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ZenFone 2 Laser (ZE550KG) */
    val ZENFONE_2_LASER_ZE550KG = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ZenFone 2 Laser (ZE550KL) */
    val ZENFONE_2_LASER_ZE550KL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ZenFone 2 Laser (ZE551KL) */
    val ZENFONE_2_LASER_ZE551KL = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Asus ZenFone 2 Laser (ZE600KL) */
    val ZENFONE_2_LASER_ZE600KL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ZenFone 2 Laser (ZE601KL) */
    val ZENFONE_2_LASER_ZE601KL = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Asus ZenFone 2 (ZE500CL) */
    val ZENFONE_2_ZE500CL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ZenFone 2 (ZE550ML) */
    val ZENFONE_2_ZE550ML = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ZenFone 2 (ZE551ML) */
    val ZENFONE_2_ZE551ML = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Asus ZenFone 3 Deluxe (ZS550KL) */
    val ZENFONE_3_DELUXE_ZS550KL = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Asus ZenFone 3 Deluxe (ZS570KL) */
    val ZENFONE_3_DELUXE_ZS570KL = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Asus ZenFone 3 Laser (ZC551KL) */
    val ZENFONE_3_LASER_ZC551KL = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Asus ZenFone 3 Max (ZC520TL) */
    val ZENFONE_3_MAX_ZC520TL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ZenFone 3 Max (ZC553KL) */
    val ZENFONE_3_MAX_ZC553KL = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Asus ZenFone 3s Max (ZC521TL) */
    val ZENFONE_3S_MAX_ZC521TL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ZenFone 3 Ultra (ZU680KL) */
    val ZENFONE_3_ULTRA_ZU680KL = "spec:width=1080,height=1920,unit=px,dpi=360"

    /** Asus ZenFone 3 (ZE520KL) */
    val ZENFONE_3_ZE520KL = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Asus ZenFone 3 (ZE552KL) */
    val ZENFONE_3_ZE552KL = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Asus ZenFone 3 Zoom (ZE553KL) */
    val ZENFONE_3_ZOOM_ZE553KL = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Asus ZenFone 4 (A400CG) */
    val ZENFONE_4_A400CG = "spec:width=480,height=800,unit=px,dpi=240"

    /** Asus ZenFone 4 (A450CG) */
    val ZENFONE_4_A450CG = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Asus ZenFone 4 Max (ZC520KL) */
    val ZENFONE_4_MAX_ZC520KL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ZenFone 4 Max (ZC554KL) */
    val ZENFONE_4_MAX_ZC554KL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ZenFone 4 Pro (ZS551KL) */
    val ZENFONE_4_PRO_ZS551KL = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Asus ZenFone 4 Selfie Lite (ZB520KL) */
    val ZENFONE_4_SELFIE_LITE_ZB520KL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ZenFone 4 Selfie Pro (ZD552KL) */
    val ZENFONE_4_SELFIE_PRO_ZD552KL = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Asus ZenFone 4 Selfie (ZD553KL) */
    val ZENFONE_4_SELFIE_ZD553KL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ZenFone 4 (ZE554KL) */
    val ZENFONE_4_ZE554KL = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Asus ZenFone 5 */
    val ZENFONE_5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ZenFone 5 (A500CG) */
    val ZENFONE_5_A500CG = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ZenFone 5 (A501CG) */
    val ZENFONE_5_A501CG = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ZenFone 5 (A502CG) */
    val ZENFONE_5_A502CG = "spec:width=540,height=960,unit=px,dpi=240"

    /** Asus ZenFone 5 Lite (ZC600KL) */
    val ZENFONE_5_LITE_ZC600KL = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Asus ZenFone 5 LTE (A500KL) */
    val ZENFONE_5_LTE_A500KL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ZenFone 5 (ZE620KL) */
    val ZENFONE_5_ZE620KL = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** Asus ZenFone 5Z (ZS620KL) (WW) / 5Z (ZS621KL) (IN) */
    val ZENFONE_5Z_ZS620KL_WW_5Z_ZS621KL_IN = "spec:width=1080,height=2246,unit=px,dpi=420"

    /** Asus ZenFone 6 (A600CG) */
    val ZENFONE_6_A600CG = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ZenFone 6 (A601CG) */
    val ZENFONE_6_A601CG = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ZenFone 6 (ZS630KL) (WW) / 6Z (ZS630KL) (IN) */
    val ZENFONE_6_ZS630KL_WW_6Z_ZS630KL_IN = "spec:width=1080,height=2340,unit=px,dpi=420"

    /** Asus ZenFone 7 / 7 Pro (ZS670KS/ZS671KS) */
    val ZENFONE_7_7_PRO_ZS670KS_ZS671KS = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Asus Zenfone 8 */
    val ZENFONE_8 = "spec:width=1080,height=2400,unit=px,dpi=440"

    /** Asus Zenfone 8 Flip */
    val ZENFONE_8_FLIP = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Asus Zenfone 9 */
    val ZENFONE_9 = "spec:width=1080,height=2400,unit=px,dpi=440"

    /** Asus ZenFone AR */
    val ZENFONE_AR = "spec:width=1440,height=2560,unit=px,dpi=560"

    /** Asus ZenFone AR (ZS571KL) */
    val ZENFONE_AR_ZS571KL = "spec:width=1440,height=2560,unit=px,dpi=560"

    /** Asus ZenFone C (ZC451CG) */
    val ZENFONE_C_ZC451CG = "spec:width=480,height=854,unit=px,dpi=240"

    /** Asus ZenFone Go (ZB450KL) */
    val ZENFONE_GO_ZB450KL = "spec:width=480,height=854,unit=px,dpi=240"

    /** Asus ZenFone Go (ZB452KG) */
    val ZENFONE_GO_ZB452KG = "spec:width=480,height=854,unit=px,dpi=240"

    /** Asus ZenFone Go (ZB500KG) */
    val ZENFONE_GO_ZB500KG = "spec:width=480,height=854,unit=px,dpi=240"

    /** Asus ZenFone Go (ZB500KL) */
    val ZENFONE_GO_ZB500KL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ZenFone Go (ZB551KL) */
    val ZENFONE_GO_ZB551KL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ZenFone Go (ZB552KL) */
    val ZENFONE_GO_ZB552KL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ZenFone Go (ZB690KG) */
    val ZENFONE_GO_ZB690KG = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Asus ZenFone Go (ZC451TG) */
    val ZENFONE_GO_ZC451TG = "spec:width=480,height=854,unit=px,dpi=240"

    /** Asus ZenFone Go (ZC500TG) */
    val ZENFONE_GO_ZC500TG = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ZenFone Lite L1 (G553KL) */
    val ZENFONE_LITE_L1_G553KL = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Asus ZenFone Lite L1 (ZA551KL) / ZenFone Live L1/L2 (ZA550KL) */
    val ZENFONE_LITE_L1_ZA551KL_ZENFONE_LIVE_L1_L2_ZA550KL = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Asus ZenFone Live L1 (G552KL) */
    val ZENFONE_LIVE_L1_G552KL = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Asus ZenFone Live L1 (ZA550KL) */
    val ZENFONE_LIVE_L1_ZA550KL = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Asus ZenFone Live Plus (ZB553KL) */
    val ZENFONE_LIVE_PLUS_ZB553KL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ZenFone Live (ZB501KL) */
    val ZENFONE_LIVE_ZB501KL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ZenFone Max M1 (ZB556KL) / ZenFone Max M1/M2/M3 (ZB555KL) */
    val ZENFONE_MAX_M1_ZB556KL_ZENFONE_MAX_M1_M2_M3_ZB555KL = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Asus ZenFone Max M2 (ZB633KL) (WW) / Max M2 (ZB632KL) (IN) */
    val ZENFONE_MAX_M2_ZB633KL_WW_MAX_M2_ZB632KL_IN = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Asus ZenFone Max Plus M1 (ZB570TL) */
    val ZENFONE_MAX_PLUS_M1_ZB570TL = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Asus ZenFone Max Plus M1 (ZB570TL) */
    val ZENFONE_MAX_PLUS_M1_ZB570TL_720X1440 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Asus ZenFone Max Plus M2 (ZB634KL) */
    val ZENFONE_MAX_PLUS_M2_ZB634KL = "spec:width=1080,height=2280,unit=px,dpi=480"

    /** Asus ZenFone Max Pro M1 (ZB602KL) (WW) / Max Pro M1 (ZB601KL) (IN) */
    val ZENFONE_MAX_PRO_M1_ZB602KL_WW_MAX_PRO_M1_ZB601KL_IN = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Asus ZenFone Max Pro M2 (ZB631KL) (WW) / Max Pro M2 (ZB630KL) (IN) */
    val ZENFONE_MAX_PRO_M2_ZB631KL_WW_MAX_PRO_M2_ZB630KL_IN = "spec:width=1080,height=2280,unit=px,dpi=480"

    /** Asus ZenFone Max Shot (ZB634KL) */
    val ZENFONE_MAX_SHOT_ZB634KL = "spec:width=1080,height=2280,unit=px,dpi=480"

    /** Asus ZenFone Max (ZC550KL) */
    val ZENFONE_MAX_ZC550KL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ZenFone Selfie (ZD551KL) */
    val ZENFONE_SELFIE_ZD551KL = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Asus ZenFone V */
    val ZENFONE_V = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Asus ZenFone V Live */
    val ZENFONE_V_LIVE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Asus ZenFone Zoom (ZX551ML) */
    val ZENFONE_ZOOM_ZX551ML = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Asus ZenPad 10 (Z300C) */
    val ZENPAD_10_Z300C = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Asus ZenPad 10 (Z300CG) */
    val ZENPAD_10_Z300CG = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Asus ZenPad 10 (Z300CL) */
    val ZENPAD_10_Z300CL = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Asus ZenPad 10 (Z300M) */
    val ZENPAD_10_Z300M = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Asus ZenPad 10 (Z301M) */
    val ZENPAD_10_Z301M = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Asus ZenPad 10 (Z301MF) */
    val ZENPAD_10_Z301MF = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Asus ZenPad 10 (Z301MFL) */
    val ZENPAD_10_Z301MFL = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Asus ZenPad 10 (Z301ML) */
    val ZENPAD_10_Z301ML = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Asus ZenPad 3 8.0 */
    val ZENPAD_3_8_0 = "spec:width=1536,height=2048,unit=px,dpi=320"

    /** Asus ZenPad 3 8.0 (Z581KL) */
    val ZENPAD_3_8_0_Z581KL = "spec:width=1536,height=2048,unit=px,dpi=320"

    /** Asus ZenPad 3S 10 LTE (Z500KL) */
    val ZENPAD_3S_10_LTE_Z500KL = "spec:width=1536,height=2048,unit=px,dpi=320"

    /** Asus ZenPad 3S 10 (Z500M) */
    val ZENPAD_3S_10_Z500M = "spec:width=1536,height=2048,unit=px,dpi=320"

    /** Asus ZenPad 7.0 (Z370C) */
    val ZENPAD_7_0_Z370C = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Asus ZenPad 7.0 (Z370CG) */
    val ZENPAD_7_0_Z370CG = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Asus ZenPad 7.0 (Z370KL) */
    val ZENPAD_7_0_Z370KL = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Asus Zenpad 8.0 (Z380C) */
    val ZENPAD_8_0_Z380C = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Asus ZenPad 8.0 (Z380KL) */
    val ZENPAD_8_0_Z380KL = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Asus ZenPad 8.0 (Z380M) */
    val ZENPAD_8_0_Z380M = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Asus ZenPad C 7.0 */
    val ZENPAD_C_7_0 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Asus ZenPad C 7.0 (Z170C) */
    val ZENPAD_C_7_0_Z170C = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Asus ZenPad C 7.0 (Z170CG) */
    val ZENPAD_C_7_0_Z170CG = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Asus ZenPad C 7.0 (Z170MG) */
    val ZENPAD_C_7_0_Z170MG = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Asus ZenPad S 8.0 (Z580C) */
    val ZENPAD_S_8_0_Z580C = "spec:width=1536,height=2048,unit=px,dpi=320"

    /** Asus ZenPad S 8.0 (Z580CA) */
    val ZENPAD_S_8_0_Z580CA = "spec:width=1536,height=2048,unit=px,dpi=320"

    /** Asus ZenPad Z10 */
    val ZENPAD_Z10 = "spec:width=1536,height=2048,unit=px,dpi=320"

    /** Asus ZenPad Z8 */
    val ZENPAD_Z8 = "spec:width=1536,height=2048,unit=px,dpi=360"

    /** Asus ZenPad Z8s */
    val ZENPAD_Z8S = "spec:width=1536,height=2048,unit=px,dpi=360"

}
