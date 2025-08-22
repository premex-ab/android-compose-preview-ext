package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vsmart device specifications for Android Compose previews.
 *
 * This extension provides Vsmart device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vsmart.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vsmart get() = object {
    /** Vsmart Active 1 */
    val ACTIVE_1 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Vsmart Active 1+ */
    val ACTIVE_1_1080X2260 = "spec:width=1080,height=2260,unit=px,dpi=480"

    /** Vsmart Active 3 */
    val ACTIVE_3 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Vsmart Aris */
    val ARIS = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Vsmart Aris Pro */
    val ARIS_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Vsmart AT&T Fusion Z */
    val AT_T_FUSION_Z = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Vsmart Bee */
    val BEE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Vsmart Bee 3 */
    val BEE_3 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Vsmart Bee Lite */
    val BEE_LITE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Vsmart Hobson */
    val HOBSON = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Vsmart Joy 1 */
    val JOY_1 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Vsmart Joy 1+ */
    val JOY_1_720X1500 = "spec:width=720,height=1500,unit=px,dpi=320"

    /** Vsmart Joy 2+ */
    val JOY_2 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Vsmart Joy 3 */
    val JOY_3 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Vsmart Joy 4 */
    val JOY_4 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Vsmart Live */
    val LIVE = "spec:width=1080,height=2232,unit=px,dpi=480"

    /** Vsmart Live 4 */
    val LIVE_4 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Vsmart Star */
    val STAR = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Vsmart Star 3 */
    val STAR_3 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Vsmart Star 4 */
    val STAR_4 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Vsmart Star 5 */
    val STAR_5 = "spec:width=720,height=1600,unit=px,dpi=320"

}
