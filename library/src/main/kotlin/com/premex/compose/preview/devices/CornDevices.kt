package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Corn device specifications for Android Compose previews.
 *
 * This extension provides Corn device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Corn.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Corn get() = object {
    /** Corn C5 */
    val C5 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Corn C55 */
    val C55 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Corn C55_Pro */
    val C55_PRO = "spec:width=480,height=960,unit=px,dpi=213"

    /** Corn C60 */
    val C60 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Corn C60 Ultra */
    val C60_ULTRA = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Corn Coco10_Ultra_4G */
    val COCO10_ULTRA_4G = "spec:width=720,height=1600,unit=px,dpi=480"

    /** Corn CORN Note1 */
    val CORN_NOTE1 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Corn CORN_R10 */
    val CORN_R10 = "spec:width=480,height=854,unit=px,dpi=213"

    /** Corn CORN_X5 */
    val CORN_X5 = "spec:width=480,height=854,unit=px,dpi=200"

    /** Corn CORN_X55 */
    val CORN_X55 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Corn G60 */
    val G60 = "spec:width=480,height=1014,unit=px,dpi=200"

    /** Corn G60_Pro_4G */
    val G60_PRO_4G = "spec:width=480,height=1014,unit=px,dpi=200"

    /** Corn Play25_Pro_4G */
    val PLAY25_PRO_4G = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Corn R10 */
    val R10 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Corn R10E */
    val R10E = "spec:width=540,height=960,unit=px,dpi=240"

    /** Corn R20 */
    val R20 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Corn R40 */
    val R40 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Corn Star10_3G */
    val STAR10_3G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Corn Star10_Pro */
    val STAR10_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Corn Star8 */
    val STAR8 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Corn Star8_3G */
    val STAR8_3G = "spec:width=600,height=1024,unit=px,dpi=220"

    /** Corn Tronik_12 */
    val TRONIK_12 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Corn Tronik_12S */
    val TRONIK_12S = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Corn Tronik 13S */
    val TRONIK_13S = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Corn X5 */
    val X5 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Corn X60 */
    val X60 = "spec:width=480,height=1014,unit=px,dpi=200"

    /** Corn Y60 */
    val Y60 = "spec:width=480,height=1014,unit=px,dpi=200"

}
