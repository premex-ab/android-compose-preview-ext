package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Polaroid device specifications for Android Compose previews.
 *
 * This extension provides Polaroid device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Polaroid.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Polaroid get() = object {
    /** Polaroid BDL0232PR */
    val BDL0232PR = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Polaroid BDL1064PR001 */
    val BDL1064PR001 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Polaroid BDL424 */
    val BDL424 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Polaroid BDLE716 */
    val BDLE716 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Polaroid BDLE716PR */
    val BDLE716PR = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Polaroid BDLT107 */
    val BDLT107 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Polaroid Connect4G */
    val CONNECT4G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Polaroid Cosmo L */
    val COSMO_L = "spec:width=480,height=854,unit=px,dpi=213"

    /** Polaroid Cosmo P5s */
    val COSMO_P5S = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Polaroid Cosmo Z */
    val COSMO_Z = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Polaroid Cosmo Z2 */
    val COSMO_Z2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Polaroid Cosmo Z2 Plus */
    val COSMO_Z2_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Polaroid L9 */
    val L9 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Polaroid MID1064FHDP */
    val MID1064FHDP = "spec:width=1200,height=1920,unit=px,dpi=213"

    /** Polaroid MID1464PR001 */
    val MID1464PR001 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Polaroid MID4004JBL */
    val MID4004JBL = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Polaroid MID4G64PR002 */
    val MID4G64PR002 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Polaroid MID8254PR */
    val MID8254PR = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Polaroid MIDS2410PR001 */
    val MIDS2410PR001 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Polaroid Mobility3G */
    val MOBILITY3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Polaroid P4526A */
    val P4526A = "spec:width=480,height=854,unit=px,dpi=240"

    /** Polaroid P5006A */
    val P5006A = "spec:width=480,height=854,unit=px,dpi=240"

    /** Polaroid P5526A */
    val P5526A = "spec:width=480,height=854,unit=px,dpi=240"

    /** Polaroid PMID7102DC */
    val PMID7102DC = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Polaroid POMDTB005 */
    val POMDTB005 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Polaroid POMDTB006 */
    val POMDTB006 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Polaroid POMDTB007 */
    val POMDTB007 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Polaroid PRO5584PGE01 */
    val PRO5584PGE01 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Polaroid PSPCK20NA */
    val PSPCK20NA = "spec:width=480,height=854,unit=px,dpi=213"

    /** Polaroid PSPCK21NA */
    val PSPCK21NA = "spec:width=480,height=960,unit=px,dpi=240"

    /** Polaroid PSPCL20A0 */
    val PSPCL20A0 = "spec:width=480,height=854,unit=px,dpi=213"

    /** Polaroid PSPCL30A0 */
    val PSPCL30A0 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Polaroid PSPTD21NA */
    val PSPTD21NA = "spec:width=480,height=960,unit=px,dpi=240"

}
