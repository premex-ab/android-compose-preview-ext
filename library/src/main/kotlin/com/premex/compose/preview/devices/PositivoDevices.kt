package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Positivo device specifications for Android Compose previews.
 *
 * This extension provides Positivo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Positivo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Positivo get() = object {
    /** Positivo BGH 7Di-A */
    val BGH_7DI_A = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Positivo M10 4G PRO X */
    val M10_4G_PRO_X = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Positivo mini I */
    val MINI_I = "spec:width=768,height=1024,unit=px,dpi=160"

    /** Positivo Positivo Q20 */
    val POSITIVO_Q20 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Positivo S620 */
    val S620 = "spec:width=480,height=1014,unit=px,dpi=280"

    /** Positivo Selfie */
    val SELFIE = "spec:width=480,height=854,unit=px,dpi=240"

    /** Positivo Slim */
    val SLIM = "spec:width=480,height=854,unit=px,dpi=240"

    /** Positivo SP2 */
    val SP2 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Positivo T1060 */
    val T1060 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Positivo T1075 */
    val T1075 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Positivo T1085 */
    val T1085 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Positivo T2040 */
    val T2040 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Positivo T2050C */
    val T2050C = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Positivo T3010D */
    val T3010D = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Positivo T701 TV */
    val T701_TV = "spec:width=480,height=800,unit=px,dpi=120"

    /** Positivo T800 */
    val T800 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Positivo T810 */
    val T810 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Positivo T810C */
    val T810C = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Positivo Tab Q10 */
    val TAB_Q10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Positivo TL10 */
    val TL10 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Positivo Twist */
    val TWIST = "spec:width=480,height=854,unit=px,dpi=240"

    /** Positivo Twist 2 */
    val TWIST_2 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Positivo Twist 2018 */
    val TWIST_2018 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Positivo Twist 2 Fit */
    val TWIST_2_FIT = "spec:width=480,height=854,unit=px,dpi=240"

    /** Positivo Twist 2 Go */
    val TWIST_2_GO = "spec:width=480,height=960,unit=px,dpi=240"

    /** Positivo Twist 2 Pro */
    val TWIST_2_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Positivo Twist 4 */
    val TWIST_4 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Positivo Twist 4 Fit */
    val TWIST_4_FIT = "spec:width=480,height=854,unit=px,dpi=200"

    /** Positivo Twist 4G  */
    val TWIST_4G = "spec:width=480,height=854,unit=px,dpi=200"

    /** Positivo Twist 4G */
    val TWIST_4G_480X854 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Positivo Twist 4 Mini */
    val TWIST_4_MINI = "spec:width=480,height=800,unit=px,dpi=240"

    /** Positivo Twist 4 Pro */
    val TWIST_4_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Positivo Twist 5 Max */
    val TWIST_5_MAX = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Positivo Twist 5 Pro */
    val TWIST_5_PRO = "spec:width=480,height=1014,unit=px,dpi=200"

    /** Positivo Twist Metal */
    val TWIST_METAL = "spec:width=480,height=854,unit=px,dpi=240"

    /** Positivo Twist Metal 32G */
    val TWIST_METAL_32G = "spec:width=480,height=854,unit=px,dpi=213"

    /** Positivo Twist Mini */
    val TWIST_MINI = "spec:width=480,height=800,unit=px,dpi=240"

    /** Positivo Twist Tab */
    val TWIST_TAB = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Positivo Twist Tab Kids */
    val TWIST_TAB_KIDS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Positivo Twist XL */
    val TWIST_XL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Positivo Union US2070 */
    val UNION_US2070 = "spec:width=768,height=1366,unit=px,dpi=160"

    /** Positivo Vision Tab 7 */
    val VISION_TAB_7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Positivo Ypy AB10H */
    val YPY_AB10H = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Positivo YPY AB7 */
    val YPY_AB7 = "spec:width=600,height=976,unit=px,dpi=160"

    /** Positivo Ypy L1050 */
    val YPY_L1050 = "spec:width=752,height=1280,unit=px,dpi=160"

    /** Positivo Ypy Mini */
    val YPY_MINI = "spec:width=768,height=1024,unit=px,dpi=160"

}
