package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Starlight device specifications for Android Compose previews.
 *
 * This extension provides Starlight device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Starlight.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Starlight get() = object {
    /** Starlight Alpha_300 */
    val ALPHA_300 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Starlight Alpha_400 */
    val ALPHA_400 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Starlight C_Note */
    val C_NOTE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Starlight C_Note_Pro */
    val C_NOTE_PRO = "spec:width=480,height=996,unit=px,dpi=240"

    /** Starlight Gionee_Star */
    val GIONEE_STAR = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Starlight I star */
    val I_STAR = "spec:width=640,height=1280,unit=px,dpi=320"

    /** Starlight I_Star_Plus */
    val I_STAR_PLUS = "spec:width=640,height=1280,unit=px,dpi=240"

    /** Starlight I star two */
    val I_STAR_TWO = "spec:width=480,height=960,unit=px,dpi=240"

    /** Starlight Milan_Pro */
    val MILAN_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Starlight My_star_18 */
    val MY_STAR_18 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Starlight My_Star_X */
    val MY_STAR_X = "spec:width=480,height=960,unit=px,dpi=240"

    /** Starlight RIO STAR */
    val RIO_STAR = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Starlight Safari */
    val SAFARI = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Starlight Starlight */
    val STARLIGHT = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Starlight STAR_MIX */
    val STAR_MIX = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Starlight Star_Mix_2 */
    val STAR_MIX_2 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Starlight Star_Plus */
    val STAR_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

    /** Starlight star_plus_plus */
    val STAR_PLUS_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Starlight star_two */
    val STAR_TWO = "spec:width=480,height=854,unit=px,dpi=240"

    /** Starlight UMI_G */
    val UMI_G = "spec:width=720,height=1280,unit=px,dpi=272"

    /** Starlight Vegas */
    val VEGAS = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Starlight venus */
    val VENUS = "spec:width=480,height=960,unit=px,dpi=240"

    /** Starlight VENUS_PLUS */
    val VENUS_PLUS = "spec:width=442,height=960,unit=px,dpi=240"

}
