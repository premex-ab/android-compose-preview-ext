package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Spcmobile device specifications for Android Compose previews.
 *
 * This extension provides Spcmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Spcmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Spcmobile get() = object {
    /** Spcmobile APOLO */
    val APOLO = "spec:width=480,height=960,unit=px,dpi=240"

    /** Spcmobile GRAVITY2-4G */
    val GRAVITY2_4G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Spcmobile GRAVITY-2-MAX */
    val GRAVITY_2_MAX = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Spcmobile GRAVITY_3_4G  */
    val GRAVITY_3_4G = "spec:width=800,height=1332,unit=px,dpi=180"

    /** Spcmobile GRAVITY_3G_2019_eea */
    val GRAVITY_3G_2019_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Spcmobile L52 PRO */
    val L52_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Spcmobile L52 STEEL+ */
    val L52_STEEL = "spec:width=480,height=854,unit=px,dpi=240"

    /** Spcmobile L52X */
    val L52X = "spec:width=480,height=854,unit=px,dpi=240"

    /** Spcmobile L53 */
    val L53 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Spcmobile L56 */
    val L56 = "spec:width=240,height=282,unit=px,dpi=120"

    /** Spcmobile L60 */
    val L60 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Spcmobile L60 Pro */
    val L60_PRO = "spec:width=480,height=854,unit=px,dpi=240"

    /** Spcmobile L60 Turbo */
    val L60_TURBO = "spec:width=480,height=854,unit=px,dpi=240"

    /** Spcmobile L70_Lite */
    val L70_LITE = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Spcmobile L80 */
    val L80 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Spcmobile  L80_S */
    val L80_S = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Spcmobile Lightyear */
    val LIGHTYEAR = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Spcmobile LIGHTYEAR2-4G */
    val LIGHTYEAR2_4G = "spec:width=800,height=1280,unit=px,dpi=213"

}
