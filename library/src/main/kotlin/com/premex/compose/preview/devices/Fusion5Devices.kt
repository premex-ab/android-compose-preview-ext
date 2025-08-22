package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Fusion5 device specifications for Android Compose previews.
 *
 * This extension provides Fusion5 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Fusion5.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Fusion5 get() = object {
    /** Fusion5 F104Bv2_EEA */
    val F104BV2_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Fusion5 F104Bv2_PRO */
    val F104BV2_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Fusion5 F104BvII_PRO */
    val F104BVII_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Fusion5 F104Ev2 */
    val F104EV2 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Fusion5 F104Ev2_EEA */
    val F104EV2_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Fusion5 F104EvII */
    val F104EVII = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Fusion5 F104EvII_EEA */
    val F104EVII_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Fusion5 F104EvII_PRO */
    val F104EVII_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Fusion5 F104EvII_PRO_EEA */
    val F104EVII_PRO_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Fusion5 F105D_128 */
    val F105D_128 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Fusion5 F105DvII */
    val F105DVII = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Fusion5 F202_8G */
    val F202_8G = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Fusion5 F202_8G_EEA */
    val F202_8G_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Fusion5 F202_UK */
    val F202_UK = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Fusion5 F202_US */
    val F202_US = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Fusion5 F202_v2_EEA */
    val F202_V2_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Fusion5 F704Bv2 */
    val F704BV2 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Fusion5 Fusion5_F104Bv2 */
    val FUSION5_F104BV2 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Fusion5 Fusion5_F104E_EEA */
    val FUSION5_F104E_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Fusion5 Fusion5_F105D */
    val FUSION5_F105D = "spec:width=800,height=1280,unit=px,dpi=160"

}
