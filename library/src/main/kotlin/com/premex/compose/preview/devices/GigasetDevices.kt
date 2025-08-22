package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Gigaset device specifications for Android Compose previews.
 *
 * This extension provides Gigaset device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Gigaset.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Gigaset get() = object {
    /** Gigaset Gigaset GS170 */
    val GIGASET_GS170 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gigaset Gigaset GS185 */
    val GIGASET_GS185 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Gigaset Gigaset GS270 */
    val GIGASET_GS270 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Gigaset Gigaset GS270 plus */
    val GIGASET_GS270_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Gigaset Gigaset GS3 */
    val GIGASET_GS3 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Gigaset Gigaset GS370 */
    val GIGASET_GS370 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Gigaset Gigaset GS370_Plus */
    val GIGASET_GS370_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Gigaset Gigaset GS4 */
    val GIGASET_GS4 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Gigaset Gigaset GX4 */
    val GIGASET_GX4 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Gigaset Gigaset GX4 PRO */
    val GIGASET_GX4_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Gigaset Gigaset GX6 */
    val GIGASET_GX6 = "spec:width=1080,height=2412,unit=px,dpi=480"

    /** Gigaset Gigaset GX6 PRO */
    val GIGASET_GX6_PRO = "spec:width=1080,height=2412,unit=px,dpi=480"

    /** Gigaset Gigaset Maxwell 10 */
    val GIGASET_MAXWELL_10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Gigaset GS100 */
    val GS100 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Gigaset GS110 */
    val GS110 = "spec:width=600,height=1280,unit=px,dpi=280"

    /** Gigaset GS160 */
    val GS160 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gigaset GS180 */
    val GS180 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gigaset GS190 */
    val GS190 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Gigaset GS195 */
    val GS195 = "spec:width=1080,height=2246,unit=px,dpi=400"

    /** Gigaset GS280 */
    val GS280 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Gigaset GS290 */
    val GS290 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Gigaset GS5 */
    val GS5 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Gigaset GS5 LITE */
    val GS5_LITE = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Gigaset GS5 Senior */
    val GS5_SENIOR = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Gigaset GS80 */
    val GS80 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Gigaset GX290 */
    val GX290 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Gigaset ME */
    val ME = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Gigaset ME Pro */
    val ME_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Gigaset QV1030 */
    val QV1030 = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Gigaset QV830 */
    val QV830 = "spec:width=768,height=1024,unit=px,dpi=160"

    /** Gigaset SL930 */
    val SL930 = "spec:width=320,height=480,unit=px,dpi=160"

}
