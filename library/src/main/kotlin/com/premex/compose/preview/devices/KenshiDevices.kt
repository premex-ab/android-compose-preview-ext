package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kenshi device specifications for Android Compose previews.
 *
 * This extension provides Kenshi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kenshi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kenshi get() = object {
    /** Kenshi Armor C1 Max */
    val ARMOR_C1_MAX = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Kenshi Armor C1s */
    val ARMOR_C1S = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Kenshi Armor_C1w_RU */
    val ARMOR_C1W_RU = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Kenshi Armor H1s */
    val ARMOR_H1S = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Kenshi Armor_H1w */
    val ARMOR_H1W = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Kenshi Armor H2s */
    val ARMOR_H2S = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Kenshi Armor I1 Slim */
    val ARMOR_I1_SLIM = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Kenshi Armor I1w */
    val ARMOR_I1W = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Kenshi Armor_I2w */
    val ARMOR_I2W = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Kenshi Armor P1 Pro */
    val ARMOR_P1_PRO = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Kenshi Armor_P1s */
    val ARMOR_P1S = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Kenshi Armor P1w */
    val ARMOR_P1W = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Kenshi Armor V1s */
    val ARMOR_V1S = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Kenshi E10 */
    val E10 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Kenshi E11 */
    val E11 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Kenshi E12 */
    val E12 = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Kenshi E17_RU */
    val E17_RU = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Kenshi E18_RU */
    val E18_RU = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Kenshi E28 */
    val E28 = "spec:width=800,height=1280,unit=px,dpi=220"

    /** Kenshi H10 */
    val H10 = "spec:width=800,height=1280,unit=px,dpi=210"

    /** Kenshi H11 */
    val H11 = "spec:width=800,height=1280,unit=px,dpi=210"

    /** Kenshi H14 */
    val H14 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Kenshi H15 */
    val H15 = "spec:width=1200,height=1920,unit=px,dpi=480"

    /** Kenshi H16 */
    val H16 = "spec:width=1200,height=1920,unit=px,dpi=480"

    /** Kenshi H17_RU */
    val H17_RU = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Kenshi H18_RU */
    val H18_RU = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Kenshi H19 */
    val H19 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Kenshi H20 */
    val H20 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Kenshi H21 */
    val H21 = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Kenshi H24 */
    val H24 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Kenshi H34 */
    val H34 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Kenshi H38 */
    val H38 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Kenshi H44 */
    val H44 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Kenshi  Kenshi_K10  */
    val KENSHI_K10 = "spec:width=1200,height=2000,unit=px,dpi=340"

    /** Kenshi Kenshi KP10 */
    val KENSHI_KP10 = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Kenshi Kenshi KP11 */
    val KENSHI_KP11 = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Kenshi O8 */
    val O8 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Kenshi Pad_Lite_E48 */
    val PAD_LITE_E48 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Kenshi Pad_Lite_E58 */
    val PAD_LITE_E58 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Kenshi Pad_Pro_E110 */
    val PAD_PRO_E110 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Kenshi Pad_Pro_E111 */
    val PAD_PRO_E111 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Kenshi Pad_Pro_E112 */
    val PAD_PRO_E112 = "spec:width=1600,height=2560,unit=px,dpi=320"

}
