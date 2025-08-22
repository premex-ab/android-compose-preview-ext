package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Azumi device specifications for Android Compose previews.
 *
 * This extension provides Azumi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Azumi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Azumi get() = object {
    /** Azumi A4 */
    val A4 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Azumi A4_B */
    val A4_B = "spec:width=480,height=800,unit=px,dpi=240"

    /** Azumi A4 Go */
    val A4_GO = "spec:width=480,height=800,unit=px,dpi=240"

    /** Azumi  A4PLUS_AC11 */
    val A4PLUS_AC11 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Azumi A5+ */
    val A5 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Azumi A50LT */
    val A50LT = "spec:width=480,height=854,unit=px,dpi=240"

    /** Azumi A57B */
    val A57B = "spec:width=480,height=960,unit=px,dpi=240"

    /** Azumi A5_AC11 */
    val A5_AC11 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Azumi A5B */
    val A5B = "spec:width=480,height=854,unit=px,dpi=240"

    /** Azumi A5_P1 */
    val A5_P1 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Azumi Azumi K55QL */
    val AZUMI_K55QL = "spec:width=480,height=960,unit=px,dpi=240"

    /** Azumi Azumi_KIREI_A45_D */
    val AZUMI_KIREI_A45_D = "spec:width=480,height=854,unit=px,dpi=240"

    /** Azumi Azumi_M5_P */
    val AZUMI_M5_P = "spec:width=540,height=960,unit=px,dpi=260"

    /** Azumi Azumi V4 */
    val AZUMI_V4 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Azumi Azumi_V54_AC04 */
    val AZUMI_V54_AC04 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Azumi AZUMI_V5_AC01 */
    val AZUMI_V5_AC01 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Azumi Azumi_V5PLUS_AC24 */
    val AZUMI_V5PLUS_AC24 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Azumi IRO A4Q */
    val IRO_A4Q = "spec:width=480,height=800,unit=px,dpi=240"

    /** Azumi IRO A55 Q */
    val IRO_A55_Q = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Azumi IRO A5Q */
    val IRO_A5Q = "spec:width=480,height=854,unit=px,dpi=240"

    /** Azumi IRO A5 QL */
    val IRO_A5_QL = "spec:width=480,height=854,unit=px,dpi=240"

    /** Azumi K5QL */
    val K5QL = "spec:width=480,height=854,unit=px,dpi=240"

    /** Azumi M5PLUS */
    val M5PLUS = "spec:width=480,height=854,unit=px,dpi=240"

    /** Azumi M5s */
    val M5S = "spec:width=480,height=854,unit=px,dpi=240"

    /** Azumi Nobu A55 */
    val NOBU_A55 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Azumi NOBU_A55_PRO */
    val NOBU_A55_PRO = "spec:width=442,height=960,unit=px,dpi=213"

    /** Azumi Speed 5 */
    val SPEED_5 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Azumi V4_AC23 */
    val V4_AC23 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Azumi V5 */
    val V5 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Azumi V5+ */
    val V5_480X960 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Azumi V51 */
    val V51 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Azumi V55_AC04 */
    val V55_AC04 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Azumi V5_AC25 */
    val V5_AC25 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Azumi V5PLUS_AC25 */
    val V5PLUS_AC25 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Azumi V60 */
    val V60 = "spec:width=720,height=1560,unit=px,dpi=320"

}
