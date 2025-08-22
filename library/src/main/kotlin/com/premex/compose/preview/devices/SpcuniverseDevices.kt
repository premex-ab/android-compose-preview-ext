package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Spcuniverse device specifications for Android Compose previews.
 *
 * This extension provides Spcuniverse device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Spcuniverse.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Spcuniverse get() = object {
    /** Spcuniverse Blink_10_1 */
    val BLINK_10_1 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Spcuniverse GRAVITY3G */
    val GRAVITY3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Spcuniverse GRAVITY4G */
    val GRAVITY4G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Spcuniverse GRAVITY_4G_2019_eea */
    val GRAVITY_4G_2019_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Spcuniverse GRAVITY_OCTACORE */
    val GRAVITY_OCTACORE = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Spcuniverse GRAVITY_ PRO */
    val GRAVITY_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Spcuniverse heaven_10_1 */
    val HEAVEN_10_1 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Spcuniverse SPC GEN */
    val SPC_GEN = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Spcuniverse SPC GEN LITE */
    val SPC_GEN_LITE = "spec:width=600,height=1280,unit=px,dpi=280"

    /** Spcuniverse SPC GEN MAX */
    val SPC_GEN_MAX = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Spcuniverse SPC GEN PLUS */
    val SPC_GEN_PLUS = "spec:width=600,height=1280,unit=px,dpi=320"

    /** Spcuniverse SPC SMART */
    val SPC_SMART = "spec:width=480,height=960,unit=px,dpi=240"

    /** Spcuniverse SPC SMART LITE */
    val SPC_SMART_LITE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Spcuniverse SPC SMART MAX */
    val SPC_SMART_MAX = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Spcuniverse SPC SMART PLUS */
    val SPC_SMART_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Spcuniverse ZEUS_4G */
    val ZEUS_4G = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Spcuniverse ZEUS_4G_PRO */
    val ZEUS_4G_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

}
