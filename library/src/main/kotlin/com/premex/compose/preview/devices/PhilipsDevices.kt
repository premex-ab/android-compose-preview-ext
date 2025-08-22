package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Philips device specifications for Android Compose previews.
 *
 * This extension provides Philips device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Philips.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Philips get() = object {
    /** Philips E1027 */
    val E1027 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Philips Essence 11 */
    val ESSENCE_11 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Philips Essence 21 */
    val ESSENCE_21 = "spec:width=720,height=1600,unit=px,dpi=480"

    /** Philips OmniTab 1 */
    val OMNITAB_1 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Philips Philips S257 */
    val PHILIPS_S257 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Philips Philips S260 */
    val PHILIPS_S260 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Philips Philips S318 */
    val PHILIPS_S318 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Philips Philips S329 */
    val PHILIPS_S329 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Philips Philips S337 */
    val PHILIPS_S337 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Philips Philips S338 */
    val PHILIPS_S338 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Philips Philips S397 */
    val PHILIPS_S397 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Philips Philips S561 */
    val PHILIPS_S561 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Philips Philips S6206 */
    val PHILIPS_S6206 = "spec:width=720,height=1640,unit=px,dpi=260"

    /** Philips PHILIPS S6210 */
    val PHILIPS_S6210 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Philips PHILIPS S6310 */
    val PHILIPS_S6310 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Philips PHILIPS S7710 */
    val PHILIPS_S7710 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Philips Philips V787 */
    val PHILIPS_V787 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Philips Philips X818 */
    val PHILIPS_X818 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Philips PI3100/98 */
    val PI3100_98 = "spec:width=600,height=976,unit=px,dpi=160"

    /** Philips S309 */
    val S309 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Philips S326 */
    val S326 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Philips S327 */
    val S327 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Philips S395 */
    val S395 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Philips S6122 */
    val S6122 = "spec:width=720,height=1600,unit=px,dpi=340"

    /** Philips S6133S */
    val S6133S = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Philips T8015 */
    val T8015 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Philips TLE722G */
    val TLE722G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Philips V387 */
    val V387 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Philips W6610 */
    val W6610 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Philips X586 */
    val X586 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Philips X588 */
    val X588 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Philips X818 */
    val X818 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Philips Xenium S266 */
    val XENIUM_S266 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Philips Xenium S386 */
    val XENIUM_S386 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Philips Xenium S566 */
    val XENIUM_S566 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Philips Xenium V377 */
    val XENIUM_V377 = "spec:width=720,height=1280,unit=px,dpi=320"

}
