package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Thomson device specifications for Android Compose previews.
 *
 * This extension provides Thomson device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Thomson.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Thomson get() = object {
    /** Thomson Delight TH201 */
    val DELIGHT_TH201 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Thomson EBL-5304G */
    val EBL_5304G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Thomson Friendly TH101 */
    val FRIENDLY_TH101 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Thomson Origin_1010_EEA */
    val ORIGIN_1010_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Thomson Origin_679 */
    val ORIGIN_679 = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Thomson TEO10 */
    val TEO10 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Thomson TEO104G */
    val TEO104G = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Thomson TEO10A */
    val TEO10A = "spec:width=1200,height=1920,unit=px,dpi=213"

    /** Thomson TEO10A */
    val TEO10A_800X1280 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Thomson TEO10-KID2BL32 */
    val TEO10_KID2BL32 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Thomson TEO13P */
    val TEO13P = "spec:width=1080,height=1920,unit=px,dpi=213"

    /** Thomson TEO84G */
    val TEO84G = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Thomson TEO8M2BK32LTE */
    val TEO8M2BK32LTE = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Thomson TEOX102 */
    val TEOX102 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Thomson TEOX103 */
    val TEOX103 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Thomson TEOX10-MT8SL128LTE */
    val TEOX10_MT8SL128LTE = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Thomson THOMSON SEREA500 */
    val THOMSON_SEREA500 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Thomson THOMSON_TEO10S */
    val THOMSON_TEO10S = "spec:width=800,height=1280,unit=px,dpi=160"

}
