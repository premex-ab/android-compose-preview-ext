package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Spc device specifications for Android Compose previews.
 *
 * This extension provides Spc device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Spc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Spc get() = object {
    /** Spc DISCOVERY_2_EEA */
    val DISCOVERY_2_EEA = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Spc DISCOVERY_2_ME_EEA */
    val DISCOVERY_2_ME_EEA = "spec:width=720,height=1600,unit=px,dpi=480"

    /** Spc DISCOVERY_3 */
    val DISCOVERY_3 = "spec:width=720,height=1600,unit=px,dpi=480"

    /** Spc DISCOVERY_3_PRO_EEA */
    val DISCOVERY_3_PRO_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Spc Discovery Pro */
    val DISCOVERY_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Spc Discovery SE */
    val DISCOVERY_SE = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Spc GRAVITY-2 */
    val GRAVITY_2 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Spc GRAVITY_3 */
    val GRAVITY_3 = "spec:width=800,height=1332,unit=px,dpi=160"

    /** Spc GRAVITY_3_MINI */
    val GRAVITY_3_MINI = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Spc GRAVITY_3_PRO */
    val GRAVITY_3_PRO = "spec:width=800,height=1332,unit=px,dpi=160"

    /** Spc GRAVITY_3_SE */
    val GRAVITY_3_SE = "spec:width=800,height=1332,unit=px,dpi=160"

    /** Spc GRAVITY_4 */
    val GRAVITY_4 = "spec:width=800,height=1332,unit=px,dpi=160"

    /** Spc GRAVITY_4_PLUS */
    val GRAVITY_4_PLUS = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Spc GRAVITY_5_EEA */
    val GRAVITY_5_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Spc GRAVITY_5_PRO */
    val GRAVITY_5_PRO = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Spc GRAVITY_5_SE_EEA */
    val GRAVITY_5_SE_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Spc GRAVITY_6_10_EEA */
    val GRAVITY_6_10_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Spc GRAVITY_6_11_EEA */
    val GRAVITY_6_11_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Spc Gravity_Max_EEA */
    val GRAVITY_MAX_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Spc GRAVITY-PRO-2 */
    val GRAVITY_PRO_2 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Spc GRAVITY-SE */
    val GRAVITY_SE = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Spc GRAVITY-ULTIMATE-2 */
    val GRAVITY_ULTIMATE_2 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Spc LIGHTYEAR-2 */
    val LIGHTYEAR_2 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Spc SMART  2 */
    val SMART_2 = "spec:width=442,height=960,unit=px,dpi=240"

    /** Spc SMART 3 */
    val SMART_3 = "spec:width=442,height=960,unit=px,dpi=220"

    /** Spc SMART_MAX_2 */
    val SMART_MAX_2 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Spc SMART_PRO */
    val SMART_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Spc SMART_ULTIMATE */
    val SMART_ULTIMATE = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Spc WUUM S */
    val WUUM_S = "spec:width=720,height=1600,unit=px,dpi=320"

}
