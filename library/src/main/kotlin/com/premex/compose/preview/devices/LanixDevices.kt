package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Lanix device specifications for Android Compose previews.
 *
 * This extension provides Lanix device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Lanix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Lanix get() = object {
    /** Lanix Alpha 1R */
    val ALPHA_1R = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Lanix Alpha 1V */
    val ALPHA_1V = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Lanix Alpha 3R */
    val ALPHA_3R = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Lanix Alpha_3V */
    val ALPHA_3V = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Lanix Alpha 5V */
    val ALPHA_5V = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Lanix Alpha_950 */
    val ALPHA_950 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Lanix Alpha_950XL */
    val ALPHA_950XL = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Lanix Alpha 9V */
    val ALPHA_9V = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Lanix Ilium Alpha 1s */
    val ILIUM_ALPHA_1S = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Lanix Ilium_Alpha_1TT */
    val ILIUM_ALPHA_1TT = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Lanix Ilium Alpha 3 */
    val ILIUM_ALPHA_3 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Lanix Ilium Alpha 5s */
    val ILIUM_ALPHA_5S = "spec:width=720,height=1520,unit=px,dpi=280"

    /** Lanix Ilium_Alpha_5T */
    val ILIUM_ALPHA_5T = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Lanix Ilium_Alpha7 */
    val ILIUM_ALPHA7 = "spec:width=720,height=1528,unit=px,dpi=280"

    /** Lanix Ilium Alpha 9 */
    val ILIUM_ALPHA_9 = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** Lanix Ilium_L1100 */
    val ILIUM_L1100 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lanix Ilium L1120 */
    val ILIUM_L1120 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lanix Ilium L1400 */
    val ILIUM_L1400 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Lanix ILIUM L200 */
    val ILIUM_L200 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Lanix Ilium L610 */
    val ILIUM_L610 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lanix Ilium L620 */
    val ILIUM_L620 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lanix Ilium L920 */
    val ILIUM_L920 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lanix Ilium LT510 */
    val ILIUM_LT510 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lanix Ilium LT520 */
    val ILIUM_LT520 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lanix Ilium M1 */
    val ILIUM_M1 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Lanix Ilium M3 */
    val ILIUM_M3 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Lanix Ilium M5 */
    val ILIUM_M5 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Lanix Ilium M5s */
    val ILIUM_M5S = "spec:width=480,height=960,unit=px,dpi=240"

    /** Lanix Ilium M7 */
    val ILIUM_M7 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Lanix ILium M7s */
    val ILIUM_M7S = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Lanix Ilium M7T */
    val ILIUM_M7T = "spec:width=480,height=960,unit=px,dpi=240"

    /** Lanix Ilium M7V */
    val ILIUM_M7V = "spec:width=480,height=960,unit=px,dpi=240"

    /** Lanix Ilium M9 */
    val ILIUM_M9 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Lanix Ilium M9s */
    val ILIUM_M9S = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Lanix Ilium M9V */
    val ILIUM_M9V = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Lanix ilium_PADE10 */
    val ILIUM_PADE10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Lanix ILIUM PAD E10Si */
    val ILIUM_PAD_E10SI = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Lanix ilium PAD E8 */
    val ILIUM_PAD_E8 = "spec:width=768,height=1024,unit=px,dpi=160"

    /** Lanix ilium_PAD_RX10 */
    val ILIUM_PAD_RX10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Lanix IliumPad_RX10 */
    val ILIUMPAD_RX10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Lanix ILIUM PAD RX10 Pro */
    val ILIUM_PAD_RX10_PRO = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Lanix IliumPad_RX10v3 */
    val ILIUMPAD_RX10V3 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Lanix ILIUMPAD_RX10v5 */
    val ILIUMPAD_RX10V5 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Lanix IliumPad_RX7 */
    val ILIUMPAD_RX7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Lanix IliumPad_RX8v2 */
    val ILIUMPAD_RX8V2 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Lanix ILIUM_PAD_RX8_v5 */
    val ILIUM_PAD_RX8_V5 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Lanix Ilium X110 */
    val ILIUM_X110 = "spec:width=320,height=480,unit=px,dpi=160"

    /** Lanix Ilium X200 */
    val ILIUM_X200 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Lanix Ilium X210 */
    val ILIUM_X210 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Lanix Ilium X220 */
    val ILIUM_X220 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Lanix Ilium X500B */
    val ILIUM_X500B = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lanix Ilium X510 */
    val ILIUM_X510 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lanix Ilium X520 */
    val ILIUM_X520 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lanix Ilium X710 */
    val ILIUM_X710 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lanix L540 */
    val L540 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lanix Llium L910 */
    val LLIUM_L910 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lanix M1R */
    val M1R = "spec:width=480,height=1014,unit=px,dpi=200"

    /** Lanix RX10v8 */
    val RX10V8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Lanix RX10v9 */
    val RX10V9 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Lanix RX11 */
    val RX11 = "spec:width=1200,height=2000,unit=px,dpi=213"

    /** Lanix RX7_v3 */
    val RX7_V3 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Lanix RX7V4 */
    val RX7V4 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Lanix RX8 */
    val RX8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Lanix X120C */
    val X120C = "spec:width=320,height=480,unit=px,dpi=160"

    /** Lanix X1S */
    val X1S = "spec:width=480,height=854,unit=px,dpi=200"

    /** Lanix X230 */
    val X230 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Lanix X240 */
    val X240 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Lanix X5 */
    val X5 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Lanix X530 */
    val X530 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lanix X540 */
    val X540 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lanix X550 */
    val X550 = "spec:width=480,height=854,unit=px,dpi=200"

    /** Lanix X560 */
    val X560 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Lanix X7 */
    val X7 = "spec:width=480,height=1014,unit=px,dpi=200"

    /** Lanix X750 */
    val X750 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Lanix X770 */
    val X770 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Lanix X860 */
    val X860 = "spec:width=720,height=1560,unit=px,dpi=320"

}
