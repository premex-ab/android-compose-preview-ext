package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Evertek device specifications for Android Compose previews.
 *
 * This extension provides Evertek device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Evertek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Evertek get() = object {
    /** Evertek E7224HG */
    val E7224HG = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Evertek E8224HG */
    val E8224HG = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Evertek Hero */
    val HERO = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Evertek M10 */
    val M10 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Evertek M10_Max */
    val M10_MAX = "spec:width=600,height=1280,unit=px,dpi=280"

    /** Evertek M10 Nano */
    val M10_NANO = "spec:width=480,height=800,unit=px,dpi=240"

    /** Evertek M10_Pro */
    val M10_PRO = "spec:width=480,height=960,unit=px,dpi=240"

    /** Evertek M20 */
    val M20 = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Evertek M20 Mini */
    val M20_MINI = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Evertek M20 NANO */
    val M20_NANO = "spec:width=480,height=800,unit=px,dpi=240"

    /** Evertek M20+Pro */
    val M20_PRO = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Evertek M20_Pro */
    val M20_PRO_720X1560 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Evertek M20_S */
    val M20_S = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Evertek M20S_Mini */
    val M20S_MINI = "spec:width=480,height=854,unit=px,dpi=240"

    /** Evertek P17 */
    val P17 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Evertek P17_Pro */
    val P17_PRO = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Evertek P18_Pro */
    val P18_PRO = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Evertek V4 */
    val V4 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Evertek V4 Nano */
    val V4_NANO = "spec:width=480,height=800,unit=px,dpi=240"

    /** Evertek V5 */
    val V5 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Evertek V5 Nano */
    val V5_NANO = "spec:width=480,height=800,unit=px,dpi=240"

    /** Evertek V8 */
    val V8 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Evertek V9+ */
    val V9 = "spec:width=720,height=1440,unit=px,dpi=320"

}
