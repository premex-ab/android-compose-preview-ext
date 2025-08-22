package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zuum device specifications for Android Compose previews.
 *
 * This extension provides Zuum device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zuum.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zuum get() = object {
    /** Zuum AKUS P1 */
    val AKUS_P1 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Zuum AKUS PRO */
    val AKUS_PRO = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Zuum AKUS_TAB */
    val AKUS_TAB = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Zuum AKUS Z */
    val AKUS_Z = "spec:width=480,height=960,unit=px,dpi=240"

    /** Zuum AKUS Z1 */
    val AKUS_Z1 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Zuum Aura M1 */
    val AURA_M1 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Zuum AURA M2 */
    val AURA_M2 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Zuum AURA PLUS JLO */
    val AURA_PLUS_JLO = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Zuum AURA PRO */
    val AURA_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Zuum AURA PRO JLO */
    val AURA_PRO_JLO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Zuum AURA X */
    val AURA_X = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Zuum AURA Z */
    val AURA_Z = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Zuum AURA Z1 */
    val AURA_Z1 = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Zuum COVET */
    val COVET = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Zuum COVET PRO */
    val COVET_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Zuum COVET PRO LITE */
    val COVET_PRO_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Zuum COVET X */
    val COVET_X = "spec:width=480,height=960,unit=px,dpi=200"

    /** Zuum COVET Z */
    val COVET_Z = "spec:width=480,height=960,unit=px,dpi=240"

    /** Zuum GRAVITY M */
    val GRAVITY_M = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Zuum GRAVITY Z */
    val GRAVITY_Z = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Zuum Hidra Plus */
    val HIDRA_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Zuum MAGNO C */
    val MAGNO_C = "spec:width=480,height=854,unit=px,dpi=240"

    /** Zuum MAGNO C1 */
    val MAGNO_C1 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Zuum MAGNO C2 */
    val MAGNO_C2 = "spec:width=480,height=854,unit=px,dpi=220"

    /** Zuum MAGNO C PLUS */
    val MAGNO_C_PLUS = "spec:width=480,height=960,unit=px,dpi=200"

    /** Zuum MAGNO MINI  */
    val MAGNO_MINI = "spec:width=360,height=640,unit=px,dpi=240"

    /** Zuum MAGNO_P1 */
    val MAGNO_P1 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Zuum MAGNO_P4 */
    val MAGNO_P4 = "spec:width=576,height=1152,unit=px,dpi=220"

    /** Zuum Magno Pro */
    val MAGNO_PRO = "spec:width=720,height=1560,unit=px,dpi=300"

    /** Zuum MAGNO S */
    val MAGNO_S = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Zuum NOVUS_TAB */
    val NOVUS_TAB = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Zuum ONIX */
    val ONIX = "spec:width=480,height=854,unit=px,dpi=240"

    /** Zuum ONIX S */
    val ONIX_S = "spec:width=480,height=960,unit=px,dpi=240"

    /** Zuum ROCKET II */
    val ROCKET_II = "spec:width=480,height=800,unit=px,dpi=240"

    /** Zuum ROCKET III */
    val ROCKET_III = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Zuum SENS_CURVE */
    val SENS_CURVE = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Zuum SENS_G */
    val SENS_G = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Zuum STELLAR M1 */
    val STELLAR_M1 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Zuum STELLAR M2 */
    val STELLAR_M2 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Zuum STELLAR M3 */
    val STELLAR_M3 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Zuum STELLAR M4 */
    val STELLAR_M4 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Zuum STELLAR_M5 */
    val STELLAR_M5 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Zuum STELLAR_M6 */
    val STELLAR_M6 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Zuum Stellar Max */
    val STELLAR_MAX = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Zuum STELLAR MINI */
    val STELLAR_MINI = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Zuum STELLAR P3 */
    val STELLAR_P3 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Zuum STELLAR P4 */
    val STELLAR_P4 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Zuum STELLAR P5 */
    val STELLAR_P5 = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Zuum STELLAR P6 */
    val STELLAR_P6 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Zuum STELLAR_P8 */
    val STELLAR_P8 = "spec:width=720,height=1612,unit=px,dpi=480"

    /** Zuum STELLAR PLUS */
    val STELLAR_PLUS = "spec:width=720,height=1500,unit=px,dpi=320"

    /** Zuum STELLAR Z */
    val STELLAR_Z = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Zuum VOLTA_KIDS */
    val VOLTA_KIDS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Zuum ZUUM AKUS */
    val ZUUM_AKUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Zuum ZUUM GRANT */
    val ZUUM_GRANT = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Zuum ZUUM Gravity */
    val ZUUM_GRAVITY = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Zuum ZUUM MAGNO PLUS */
    val ZUUM_MAGNO_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

    /** Zuum ZUUM PAD Kids */
    val ZUUM_PAD_KIDS = "spec:width=600,height=1024,unit=px,dpi=200"

    /** Zuum ZUUM PAD Lightyear  */
    val ZUUM_PAD_LIGHTYEAR = "spec:width=600,height=1024,unit=px,dpi=200"

}
