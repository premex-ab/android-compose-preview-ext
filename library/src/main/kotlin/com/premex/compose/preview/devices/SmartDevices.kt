package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Smart device specifications for Android Compose previews.
 *
 * This extension provides Smart device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Smart.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Smart get() = object {
    /** Smart Advance Pro */
    val ADVANCE_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Smart Coral 4 */
    val CORAL_4 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Smart e-PAD */
    val E_PAD = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Smart Grand */
    val GRAND = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Smart hero A1 */
    val HERO_A1 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Smart M20 */
    val M20 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Smart M30 */
    val M30 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Smart M50 */
    val M50 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Smart Max */
    val MAX = "spec:width=480,height=800,unit=px,dpi=240"

    /** Smart SK3401 */
    val SK3401 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Smart Slide Lite */
    val SLIDE_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Smart Smart_Hero_II */
    val SMART_HERO_II = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Smart Smart PRIME II */
    val SMART_PRIME_II = "spec:width=480,height=960,unit=px,dpi=240"

}
