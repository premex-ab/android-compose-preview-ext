package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * OnePlus device specifications for Android Compose previews.
 *
 * This extension provides OnePlus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.OnePlus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.OnePlus get() = object {
    /** OnePlus 2 */
    val _2 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** OnePlus 一加平板 2 Pro */
    val _2_PRO = "spec:width=2400,height=3392,unit=px,dpi=420"

    /** OnePlus Nord CE5 */
    val NORD_CE5 = "spec:width=1080,height=2392,unit=px,dpi=480"

    /** OnePlus One */
    val ONE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** OnePlus OnePlus 10 Pro */
    val ONEPLUS_10_PRO = "spec:width=1440,height=3216,unit=px,dpi=480"

    /** OnePlus OnePlus 10 Pro 5G */
    val ONEPLUS_10_PRO_5G = "spec:width=1440,height=3216,unit=px,dpi=240"

    /** OnePlus OnePlus 10R 5G */
    val ONEPLUS_10R_5G = "spec:width=1080,height=2412,unit=px,dpi=480"

    /** OnePlus OnePlus 10T 5G */
    val ONEPLUS_10T_5G = "spec:width=1080,height=2412,unit=px,dpi=240"

    /** OnePlus OnePlus 11 5G */
    val ONEPLUS_11_5G = "spec:width=1440,height=3216,unit=px,dpi=480"

    /** OnePlus OnePlus 11R 5G */
    val ONEPLUS_11R_5G = "spec:width=1240,height=2772,unit=px,dpi=560"

    /** OnePlus OnePlus 12 */
    val ONEPLUS_12 = "spec:width=1440,height=3216,unit=px,dpi=640"

    /** OnePlus OnePlus 12R */
    val ONEPLUS_12R = "spec:width=1264,height=2780,unit=px,dpi=560"

    /** OnePlus OnePlus 13 */
    val ONEPLUS_13 = "spec:width=1440,height=3216,unit=px,dpi=640"

    /** OnePlus OnePlus 13R */
    val ONEPLUS_13R = "spec:width=1264,height=2780,unit=px,dpi=560"

    /** OnePlus OnePlus 13s */
    val ONEPLUS_13S = "spec:width=1216,height=2640,unit=px,dpi=560"

    /** OnePlus OnePlus 13T */
    val ONEPLUS_13T = "spec:width=1216,height=2640,unit=px,dpi=560"

    /** OnePlus OnePlus3 */
    val ONEPLUS3 = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** OnePlus OnePlus3T */
    val ONEPLUS3T = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** OnePlus OnePlus5 */
    val ONEPLUS5 = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** OnePlus OnePlus5T */
    val ONEPLUS5T = "spec:width=1080,height=2160,unit=px,dpi=420"

    /** OnePlus OnePlus 6 */
    val ONEPLUS_6 = "spec:width=1080,height=2280,unit=px,dpi=450"

    /** OnePlus OnePlus6T */
    val ONEPLUS6T = "spec:width=1080,height=2340,unit=px,dpi=450"

    /** OnePlus OnePlus 7 */
    val ONEPLUS_7 = "spec:width=1080,height=2340,unit=px,dpi=450"

    /** OnePlus OnePlus 7 Pro */
    val ONEPLUS_7_PRO = "spec:width=1440,height=3120,unit=px,dpi=560"

    /** OnePlus OnePlus 7 Pro */
    val ONEPLUS_7_PRO_1440X3120 = "spec:width=1440,height=3120,unit=px,dpi=600"

    /** OnePlus OnePlus 7 Pro 5G */
    val ONEPLUS_7_PRO_5G = "spec:width=1440,height=3120,unit=px,dpi=560"

    /** OnePlus OnePlus 7T */
    val ONEPLUS_7T = "spec:width=1080,height=2400,unit=px,dpi=450"

    /** OnePlus OnePlus 7T Pro */
    val ONEPLUS_7T_PRO = "spec:width=1440,height=3120,unit=px,dpi=600"

    /** OnePlus OnePlus 7T Pro 5G */
    val ONEPLUS_7T_PRO_5G = "spec:width=1440,height=3120,unit=px,dpi=600"

    /** OnePlus OnePlus 8 */
    val ONEPLUS_8 = "spec:width=1080,height=2400,unit=px,dpi=450"

    /** OnePlus OnePlus 8 */
    val ONEPLUS_8_1080X2400 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** OnePlus OnePlus 8 5G  */
    val ONEPLUS_8_5G = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** OnePlus OnePlus 8 5G UW */
    val ONEPLUS_8_5G_UW = "spec:width=1080,height=2400,unit=px,dpi=450"

    /** OnePlus OnePlus 8 Pro */
    val ONEPLUS_8_PRO = "spec:width=1080,height=2376,unit=px,dpi=480"

    /** OnePlus OnePlus 8T */
    val ONEPLUS_8T = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** OnePlus OnePlus 8T+ 5G */
    val ONEPLUS_8T_5G = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** OnePlus OnePlus 9 5G */
    val ONEPLUS_9_5G = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** OnePlus OnePlus 9 Pro 5G */
    val ONEPLUS_9_PRO_5G = "spec:width=1080,height=2412,unit=px,dpi=480"

    /** OnePlus OnePlus 9R */
    val ONEPLUS_9R = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** OnePlus OnePlus 9RT 5G */
    val ONEPLUS_9RT_5G = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** OnePlus OnePlus Ace */
    val ONEPLUS_ACE = "spec:width=1080,height=2412,unit=px,dpi=480"

    /** OnePlus Oneplus Ace 2 Pro */
    val ONEPLUS_ACE_2_PRO = "spec:width=1240,height=2772,unit=px,dpi=560"

    /** OnePlus OnePlus Ace 3 */
    val ONEPLUS_ACE_3 = "spec:width=1264,height=2780,unit=px,dpi=560"

    /** OnePlus Oneplus Ace 3 Pro */
    val ONEPLUS_ACE_3_PRO = "spec:width=1264,height=2780,unit=px,dpi=560"

    /** OnePlus OnePlus Ace 3V */
    val ONEPLUS_ACE_3V = "spec:width=1240,height=2772,unit=px,dpi=560"

    /** OnePlus OnePlus Ace 5 竞速版 */
    val ONEPLUS_ACE_5 = "spec:width=1080,height=2392,unit=px,dpi=480"

    /** OnePlus OnePlus Ace 5 */
    val ONEPLUS_ACE_5_1264X2780 = "spec:width=1264,height=2780,unit=px,dpi=560"

    /** OnePlus OnePlus Ace 5 至尊版 */
    val ONEPLUS_ACE_5_DPI560 = "spec:width=1272,height=2800,unit=px,dpi=560"

    /** OnePlus OnePlus Ace 5 Pro */
    val ONEPLUS_ACE_5_PRO = "spec:width=1264,height=2780,unit=px,dpi=560"

    /** OnePlus OnePlus Nord */
    val ONEPLUS_NORD = "spec:width=1080,height=2400,unit=px,dpi=450"

    /** OnePlus OnePlus Nord2 5G */
    val ONEPLUS_NORD2_5G = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** OnePlus OnePlus Nord 2T 5G */
    val ONEPLUS_NORD_2T_5G = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** OnePlus OnePlus Nord 3 5G */
    val ONEPLUS_NORD_3_5G = "spec:width=1240,height=2772,unit=px,dpi=560"

    /** OnePlus OnePlus Nord 4 */
    val ONEPLUS_NORD_4 = "spec:width=1240,height=2772,unit=px,dpi=560"

    /** OnePlus OnePlus Nord 5 */
    val ONEPLUS_NORD_5 = "spec:width=1272,height=2800,unit=px,dpi=560"

    /** OnePlus OnePlus Nord CE 2 */
    val ONEPLUS_NORD_CE_2 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** OnePlus OnePlus Nord CE 2 Lite 5G */
    val ONEPLUS_NORD_CE_2_LITE_5G = "spec:width=1080,height=2412,unit=px,dpi=480"

    /** OnePlus OnePlus Nord CE 3 Lite 5G */
    val ONEPLUS_NORD_CE_3_LITE_5G = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** OnePlus OnePlus Nord CE4 */
    val ONEPLUS_NORD_CE4 = "spec:width=1080,height=2412,unit=px,dpi=480"

    /** OnePlus OnePlus Nord CE4 Lite 5G */
    val ONEPLUS_NORD_CE4_LITE_5G = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** OnePlus OnePlus Nord CE 5G */
    val ONEPLUS_NORD_CE_5G = "spec:width=1080,height=2400,unit=px,dpi=450"

    /** OnePlus OnePlus Nord N100 */
    val ONEPLUS_NORD_N100 = "spec:width=720,height=1600,unit=px,dpi=300"

    /** OnePlus OnePlus Nord N10 5G */
    val ONEPLUS_NORD_N10_5G = "spec:width=1080,height=2400,unit=px,dpi=450"

    /** OnePlus OnePlus Nord N200 5G */
    val ONEPLUS_NORD_N200_5G = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** OnePlus OnePlus Nord N20 5G */
    val ONEPLUS_NORD_N20_5G = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** OnePlus OnePlus Nord N30 SE 5G */
    val ONEPLUS_NORD_N30_SE_5G = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** OnePlus OnePlus Pad */
    val ONEPLUS_PAD = "spec:width=2000,height=2800,unit=px,dpi=400"

    /** OnePlus Oneplus Pad2 */
    val ONEPLUS_PAD2 = "spec:width=2120,height=3000,unit=px,dpi=420"

    /** OnePlus OnePlus Pad Go */
    val ONEPLUS_PAD_GO = "spec:width=1720,height=2408,unit=px,dpi=360"

    /** OnePlus OnePlus Pad Lite */
    val ONEPLUS_PAD_LITE = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** OnePlus Open */
    val OPEN = "spec:width=2268,height=2440,unit=px,dpi=520"

    /** OnePlus Pad 3 */
    val PAD_3 = "spec:width=2400,height=3392,unit=px,dpi=420"

    /** OnePlus PHP110 */
    val PHP110 = "spec:width=1240,height=2772,unit=px,dpi=560"

    /** OnePlus 一加平板Pro */
    val PRO = "spec:width=2120,height=3000,unit=px,dpi=420"

    /** OnePlus X */
    val X = "spec:width=1080,height=1920,unit=px,dpi=480"

}
