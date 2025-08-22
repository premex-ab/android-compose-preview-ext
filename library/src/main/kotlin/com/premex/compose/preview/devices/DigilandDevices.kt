package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Digiland device specifications for Android Compose previews.
 *
 * This extension provides Digiland device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Digiland.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Digiland get() = object {
    /** Digiland Compumax Blue */
    val COMPUMAX_BLUE = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digiland CompumaxBlue */
    val COMPUMAXBLUE = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digiland DC-7015 */
    val DC_7015 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digiland Digiland_mid1032_mr */
    val DIGILAND_MID1032_MR = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digiland DL1001 */
    val DL1001 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digiland DL1003 */
    val DL1003 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digiland DL1008M */
    val DL1008M = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digiland DL1016 */
    val DL1016 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digiland DL1039 */
    val DL1039 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digiland DL1050 */
    val DL1050 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digiland DL7006 */
    val DL7006 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digiland DL718M */
    val DL718M = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digiland DL721RB */
    val DL721RB = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digiland DL8006 */
    val DL8006 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digiland DL9002 */
    val DL9002 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digiland DL9003mk */
    val DL9003MK = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digiland ismart */
    val ISMART = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digiland Leotec */
    val LEOTEC = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digiland MID1008_Digiland */
    val MID1008_DIGILAND = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digiland ONN */
    val ONN = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digiland R11 */
    val R11 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digiland SLTDVD1023 */
    val SLTDVD1023 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digiland TPC-705Kids_EEA */
    val TPC_705KIDS_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

}
