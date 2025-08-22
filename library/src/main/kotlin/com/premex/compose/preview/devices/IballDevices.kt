package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Iball device specifications for Android Compose previews.
 *
 * This extension provides Iball device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Iball.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Iball get() = object {
    /** Iball Avid */
    val AVID = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Iball Blaze_V4 */
    val BLAZE_V4 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Iball iBall */
    val IBALL = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Iball iBall */
    val IBALL_800X1280 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Iball iBall_Slide */
    val IBALL_SLIDE = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Iball iBall Slide Cleo S9 */
    val IBALL_SLIDE_CLEO_S9 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Iball iBall Slide Gorgeo 4GL */
    val IBALL_SLIDE_GORGEO_4GL = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Iball iBall Slide Imprint 4G */
    val IBALL_SLIDE_IMPRINT_4G = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Iball iBall_Slide_Majestic_01 */
    val IBALL_SLIDE_MAJESTIC_01 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Iball iBall Slide Nimble 4GF */
    val IBALL_SLIDE_NIMBLE_4GF = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Iball iBall_Slide_Skye_03 */
    val IBALL_SLIDE_SKYE_03 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Iball iBall Slide Snap 4G2 */
    val IBALL_SLIDE_SNAP_4G2 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Iball iBall Slide Twinkle i5 */
    val IBALL_SLIDE_TWINKLE_I5 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Iball iBall Slide Wings 4GP */
    val IBALL_SLIDE_WINGS_4GP = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Iball  iT-KSA0003  */
    val IT_KSA0003 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Iball  iT-KSA0012  */
    val IT_KSA0012 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Iball  iT-KSA0066  */
    val IT_KSA0066 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Iball Nova_4G */
    val NOVA_4G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Iball Slide_Dazzle_3500 */
    val SLIDE_DAZZLE_3500 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Iball Slide_Elan_3x32 */
    val SLIDE_ELAN_3X32 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Iball Slide_Elan_4G2_Plus */
    val SLIDE_ELAN_4G2_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Iball Spirit_X2 */
    val SPIRIT_X2 = "spec:width=600,height=1024,unit=px,dpi=160"

}
