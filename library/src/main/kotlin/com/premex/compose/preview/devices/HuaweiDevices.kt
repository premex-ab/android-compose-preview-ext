package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Huawei device specifications for Android Compose previews.
 *
 * This extension provides Huawei device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Huawei.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Huawei get() = object {
    /** Huawei 麦芒4 */
    val _4 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei 荣耀畅玩4C */
    val _4C = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei 荣耀畅玩4X */
    val _4X = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei 荣耀平板5 */
    val _5 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Huawei 荣耀平板5 */
    val _5_1200X1920 = "spec:width=1200,height=1920,unit=px,dpi=360"

    /** Huawei 荣耀畅玩5A */
    val _5A = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei 华为畅享6 */
    val _6 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei 荣耀畅玩 6X */
    val _6X = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei 荣耀畅享7 Plus */
    val _7_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei 华为畅享8e */
    val _8E = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Huawei 荣耀 8X */
    val _8X = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Huawei 荣耀8X Max */
    val _8X_MAX = "spec:width=1080,height=2244,unit=px,dpi=480"

    /** Huawei 华为畅享 9e */
    val _9E = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei 荣耀9i */
    val _9I = "spec:width=1080,height=2280,unit=px,dpi=480"

    /** Huawei 华为畅享 9S */
    val _9S = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Huawei 荣耀9X */
    val _9X = "spec:width=1080,height=2376,unit=px,dpi=480"

    /** Huawei ascend-5w */
    val ASCEND_5W = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei Ascend G525 */
    val ASCEND_G525 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Huawei ATH-TL00 */
    val ATH_TL00 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei C199 */
    val C199 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei 华为平板 C5 */
    val C5 = "spec:width=1440,height=2200,unit=px,dpi=300"

    /** Huawei CHC-U23 */
    val CHC_U23 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei Che1-CL10 */
    val CHE1_CL10 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei Che2-L11 */
    val CHE2_L11 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei CHM-CL00 */
    val CHM_CL00 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei Copper Plus */
    val COPPER_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei d-01G */
    val D_01G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Huawei d-01H */
    val D_01H = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Huawei d-02H */
    val D_02H = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Huawei D2 */
    val D2 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei dtab01 */
    val DTAB01 = "spec:width=752,height=1280,unit=px,dpi=160"

    /** Huawei ECO */
    val ECO = "spec:width=480,height=854,unit=px,dpi=240"

    /** Huawei G510 */
    val G510 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Huawei G526 */
    val G526 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Huawei G527 */
    val G527 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Huawei G535-L11 */
    val G535_L11 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Huawei G610 */
    val G610 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Huawei G610-U15 */
    val G610_U15 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Huawei G610-U20 */
    val G610_U20 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Huawei G615-U10 */
    val G615_U10 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Huawei G620-A2 */
    val G620_A2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei G620-L72 */
    val G620_L72 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Huawei G620S-L01 */
    val G620S_L01 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei G620S-L02 */
    val G620S_L02 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei G620S-L03 */
    val G620S_L03 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei G620S-UL00 */
    val G620S_UL00 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei G621-TL00M */
    val G621_TL00M = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei G629-UL00 */
    val G629_UL00 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei G630-U10 */
    val G630_U10 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei G630-U20 */
    val G630_U20 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei G630-U251 */
    val G630_U251 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei G6-L11 */
    val G6_L11 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Huawei G6-L22 */
    val G6_L22 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Huawei G6-L33 */
    val G6_L33 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Huawei G6-U10 */
    val G6_U10 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Huawei G700-U10 */
    val G700_U10 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei G700-U20 */
    val G700_U20 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei G730 */
    val G730 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei G730-U10 */
    val G730_U10 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Huawei G730-U251 */
    val G730_U251 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Huawei G735-L03 */
    val G735_L03 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei G740 */
    val G740 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei G750-T20 */
    val G750_T20 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei G750-U10 */
    val G750_U10 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei G7-L01 */
    val G7_L01 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei G7-L03 */
    val G7_L03 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei G7-L11 */
    val G7_L11 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei G7-TL00 */
    val G7_TL00 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei G7-UL20 */
    val G7_UL20 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei G8 */
    val G8 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei G9 Plus */
    val G9_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei GL07S */
    val GL07S = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei GR3 */
    val GR3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei GR5 */
    val GR5 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei Gran_Roraima */
    val GRAN_RORAIMA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Huawei GT3 */
    val GT3 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei GX8 */
    val GX8 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei H30-L02 */
    val H30_L02 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei H60-L11 */
    val H60_L11 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei H892L */
    val H892L = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei HAUWEI Y5 Lite 2018 */
    val HAUWEI_Y5_LITE_2018 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Huawei Hol-U19 */
    val HOL_U19 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei Honor 10 */
    val HONOR_10 = "spec:width=1080,height=2280,unit=px,dpi=480"

    /** Huawei HONOR 10i */
    val HONOR_10I = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Huawei honor 10 Lite */
    val HONOR_10_LITE = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Huawei HONOR 20 */
    val HONOR_20 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Huawei HONOR 20S */
    val HONOR_20S = "spec:width=1080,height=2312,unit=px,dpi=480"

    /** Huawei Honor3 */
    val HONOR3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei Honor 4A */
    val HONOR_4A = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei Honor 5A */
    val HONOR_5A = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei Honor 5C */
    val HONOR_5C = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei Honor 5X */
    val HONOR_5X = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei Honor 6A */
    val HONOR_6A = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei honor 6C Pro */
    val HONOR_6C_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei Honor 7 */
    val HONOR_7 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei Honor 7C */
    val HONOR_7C = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Huawei Honor 7S */
    val HONOR_7S = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Huawei Honor 7X */
    val HONOR_7X = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Huawei Honor 8 */
    val HONOR_8 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei Honor 8A */
    val HONOR_8A = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Huawei honor 8C */
    val HONOR_8C = "spec:width=720,height=1520,unit=px,dpi=160"

    /** Huawei HONOR 8S */
    val HONOR_8S = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Huawei Honor 8 Smart */
    val HONOR_8_SMART = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei Honor 8X */
    val HONOR_8X = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Huawei Honor 9 */
    val HONOR_9 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei Honor 9 Lite */
    val HONOR_9_LITE = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Huawei HONOR 9X */
    val HONOR_9X = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Huawei Honor Magic 2 */
    val HONOR_MAGIC_2 = "spec:width=1344,height=2772,unit=px,dpi=480"

    /** Huawei Honor Note10 */
    val HONOR_NOTE10 = "spec:width=1080,height=2220,unit=px,dpi=420"

    /** Huawei Honor Play */
    val HONOR_PLAY = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Huawei Honor V10 */
    val HONOR_V10 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Huawei Honor V8 */
    val HONOR_V8 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei Honor V9 */
    val HONOR_V9 = "spec:width=1440,height=2560,unit=px,dpi=480"

    /** Huawei HONOR View20 */
    val HONOR_VIEW20 = "spec:width=1080,height=2310,unit=px,dpi=480"

    /** Huawei Huawei Elate™ */
    val HUAWEI_ELATE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei HUAWEI GR5 2017 */
    val HUAWEI_GR5_2017 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei HUAWEI Mate 20 X (5G) */
    val HUAWEI_MATE_20_X_5G = "spec:width=1080,height=2244,unit=px,dpi=480"

    /** Huawei HUAWEI Mate SE */
    val HUAWEI_MATE_SE = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Huawei HUAWEI MediaPad M3 Lite */
    val HUAWEI_MEDIAPAD_M3_LITE = "spec:width=1200,height=1920,unit=px,dpi=360"

    /** Huawei HUAWEI MediaPad M3 Lite 10 wp */
    val HUAWEI_MEDIAPAD_M3_LITE_10_WP = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Huawei HUAWEI MediaPad M5 10.8 */
    val HUAWEI_MEDIAPAD_M5_10_8 = "spec:width=1600,height=2560,unit=px,dpi=400"

    /** Huawei HUAWEI MediaPad M5 8.4 */
    val HUAWEI_MEDIAPAD_M5_8_4 = "spec:width=1600,height=2560,unit=px,dpi=480"

    /** Huawei HUAWEI MediaPad M5 lite */
    val HUAWEI_MEDIAPAD_M5_LITE = "spec:width=1200,height=1920,unit=px,dpi=360"

    /** Huawei HUAWEI MediaPad M5 Pro */
    val HUAWEI_MEDIAPAD_M5_PRO = "spec:width=1600,height=2560,unit=px,dpi=400"

    /** Huawei HUAWEI MediaPad T3 10 */
    val HUAWEI_MEDIAPAD_T3_10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Huawei Huawei MediaPad T5 */
    val HUAWEI_MEDIAPAD_T5 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Huawei HUAWEI nova 2 Plus */
    val HUAWEI_NOVA_2_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei HUAWEI nova 5T */
    val HUAWEI_NOVA_5T = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Huawei HUAWEI P30 */
    val HUAWEI_P30 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Huawei HUAWEI P30 lite */
    val HUAWEI_P30_LITE = "spec:width=1080,height=2312,unit=px,dpi=480"

    /** Huawei HUAWEI P9 lite mini */
    val HUAWEI_P9_LITE_MINI = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei HUAWEI P smart */
    val HUAWEI_P_SMART = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Huawei HUAWEI P smart 2020 */
    val HUAWEI_P_SMART_2020 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Huawei HUAWEI Y5 2018 */
    val HUAWEI_Y5_2018 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Huawei HUAWEI Y5 2019 */
    val HUAWEI_Y5_2019 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Huawei HUAWEI Y5 lite */
    val HUAWEI_Y5_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Huawei HUAWEI Y5 lite 2017 */
    val HUAWEI_Y5_LITE_2017 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Huawei HUAWEI Y6 2017 */
    val HUAWEI_Y6_2017 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei HUAWEI Y6 2018 */
    val HUAWEI_Y6_2018 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Huawei HUAWEI Y6 2019 */
    val HUAWEI_Y6_2019 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Huawei HUAWEI Y6s */
    val HUAWEI_Y6S = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Huawei HUAWEI Y7 2018 */
    val HUAWEI_Y7_2018 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Huawei HUAWEI Y7 2019 */
    val HUAWEI_Y7_2019 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Huawei HUAWEI Y9 2018 */
    val HUAWEI_Y9_2018 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Huawei Huawei Y9 2019 */
    val HUAWEI_Y9_2019 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Huawei HUWEI MediaPad T3 */
    val HUWEI_MEDIAPAD_T3 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Huawei HWT31 */
    val HWT31 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Huawei LISZT */
    val LISZT = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Huawei M2 */
    val M2 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Huawei 华为揽阅M2青春版7.0 */
    val M2_7_0 = "spec:width=1200,height=1920,unit=px,dpi=400"

    /** Huawei M3 */
    val M3 = "spec:width=1600,height=2560,unit=px,dpi=480"

    /** Huawei 华为平板 M5 青春版 */
    val M5 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Huawei Mate 10 */
    val MATE_10 = "spec:width=1440,height=2560,unit=px,dpi=480"

    /** Huawei Mate 10 lite */
    val MATE_10_LITE = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Huawei Mate 10 Pro */
    val MATE_10_PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Huawei Mate 20 */
    val MATE_20 = "spec:width=1080,height=2244,unit=px,dpi=480"

    /** Huawei Mate 20 lite */
    val MATE_20_LITE = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Huawei Mate 20 Pro */
    val MATE_20_PRO = "spec:width=1440,height=3120,unit=px,dpi=480"

    /** Huawei Mate 7 */
    val MATE_7 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei Mate 8 */
    val MATE_8 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei Mate 9 */
    val MATE_9 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei Mate 9 Pro */
    val MATE_9_PRO = "spec:width=1440,height=2560,unit=px,dpi=480"

    /** Huawei Mate S */
    val MATE_S = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei 华为畅享 MAX */
    val MAX = "spec:width=1080,height=2244,unit=px,dpi=480"

    /** Huawei MediaPad */
    val MEDIAPAD = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Huawei MediaPad 10 FHD */
    val MEDIAPAD_10_FHD = "spec:width=1128,height=1920,unit=px,dpi=240"

    /** Huawei MediaPad 10 Link */
    val MEDIAPAD_10_LINK = "spec:width=752,height=1280,unit=px,dpi=160"

    /** Huawei MediaPad 10 Link+ */
    val MEDIAPAD_10_LINK_800X1280 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Huawei MediaPad 7 Lite Quad */
    val MEDIAPAD_7_LITE_QUAD = "spec:width=600,height=976,unit=px,dpi=160"

    /** Huawei MediaPad 7 Youth 2 */
    val MEDIAPAD_7_YOUTH_2 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Huawei MediaPad 7 Youth2 */
    val MEDIAPAD_7_YOUTH2 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Huawei MediaPad M1 8.0 */
    val MEDIAPAD_M1_8_0 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Huawei MediaPad M3 Lite 10 */
    val MEDIAPAD_M3_LITE_10 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Huawei MediaPad T2 10.0 pro */
    val MEDIAPAD_T2_10_0_PRO = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Huawei MediaPad T2 7.0 */
    val MEDIAPAD_T2_7_0 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Huawei MediaPad T2 8.0 Pro */
    val MEDIAPAD_T2_8_0_PRO = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Huawei MediaPad T3 7 */
    val MEDIAPAD_T3_7 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Huawei MediaPad X1 7.0 */
    val MEDIAPAD_X1_7_0 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Huawei MediaPad Youth */
    val MEDIAPAD_YOUTH = "spec:width=552,height=1024,unit=px,dpi=160"

    /** Huawei MT1 */
    val MT1 = "spec:width=720,height=1208,unit=px,dpi=240"

    /** Huawei MT2-L01 */
    val MT2_L01 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei MT2-L03 */
    val MT2_L03 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei Nexus 6P */
    val NEXUS_6P = "spec:width=1440,height=2560,unit=px,dpi=560"

    /** Huawei 荣耀Note8 */
    val NOTE8 = "spec:width=1440,height=2560,unit=px,dpi=560"

    /** Huawei nova */
    val NOVA = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei nova 2 */
    val NOVA_2 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei nova 2i */
    val NOVA_2I = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Huawei nova 2s */
    val NOVA_2S = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Huawei nova 3 */
    val NOVA_3 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Huawei nova 3i */
    val NOVA_3I = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Huawei nova 4 */
    val NOVA_4 = "spec:width=1080,height=2310,unit=px,dpi=480"

    /** Huawei P10 */
    val P10 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei P10 lite */
    val P10_LITE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei P10 Plus */
    val P10_PLUS = "spec:width=1440,height=2560,unit=px,dpi=480"

    /** Huawei P20 */
    val P20 = "spec:width=1080,height=2244,unit=px,dpi=480"

    /** Huawei P20 lite */
    val P20_LITE = "spec:width=1080,height=2280,unit=px,dpi=480"

    /** Huawei P20 Pro */
    val P20_PRO = "spec:width=1080,height=2240,unit=px,dpi=480"

    /** Huawei P30 Pro */
    val P30_PRO = "spec:width=1080,height=2340,unit=px,dpi=320"

    /** Huawei P30 Pro */
    val P30_PRO_1080X2340 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Huawei P6 */
    val P6 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei P6S-L04 */
    val P6S_L04 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei P7 */
    val P7 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei P7 mini */
    val P7_MINI = "spec:width=540,height=960,unit=px,dpi=240"

    /** Huawei P8 */
    val P8 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei P8 Lite */
    val P8_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei P8 lite 2017 */
    val P8_LITE_2017 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei P8max */
    val P8MAX = "spec:width=1080,height=1920,unit=px,dpi=400"

    /** Huawei P9 */
    val P9 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei P9 lite */
    val P9_LITE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei P9 lite smart */
    val P9_LITE_SMART = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei P9 Plus */
    val P9_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei PE-CL00 */
    val PE_CL00 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei PORSCHE DESIGN HUAWEI Mate RS */
    val PORSCHE_DESIGN_HUAWEI_MATE_RS = "spec:width=1440,height=2880,unit=px,dpi=480"

    /** Huawei RIO-CL00 */
    val RIO_CL00 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei S10 */
    val S10 = "spec:width=752,height=1280,unit=px,dpi=160"

    /** Huawei S7 */
    val S7 = "spec:width=600,height=976,unit=px,dpi=160"

    /** Huawei Sensa LTE */
    val SENSA_LTE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei ShotX */
    val SHOTX = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Huawei  T101 */
    val T101 = "spec:width=752,height=1280,unit=px,dpi=160"

    /** Huawei T1 10 */
    val T1_10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Huawei t1_8p0 */
    val T1_8P0 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Huawei t1_8p0lte */
    val T1_8P0LTE = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Huawei UNION */
    val UNION = "spec:width=480,height=854,unit=px,dpi=240"

    /** Huawei 荣耀 V9 play */
    val V9_PLAY = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei Vogue7 */
    val VOGUE7 = "spec:width=600,height=976,unit=px,dpi=160"

    /** Huawei 荣耀Waterplay 8英寸 */
    val WATERPLAY_8 = "spec:width=1200,height=1920,unit=px,dpi=360"

    /** Huawei X2 */
    val X2 = "spec:width=1200,height=1920,unit=px,dpi=400"

    /** Huawei Y221-U03 */
    val Y221_U03 = "spec:width=320,height=480,unit=px,dpi=160"

    /** Huawei Y221-U12 */
    val Y221_U12 = "spec:width=320,height=480,unit=px,dpi=160"

    /** Huawei Y300 */
    val Y300 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Huawei Y301A1  */
    val Y301A1 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Huawei Y320-U30 */
    val Y320_U30 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Huawei Y321 */
    val Y321 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Huawei Y330 */
    val Y330 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Huawei Y330-U01 */
    val Y330_U01 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Huawei Y330-U11 */
    val Y330_U11 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Huawei Y330-U15 */
    val Y330_U15 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Huawei Y336-U02 */
    val Y336_U02 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Huawei Y340-U081 */
    val Y340_U081 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Huawei Y360-U61 */
    val Y360_U61 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Huawei Y360-U82 */
    val Y360_U82 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Huawei Y3II */
    val Y3II = "spec:width=480,height=854,unit=px,dpi=240"

    /** Huawei Y3III */
    val Y3III = "spec:width=480,height=854,unit=px,dpi=240"

    /** Huawei Y511-U10 */
    val Y511_U10 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Huawei Y5 2017 */
    val Y5_2017 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei Y520-U03 */
    val Y520_U03 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Huawei Y530 */
    val Y530 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Huawei Y530-U051 */
    val Y530_U051 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Huawei Y536-A1 */
    val Y536_A1 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Huawei Y540-U01 */
    val Y540_U01 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Huawei Y541-U02 */
    val Y541_U02 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Huawei Y550-L01 */
    val Y550_L01 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Huawei Y550-L03 */
    val Y550_L03 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Huawei Y560-L01 */
    val Y560_L01 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Huawei Y560-U02 */
    val Y560_U02 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Huawei Y5II */
    val Y5II = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei Y6 */
    val Y6 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei Y600-U351 */
    val Y600_U351 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Huawei Y625-U32 */
    val Y625_U32 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Huawei Y635-TL00 */
    val Y635_TL00 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Huawei Y6II */
    val Y6II = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei Y6 Pro */
    val Y6_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei Y7 */
    val Y7 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Huawei Y9 Prime 2019 */
    val Y9_PRIME_2019 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Huawei Youth */
    val YOUTH = "spec:width=600,height=976,unit=px,dpi=160"

}
