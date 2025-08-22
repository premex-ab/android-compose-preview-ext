package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * True device specifications for Android Compose previews.
 *
 * This extension provides True device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.True.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.True get() = object {
    /** True Alpha_5G */
    val ALPHA_5G = "spec:width=720,height=1600,unit=px,dpi=300"

    /** True S1 */
    val S1 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** True S1A */
    val S1A = "spec:width=720,height=1600,unit=px,dpi=320"

    /** True SMART 4G Adventure */
    val SMART_4G_ADVENTURE = "spec:width=480,height=800,unit=px,dpi=240"

    /** True SMART 4G Adventure Pro */
    val SMART_4G_ADVENTURE_PRO = "spec:width=480,height=960,unit=px,dpi=240"

    /** True SMART 4G Champion */
    val SMART_4G_CHAMPION = "spec:width=480,height=800,unit=px,dpi=240"

    /** True SMART 4G GEN C 5.0 */
    val SMART_4G_GEN_C_5_0 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** True SMART_4G_GEN_C_5.5 */
    val SMART_4G_GEN_C_5_5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** True SMART 4G M1 Plus */
    val SMART_4G_M1_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** True SMART 4G P1 */
    val SMART_4G_P1 = "spec:width=480,height=960,unit=px,dpi=240"

    /** True SMART 4G P1 Prime */
    val SMART_4G_P1_PRIME = "spec:width=720,height=1440,unit=px,dpi=320"

    /** True SMART_Champ_4inch */
    val SMART_CHAMP_4INCH = "spec:width=480,height=800,unit=px,dpi=240"

    /** True SMART TAB 4G e-Biz */
    val SMART_TAB_4G_E_BIZ = "spec:width=800,height=1280,unit=px,dpi=240"

    /** True SMART TAB 4G e-Biz PRO */
    val SMART_TAB_4G_E_BIZ_PRO = "spec:width=800,height=1280,unit=px,dpi=240"

    /** True SMART TAB 4G M1 */
    val SMART_TAB_4G_M1 = "spec:width=800,height=1280,unit=px,dpi=213"

}
