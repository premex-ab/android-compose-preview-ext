package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tmobile device specifications for Android Compose previews.
 *
 * This extension provides Tmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tmobile get() = object {
    /** Tmobile REVVL 2 */
    val REVVL_2 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Tmobile REVVL 4 */
    val REVVL_4 = "spec:width=720,height=1520,unit=px,dpi=280"

    /** Tmobile REVVL 4+ */
    val REVVL_4_720X1600 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Tmobile REVVL 5G */
    val REVVL_5G = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Tmobile REVVL 6 */
    val REVVL_6 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Tmobile REVVL 6 Pro */
    val REVVL_6_PRO = "spec:width=720,height=1640,unit=px,dpi=280"

    /** Tmobile REVVL 6x 5G */
    val REVVL_6X_5G = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Tmobile REVVL 6x PRO 5G */
    val REVVL_6X_PRO_5G = "spec:width=720,height=1640,unit=px,dpi=280"

    /** Tmobile REVVL 7 */
    val REVVL_7 = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Tmobile REVVL 7 Pro */
    val REVVL_7_PRO = "spec:width=1080,height=2436,unit=px,dpi=480"

    /** Tmobile REVVLRY+ */
    val REVVLRY = "spec:width=1080,height=2270,unit=px,dpi=480"

    /** Tmobile REVVL TAB 5G */
    val REVVL_TAB_5G = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Tmobile REVVL V */
    val REVVL_V = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Tmobile REVVL V+ 5G */
    val REVVL_V_5G = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Tmobile TCL 20 XE */
    val TCL_20_XE = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Tmobile Telekom_Puls */
    val TELEKOM_PULS = "spec:width=800,height=1280,unit=px,dpi=213"

}
