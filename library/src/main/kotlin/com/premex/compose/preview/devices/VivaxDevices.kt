package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vivax device specifications for Android Compose previews.
 *
 * This extension provides Vivax device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vivax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vivax get() = object {
    /** Vivax FUN S20 */
    val FUN_S20 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vivax Point_X2 */
    val POINT_X2 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Vivax Point X502 */
    val POINT_X502 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Vivax Point_X503 */
    val POINT_X503 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Vivax TPC-102_4G_eea */
    val TPC_102_4G_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Vivax TPC_8043G */
    val TPC_8043G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Vivax TPC_8053G */
    val TPC_8053G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Vivax TPC_8063G */
    val TPC_8063G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Vivax TPC_8074G */
    val TPC_8074G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Vivax VIVAX Fly6 */
    val VIVAX_FLY6 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Vivax VIVAX_Fly_V1 */
    val VIVAX_FLY_V1 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Vivax VIVAX_PRO3 */
    val VIVAX_PRO3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vivax VIVAX_TPC-105_4G */
    val VIVAX_TPC_105_4G = "spec:width=800,height=1280,unit=px,dpi=213"

}
