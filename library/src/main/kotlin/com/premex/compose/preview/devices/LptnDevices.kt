package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Lptn device specifications for Android Compose previews.
 *
 * This extension provides Lptn device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Lptn.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Lptn get() = object {
    /** Lptn LP Legend  */
    val LP_LEGEND = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Lptn LP_N60 */
    val LP_N60 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Lptn LP_Pro1 */
    val LP_PRO1 = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Lptn LP_T70 */
    val LP_T70 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Lptn LP_T70_Lite */
    val LP_T70_LITE = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Lptn N-50 */
    val N_50 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Lptn N-57 */
    val N_57 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Lptn N-60 */
    val N_60 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Lptn T100 */
    val T100 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Lptn VYPER PRO */
    val VYPER_PRO = "spec:width=480,height=960,unit=px,dpi=240"

    /** Lptn W55 */
    val W55 = "spec:width=480,height=960,unit=px,dpi=213"

}
