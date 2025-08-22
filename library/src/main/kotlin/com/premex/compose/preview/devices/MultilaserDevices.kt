package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Multilaser device specifications for Android Compose previews.
 *
 * This extension provides Multilaser device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Multilaser.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Multilaser get() = object {
    /** Multilaser DI01_M7_WIFI */
    val DI01_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Multilaser F Max 2 */
    val F_MAX_2 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Multilaser G 3 */
    val G_3 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Multilaser G Max 2 SE */
    val G_MAX_2_SE = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Multilaser G Pro 3S */
    val G_PRO_3S = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Multilaser KIDPAD LITE */
    val KIDPAD_LITE = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Multilaser M10 3G */
    val M10_3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Multilaser  M10_3G  */
    val M10_3G_800X1280 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Multilaser M10 4G */
    val M10_4G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Multilaser M10 4G */
    val M10_4G_800X1280 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Multilaser M10_4G _AC */
    val M10_4G_AC = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Multilaser M10 4G MON CLA */
    val M10_4G_MON_CLA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Multilaser M10 4G PRO */
    val M10_4G_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Multilaser M10 4G T1 */
    val M10_4G_T1 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Multilaser M10 4G T3 */
    val M10_4G_T3 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Multilaser M10A */
    val M10A = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Multilaser M10A_3G */
    val M10A_3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Multilaser M10A_Lite */
    val M10A_LITE = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Multilaser M10A-Lite */
    val M10A_LITE_800X1280 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Multilaser M10 WIFI */
    val M10_WIFI = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Multilaser M10 WIFI */
    val M10_WIFI_800X1280 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Multilaser M7 3G */
    val M7_3G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Multilaser M7 3G A10 */
    val M7_3G_A10 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Multilaser M7 3G Plus */
    val M7_3G_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Multilaser M7-4G */
    val M7_4G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Multilaser M7I-3G */
    val M7I_3G = "spec:width=480,height=800,unit=px,dpi=120"

    /** Multilaser M7S LITE */
    val M7S_LITE = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Multilaser M7sLite */
    val M7SLITE = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Multilaser M7S PLUS */
    val M7S_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Multilaser M7SQC Plus */
    val M7SQC_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Multilaser M7 WIF */
    val M7_WIF = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Multilaser M7 WIFI */
    val M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Multilaser M8_4G */
    val M8_4G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Multilaser M8 4G */
    val M8_4G_800X1280 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Multilaser M8 4G */
    val M8_4G_800X1280_1 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Multilaser M8 Wifi */
    val M8_WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Multilaser M9 3G */
    val M9_3G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Multilaser M9-3G-2 */
    val M9_3G_2 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Multilaser  M9S-Go */
    val M9S_GO = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Multilaser M9 Wifi */
    val M9_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Multilaser ML_GW0C_M10_4G */
    val ML_GW0C_M10_4G = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Multilaser ML-JI-M7_3G_PLUS */
    val ML_JI_M7_3G_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Multilaser ML-SO-M7_3G_PLUS */
    val ML_SO_M7_3G_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Multilaser MLX8 */
    val MLX8 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Multilaser MLX8 */
    val MLX8_800X1280 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Multilaser MLX8 4G */
    val MLX8_4G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Multilaser MS40G */
    val MS40G = "spec:width=480,height=800,unit=px,dpi=240"

    /** Multilaser MS40S */
    val MS40S = "spec:width=480,height=800,unit=px,dpi=213"

    /** Multilaser MS45 4G */
    val MS45_4G = "spec:width=480,height=854,unit=px,dpi=240"

    /** Multilaser MS45S */
    val MS45S = "spec:width=480,height=854,unit=px,dpi=240"

    /** Multilaser MS50G */
    val MS50G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Multilaser MS50L */
    val MS50L = "spec:width=480,height=854,unit=px,dpi=240"

    /** Multilaser MS50L 4G */
    val MS50L_4G = "spec:width=480,height=854,unit=px,dpi=240"

    /** Multilaser MS50S */
    val MS50S = "spec:width=480,height=854,unit=px,dpi=240"

    /** Multilaser MS50X */
    val MS50X = "spec:width=480,height=960,unit=px,dpi=240"

    /** Multilaser MS55M */
    val MS55M = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Multilaser MS60 */
    val MS60 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Multilaser MS60F */
    val MS60F = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Multilaser MS60F Plus */
    val MS60F_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Multilaser MS60X */
    val MS60X = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Multilaser MS60Z */
    val MS60Z = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Multilaser MS80 */
    val MS80 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Multilaser MS80X */
    val MS80X = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** Multilaser Multilaser E */
    val MULTILASER_E = "spec:width=480,height=854,unit=px,dpi=240"

    /** Multilaser Multilaser E 2 */
    val MULTILASER_E_2 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Multilaser Multilaser E Lite */
    val MULTILASER_E_LITE = "spec:width=480,height=800,unit=px,dpi=240"

    /** Multilaser Multilaser Elite 2 */
    val MULTILASER_ELITE_2 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Multilaser Multilaser E Pro */
    val MULTILASER_E_PRO = "spec:width=480,height=854,unit=px,dpi=200"

    /** Multilaser Multilaser F */
    val MULTILASER_F = "spec:width=480,height=960,unit=px,dpi=240"

    /** Multilaser Multilaser F2 */
    val MULTILASER_F2 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Multilaser Multilaser F Pro */
    val MULTILASER_F_PRO = "spec:width=480,height=960,unit=px,dpi=240"

    /** Multilaser Multilaser F Pro 2 */
    val MULTILASER_F_PRO_2 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Multilaser Multilaser G */
    val MULTILASER_G = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Multilaser Multilaser G 2 */
    val MULTILASER_G_2 = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Multilaser Multilaser G Max */
    val MULTILASER_G_MAX = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Multilaser Multilaser G Max 2 */
    val MULTILASER_G_MAX_2 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Multilaser Multilaser G Pro */
    val MULTILASER_G_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Multilaser Multilaser G Pro 2 */
    val MULTILASER_G_PRO_2 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Multilaser Multilaser H */
    val MULTILASER_H = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Multilaser Multilaser H 5G */
    val MULTILASER_H_5G = "spec:width=1080,height=2400,unit=px,dpi=445"

    /** Multilaser Oba Conecta 4G */
    val OBA_CONECTA_4G = "spec:width=480,height=960,unit=px,dpi=200"

    /** Multilaser OBASMART */
    val OBASMART = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Multilaser OBASMART 3 */
    val OBASMART_3 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Multilaser U10 */
    val U10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Multilaser ULTRA 10 */
    val ULTRA_10 = "spec:width=800,height=1280,unit=px,dpi=160"

}
