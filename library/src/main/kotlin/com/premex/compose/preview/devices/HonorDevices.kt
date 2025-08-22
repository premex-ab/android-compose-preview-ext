package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Honor device specifications for Android Compose previews.
 *
 * This extension provides Honor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Honor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Honor get() = object {
    /** Honor 荣耀平板10 */
    val _10 = "spec:width=1600,height=2560,unit=px,dpi=360"

    /** Honor HONOR 100 */
    val HONOR_100 = "spec:width=1200,height=2664,unit=px,dpi=524"

    /** Honor HONOR 100 Pro */
    val HONOR_100_PRO = "spec:width=1224,height=2700,unit=px,dpi=530"

    /** Honor HONOR 200 */
    val HONOR_200 = "spec:width=1200,height=2664,unit=px,dpi=520"

    /** Honor Honor 200 Lite */
    val HONOR_200_LITE = "spec:width=1080,height=2412,unit=px,dpi=480"

    /** Honor HONOR 200 Pro */
    val HONOR_200_PRO = "spec:width=1224,height=2700,unit=px,dpi=520"

    /** Honor HONOR 200 Smart */
    val HONOR_200_SMART = "spec:width=1080,height=2412,unit=px,dpi=480"

    /** Honor HONOR 400 */
    val HONOR_400 = "spec:width=1264,height=2736,unit=px,dpi=560"

    /** Honor HONOR 400 Lite */
    val HONOR_400_LITE = "spec:width=1080,height=2412,unit=px,dpi=480"

    /** Honor HONOR 400 Pro */
    val HONOR_400_PRO = "spec:width=1280,height=2800,unit=px,dpi=560"

    /** Honor HONOR 50 */
    val HONOR_50 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Honor HONOR 50 Lite */
    val HONOR_50_LITE = "spec:width=1080,height=2376,unit=px,dpi=480"

    /** Honor HONOR 70 */
    val HONOR_70 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Honor HONOR 70 Lite */
    val HONOR_70_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Honor HONOR 90 */
    val HONOR_90 = "spec:width=1200,height=2664,unit=px,dpi=480"

    /** Honor HONOR 90 GT */
    val HONOR_90_GT = "spec:width=1200,height=2664,unit=px,dpi=524"

    /** Honor HONOR 90 Lite */
    val HONOR_90_LITE = "spec:width=1080,height=2388,unit=px,dpi=480"

    /** Honor HONOR 90 Smart */
    val HONOR_90_SMART = "spec:width=1080,height=2412,unit=px,dpi=480"

    /** Honor HONOR Magic4 Lite */
    val HONOR_MAGIC4_LITE = "spec:width=1080,height=2388,unit=px,dpi=480"

    /** Honor HONOR Magic4 Lite 5G */
    val HONOR_MAGIC4_LITE_5G = "spec:width=1080,height=2388,unit=px,dpi=480"

    /** Honor HONOR Magic4 Pro */
    val HONOR_MAGIC4_PRO = "spec:width=1312,height=2848,unit=px,dpi=560"

    /** Honor HONOR Magic5 Lite 5G */
    val HONOR_MAGIC5_LITE_5G = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Honor HONOR Magic5 Pro */
    val HONOR_MAGIC5_PRO = "spec:width=1312,height=2848,unit=px,dpi=560"

    /** Honor HONOR Magic6 */
    val HONOR_MAGIC6 = "spec:width=1264,height=2800,unit=px,dpi=560"

    /** Honor HONOR Magic7 */
    val HONOR_MAGIC7 = "spec:width=1264,height=2800,unit=px,dpi=560"

    /** Honor HONOR Magic7 Lite */
    val HONOR_MAGIC7_LITE = "spec:width=1224,height=2700,unit=px,dpi=520"

    /** Honor HONOR Magic7 Pro */
    val HONOR_MAGIC7_PRO = "spec:width=1280,height=2800,unit=px,dpi=560"

    /** Honor HONOR MagicPad2 */
    val HONOR_MAGICPAD2 = "spec:width=1920,height=3000,unit=px,dpi=400"

    /** Honor HONOR Magic V2 */
    val HONOR_MAGIC_V2 = "spec:width=2156,height=2344,unit=px,dpi=480"

    /** Honor HONOR Magic V3 */
    val HONOR_MAGIC_V3 = "spec:width=2156,height=2344,unit=px,dpi=480"

    /** Honor HONOR Magic V5 */
    val HONOR_MAGIC_V5 = "spec:width=2172,height=2352,unit=px,dpi=480"

    /** Honor HONOR Magic Vs */
    val HONOR_MAGIC_VS = "spec:width=1984,height=2272,unit=px,dpi=480"

    /** Honor HONOR Pad 10 */
    val HONOR_PAD_10 = "spec:width=1600,height=2560,unit=px,dpi=360"

    /** Honor HONOR Pad 8 */
    val HONOR_PAD_8 = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Honor HONOR Pad 9 */
    val HONOR_PAD_9 = "spec:width=1600,height=2560,unit=px,dpi=340"

    /** Honor HONOR Pad V9 */
    val HONOR_PAD_V9 = "spec:width=1840,height=2800,unit=px,dpi=400"

    /** Honor HONOR Pad X7 */
    val HONOR_PAD_X7 = "spec:width=800,height=1340,unit=px,dpi=240"

    /** Honor HONOR Pad X8 */
    val HONOR_PAD_X8 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Honor HONOR Pad X8a */
    val HONOR_PAD_X8A = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Honor HONOR Pad X8 Lite */
    val HONOR_PAD_X8_LITE = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Honor HONOR Pad X9 */
    val HONOR_PAD_X9 = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Honor HONOR Pad X9a */
    val HONOR_PAD_X9A = "spec:width=1504,height=2508,unit=px,dpi=360"

    /** Honor HONOR X5 */
    val HONOR_X5 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Honor HONOR X5b */
    val HONOR_X5B = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Honor HONOR X5 Plus */
    val HONOR_X5_PLUS = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Honor HONOR X6 */
    val HONOR_X6 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Honor HONOR X6b */
    val HONOR_X6B = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Honor HONOR X6b 5G */
    val HONOR_X6B_5G = "spec:width=720,height=1610,unit=px,dpi=320"

    /** Honor HONOR X6c */
    val HONOR_X6C = "spec:width=720,height=1604,unit=px,dpi=320"

    /** Honor HONOR X7 */
    val HONOR_X7 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Honor HONOR X7a  */
    val HONOR_X7A = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Honor HONOR X7b */
    val HONOR_X7B = "spec:width=1080,height=2412,unit=px,dpi=480"

    /** Honor HONOR X7c */
    val HONOR_X7C = "spec:width=720,height=1610,unit=px,dpi=320"

    /** Honor HONOR X8 */
    val HONOR_X8 = "spec:width=1080,height=2388,unit=px,dpi=480"

    /** Honor HONOR X8 5G */
    val HONOR_X8_5G = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Honor HONOR X8a */
    val HONOR_X8A = "spec:width=1080,height=2388,unit=px,dpi=480"

    /** Honor HONOR X8b */
    val HONOR_X8B = "spec:width=1080,height=2412,unit=px,dpi=480"

    /** Honor HONOR X8c */
    val HONOR_X8C = "spec:width=1080,height=2412,unit=px,dpi=480"

    /** Honor HONOR X9b 5G */
    val HONOR_X9B_5G = "spec:width=1200,height=2652,unit=px,dpi=520"

    /** Honor Honor X9c Smart */
    val HONOR_X9C_SMART = "spec:width=1080,height=2412,unit=px,dpi=480"

    /** Honor MagicPad 3 */
    val MAGICPAD_3 = "spec:width=2136,height=3200,unit=px,dpi=420"

    /** Honor PORSCHE DESIGN HONOR Magic6 RSR */
    val PORSCHE_DESIGN_HONOR_MAGIC6_RSR = "spec:width=1280,height=2800,unit=px,dpi=560"

    /** Honor 荣耀Power */
    val POWER = "spec:width=1224,height=2700,unit=px,dpi=520"

    /** Honor 荣耀平板V9 */
    val V9 = "spec:width=1840,height=2800,unit=px,dpi=400"

    /** Honor 荣耀V Purse */
    val V_PURSE = "spec:width=2016,height=2348,unit=px,dpi=480"

    /** Honor 荣耀X60 */
    val X60 = "spec:width=1080,height=2412,unit=px,dpi=480"

    /** Honor 荣耀X60 PRO */
    val X60_PRO = "spec:width=1224,height=2700,unit=px,dpi=520"

    /** Honor 荣耀X70 */
    val X70 = "spec:width=1200,height=2640,unit=px,dpi=520"

}
