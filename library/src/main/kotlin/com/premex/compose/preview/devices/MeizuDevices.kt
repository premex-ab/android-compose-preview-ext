package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Meizu device specifications for Android Compose previews.
 *
 * This extension provides Meizu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Meizu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Meizu get() = object {
    /** Meizu 15 */
    val _15 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Meizu 15 Lite */
    val _15_LITE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Meizu 15 Plus */
    val _15_PLUS = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** Meizu 16 */
    val _16 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Meizu 16s */
    val _16S = "spec:width=1080,height=2232,unit=px,dpi=480"

    /** Meizu 16s pro */
    val _16S_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Meizu 16T */
    val _16T = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Meizu 16th */
    val _16TH = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Meizu 16 X */
    val _16_X = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Meizu E3 */
    val E3 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Meizu M15 */
    val M15 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Meizu M1813 */
    val M1813 = "spec:width=1080,height=1920,unit=px,dpi=556"

    /** Meizu M1822 */
    val M1822 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Meizu M1852 */
    val M1852 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Meizu M6s */
    val M6S = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Meizu M6T */
    val M6T = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Meizu M8c */
    val M8C = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Meizu Mblu 21 */
    val MBLU_21 = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Meizu Mblu 22 */
    val MBLU_22 = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Meizu Mblu 22 Pro */
    val MBLU_22_PRO = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Meizu meizu 16Xs */
    val MEIZU_16XS = "spec:width=1080,height=2232,unit=px,dpi=480"

    /** Meizu meizu 17 */
    val MEIZU_17 = "spec:width=1080,height=2340,unit=px,dpi=440"

    /** Meizu meizu 17 Pro */
    val MEIZU_17_PRO = "spec:width=1080,height=2340,unit=px,dpi=440"

    /** Meizu MEIZU 18 */
    val MEIZU_18 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Meizu meizu 18 Pro */
    val MEIZU_18_PRO = "spec:width=1080,height=2400,unit=px,dpi=440"

    /** Meizu MEIZU 18s */
    val MEIZU_18S = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Meizu MEIZU 18s Pro */
    val MEIZU_18S_PRO = "spec:width=1080,height=2400,unit=px,dpi=440"

    /** Meizu MEIZU 18X */
    val MEIZU_18X = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Meizu meizu 20 */
    val MEIZU_20 = "spec:width=1080,height=2400,unit=px,dpi=450"

    /** Meizu MEIZU 20 Inf */
    val MEIZU_20_INF = "spec:width=1368,height=3192,unit=px,dpi=560"

    /** Meizu meizu 20 Pro */
    val MEIZU_20_PRO = "spec:width=1080,height=2400,unit=px,dpi=440"

    /** Meizu meizu 21 */
    val MEIZU_21 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Meizu MEIZU 21 Note */
    val MEIZU_21_NOTE = "spec:width=1264,height=2780,unit=px,dpi=520"

    /** Meizu meizu 21 PRO */
    val MEIZU_21_PRO = "spec:width=1368,height=3192,unit=px,dpi=480"

    /** Meizu Meizu 6T */
    val MEIZU_6T = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Meizu meizu C9 */
    val MEIZU_C9 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Meizu meizu C9 pro */
    val MEIZU_C9_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Meizu meizu M10 */
    val MEIZU_M10 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Meizu meizu M6 */
    val MEIZU_M6 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Meizu meizu M6 Note */
    val MEIZU_M6_NOTE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Meizu meizu M8 */
    val MEIZU_M8 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Meizu meizu M8 lite */
    val MEIZU_M8_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Meizu MEIZU Note 21 */
    val MEIZU_NOTE_21 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Meizu MEIZU Note 21 Pro */
    val MEIZU_NOTE_21_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Meizu meizu note8 */
    val MEIZU_NOTE8 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Meizu meizu note9 */
    val MEIZU_NOTE9 = "spec:width=1080,height=2244,unit=px,dpi=480"

    /** Meizu Meizu S6 */
    val MEIZU_S6 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Meizu meizu X8 */
    val MEIZU_X8 = "spec:width=1080,height=2220,unit=px,dpi=480"

    /** Meizu Note9 */
    val NOTE9 = "spec:width=1080,height=2244,unit=px,dpi=480"

    /** Meizu Polestar Phone */
    val POLESTAR_PHONE = "spec:width=1368,height=3192,unit=px,dpi=480"

    /** Meizu PRO 7 */
    val PRO_7 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Meizu PRO 7 Plus */
    val PRO_7_PLUS = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** Meizu PRO7S */
    val PRO7S = "spec:width=1080,height=1920,unit=px,dpi=480"

}
