package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Rca device specifications for Android Compose previews.
 *
 * This extension provides Rca device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Rca.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Rca get() = object {
    /** Rca 10 Viking */
    val _10_VIKING = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Rca 10 Viking II */
    val _10_VIKING_II = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Rca 10 Viking II Pro */
    val _10_VIKING_II_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Rca 10 Viking Pro */
    val _10_VIKING_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Rca 11 Delta Pro */
    val _11_DELTA_PRO = "spec:width=768,height=1368,unit=px,dpi=160"

    /** Rca 11 Galileo Pro */
    val _11_GALILEO_PRO = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Rca 11 Maven Pro */
    val _11_MAVEN_PRO = "spec:width=768,height=1368,unit=px,dpi=160"

    /** Rca 7 Voyager */
    val _7_VOYAGER = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Rca 7 Voyager II */
    val _7_VOYAGER_II = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Rca 7 Voyager III */
    val _7_VOYAGER_III = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Rca Artemis 10 */
    val ARTEMIS_10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Rca Atlas 10 */
    val ATLAS_10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Rca DRP2091Q */
    val DRP2091Q = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Rca DRP29101QD */
    val DRP29101QD = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Rca Gemini 10 pro */
    val GEMINI_10_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Rca Juno 10 */
    val JUNO_10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Rca Pro10 Edition II */
    val PRO10_EDITION_II = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Rca Pro12 */
    val PRO12 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Rca RAKR30824 */
    val RAKR30824 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Rca RATM20831 */
    val RATM20831 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Rca RATM21036 */
    val RATM21036 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Rca RATM30846 */
    val RATM30846 = "spec:width=800,height=1340,unit=px,dpi=160"

    /** Rca RATM31046 */
    val RATM31046 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Rca RATM3144B */
    val RATM3144B = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Rca RATR30824 */
    val RATR30824 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Rca RATR31024 */
    val RATR31024 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Rca RC10T3G21 */
    val RC10T3G21 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Rca RC10TB */
    val RC10TB = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Rca RC7T3G21 */
    val RC7T3G21 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Rca RC8T3G21 */
    val RC8T3G21 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Rca RCA DRP2091 */
    val RCA_DRP2091 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Rca RCA_G2 */
    val RCA_G2 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Rca RCA RCT6213W22 */
    val RCA_RCT6213W22 = "spec:width=768,height=1368,unit=px,dpi=160"

    /** Rca RCA RCT6213W23 */
    val RCA_RCT6213W23 = "spec:width=768,height=1368,unit=px,dpi=160"

    /** Rca RCA RCT6213W24 */
    val RCA_RCT6213W24 = "spec:width=768,height=1368,unit=px,dpi=160"

    /** Rca RCA RCT6613W23PU */
    val RCA_RCT6613W23PU = "spec:width=768,height=1368,unit=px,dpi=160"

    /** Rca RCA RCT6703W13 */
    val RCA_RCT6703W13 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Rca 	RCA RCT6716Q25 */
    val RCA_RCT6716Q25 = "spec:width=768,height=1368,unit=px,dpi=160"

    /** Rca RCA RCT6A03W12 */
    val RCA_RCT6A03W12 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Rca RCA RCT6A03W13E */
    val RCA_RCT6A03W13E = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Rca RCA RCT6B06P23 */
    val RCA_RCT6B06P23 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Rca RCA RCT6B83W12 */
    val RCA_RCT6B83W12 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Rca RCA RCT6B86E12 */
    val RCA_RCT6B86E12 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Rca RCA RCT6S03W12 */
    val RCA_RCT6S03W12 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Rca RCA RCT6S03W14 */
    val RCA_RCT6S03W14 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Rca RCARENO5011619 */
    val RCARENO5011619 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Rca RCA Reno Max */
    val RCA_RENO_MAX = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Rca RCS13101T */
    val RCS13101T = "spec:width=480,height=800,unit=px,dpi=120"

    /** Rca RCT6103W46 */
    val RCT6103W46 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Rca RCT6203W46 */
    val RCT6203W46 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Rca RCT6223W97 */
    val RCT6223W97 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Rca RCT6272W23 */
    val RCT6272W23 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Rca RCT6378W2 */
    val RCT6378W2 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Rca RCT6513W87 */
    val RCT6513W87 = "spec:width=768,height=1368,unit=px,dpi=160"

    /** Rca RCT6513W87DK5e */
    val RCT6513W87DK5E = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Rca RCT6513W87DK5eQ */
    val RCT6513W87DK5EQ = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Rca RCT6513W87DK5eQe */
    val RCT6513W87DK5EQE = "spec:width=768,height=1368,unit=px,dpi=160"

    /** Rca RCT6573W23 */
    val RCT6573W23 = "spec:width=768,height=1024,unit=px,dpi=160"

    /** Rca RCT6613W23Q */
    val RCT6613W23Q = "spec:width=768,height=1368,unit=px,dpi=160"

    /** Rca RCT6716Q23 */
    val RCT6716Q23 = "spec:width=768,height=1368,unit=px,dpi=160"

    /** Rca RCT6716Q24 */
    val RCT6716Q24 = "spec:width=768,height=1368,unit=px,dpi=160"

    /** Rca RCT6773W22 */
    val RCT6773W22 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Rca RCT6773W42B */
    val RCT6773W42B = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Rca RCT6873W42BMF8QE */
    val RCT6873W42BMF8QE = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Rca RCT6873W42BMF9A */
    val RCT6873W42BMF9A = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Rca RCT6873W42M */
    val RCT6873W42M = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Rca RCT6876Q22N */
    val RCT6876Q22N = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Rca RCT6973W43 */
    val RCT6973W43 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Rca RCT6973W43MDEU */
    val RCT6973W43MDEU = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Rca RCT6973W43R */
    val RCT6973W43R = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Rca RCT6A06E12 */
    val RCT6A06E12 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Rca RCT6A06Q22 */
    val RCT6A06Q22 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Rca RCT6B03Q23 */
    val RCT6B03Q23 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Rca RCT6B06Q23 */
    val RCT6B06Q23 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Rca RCT6T48Q35 */
    val RCT6T48Q35 = "spec:width=1080,height=1920,unit=px,dpi=213"

    /** Rca RENO_NAPA */
    val RENO_NAPA = "spec:width=480,height=960,unit=px,dpi=213"

    /** Rca Reno_Pro */
    val RENO_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Rca TAB_One */
    val TAB_ONE = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Rca TAB_One_Plus */
    val TAB_ONE_PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Rca Tab_Pro */
    val TAB_PRO = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Rca Voyager */
    val VOYAGER = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Rca Voyager III */
    val VOYAGER_III = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Rca Voyager Pro */
    val VOYAGER_PRO = "spec:width=600,height=1024,unit=px,dpi=160"

}
