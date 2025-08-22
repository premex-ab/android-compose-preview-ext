package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Xtigi device specifications for Android Compose previews.
 *
 * This extension provides Xtigi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Xtigi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Xtigi get() = object {
    /** Xtigi 9C */
    val _9C = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Xtigi A10c */
    val A10C = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Xtigi A10S */
    val A10S = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Xtigi A20C */
    val A20C = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Xtigi A20S */
    val A20S = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Xtigi A20S_PRO */
    val A20S_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Xtigi A3 */
    val A3 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Xtigi A55 */
    val A55 = "spec:width=480,height=1120,unit=px,dpi=240"

    /** Xtigi Hope10_Mate */
    val HOPE10_MATE = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Xtigi Hope10_Plus */
    val HOPE10_PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Xtigi Hope10_Pro */
    val HOPE10_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Xtigi Hope10Pro */
    val HOPE10PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Xtigi Hope7_LTE */
    val HOPE7_LTE = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Xtigi Hope7_Mate */
    val HOPE7_MATE = "spec:width=600,height=1024,unit=px,dpi=240"

    /** Xtigi Hope7_Max */
    val HOPE7_MAX = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Xtigi Hope7_Pro */
    val HOPE7_PRO = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Xtigi Hope8_LTE */
    val HOPE8_LTE = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Xtigi Hope8_Mate */
    val HOPE8_MATE = "spec:width=800,height=1280,unit=px,dpi=204"

    /** Xtigi JOY10_LTE */
    val JOY10_LTE = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Xtigi JOY10_Mate */
    val JOY10_MATE = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Xtigi JOY7_Mate */
    val JOY7_MATE = "spec:width=600,height=1024,unit=px,dpi=240"

    /** Xtigi JOY7_TV */
    val JOY7_TV = "spec:width=600,height=1024,unit=px,dpi=240"

    /** Xtigi JOY8_Mate */
    val JOY8_MATE = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Xtigi Kids7_Pro */
    val KIDS7_PRO = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Xtigi Kids8 Pro */
    val KIDS8_PRO = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Xtigi Kids9 Pro */
    val KIDS9_PRO = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Xtigi KIDS_TAB */
    val KIDS_TAB = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Xtigi M20S */
    val M20S = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Xtigi SHARP1 */
    val SHARP1 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Xtigi SHARP_2 */
    val SHARP_2 = "spec:width=1080,height=2244,unit=px,dpi=400"

    /** Xtigi V12 */
    val V12 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Xtigi V18 pro_A */
    val V18_PRO_A = "spec:width=480,height=854,unit=px,dpi=240"

    /** Xtigi V28 */
    val V28 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Xtigi V28 LTE */
    val V28_LTE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Xtigi V51 */
    val V51 = "spec:width=540,height=1200,unit=px,dpi=260"

    /** Xtigi V8 */
    val V8 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Xtigi X-TIGI_JOY7_MAX */
    val X_TIGI_JOY7_MAX = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Xtigi X-TIGI P16 */
    val X_TIGI_P16 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Xtigi X_TIGI_Photo P20 */
    val X_TIGI_PHOTO_P20 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Xtigi X-TIGI_V15 */
    val X_TIGI_V15 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Xtigi X_TIGI_V16 */
    val X_TIGI_V16 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Xtigi X_TIGI_V16_LTE */
    val X_TIGI_V16_LTE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Xtigi X-TIGI_V18 Pro */
    val X_TIGI_V18_PRO = "spec:width=480,height=854,unit=px,dpi=240"

    /** Xtigi X-TIGI V19 */
    val X_TIGI_V19 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Xtigi X-TIGI_V5 */
    val X_TIGI_V5 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Xtigi X-TIGI_V9 */
    val X_TIGI_V9 = "spec:width=480,height=800,unit=px,dpi=240"

}
