package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Fcnt device specifications for Android Compose previews.
 *
 * This extension provides Fcnt device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Fcnt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Fcnt get() = object {
    /** Fcnt A401FC */
    val A401FC = "spec:width=720,height=1560,unit=px,dpi=360"

    /** Fcnt arrows Alpha F-51F */
    val ARROWS_ALPHA_F_51F = "spec:width=1200,height=2670,unit=px,dpi=450"

    /** Fcnt arrows Alpha M08 */
    val ARROWS_ALPHA_M08 = "spec:width=1200,height=2670,unit=px,dpi=450"

    /** Fcnt arrows Be4 Plus F-41B */
    val ARROWS_BE4_PLUS_F_41B = "spec:width=720,height=1480,unit=px,dpi=320"

    /** Fcnt arrows BZ02 */
    val ARROWS_BZ02 = "spec:width=720,height=1480,unit=px,dpi=320"

    /** Fcnt arrows BZ03 */
    val ARROWS_BZ03 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Fcnt arrows N F-51C */
    val ARROWS_N_F_51C = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Fcnt arrows We2 A402FC */
    val ARROWS_WE2_A402FC = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Fcnt arrows We2 F-52E */
    val ARROWS_WE2_F_52E = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Fcnt arrows We2 FCG02 */
    val ARROWS_WE2_FCG02 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Fcnt arrows We2 M07 */
    val ARROWS_WE2_M07 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Fcnt arrows We2 Plus F-51E */
    val ARROWS_WE2_PLUS_F_51E = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Fcnt arrows We2 Plus M06 */
    val ARROWS_WE2_PLUS_M06 = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Fcnt arrows We A101FC */
    val ARROWS_WE_A101FC = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Fcnt arrows We F-51B */
    val ARROWS_WE_F_51B = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Fcnt arrows We FCG01 */
    val ARROWS_WE_FCG01 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Fcnt F-52B */
    val F_52B = "spec:width=1080,height=1980,unit=px,dpi=480"

    /** Fcnt F-53E */
    val F_53E = "spec:width=1080,height=2160,unit=px,dpi=400"

    /** Fcnt MR01 */
    val MR01 = "spec:width=720,height=1560,unit=px,dpi=360"

}
