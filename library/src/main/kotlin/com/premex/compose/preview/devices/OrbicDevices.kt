package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Orbic device specifications for Android Compose previews.
 *
 * This extension provides Orbic device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Orbic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Orbic get() = object {
    /** Orbic Magic */
    val MAGIC = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Orbic R4S14V_Visible */
    val R4S14V_VISIBLE = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Orbic R678L5V */
    val R678L5V = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Orbic R8L5T */
    val R8L5T = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Orbic RC10RLT-RW1 */
    val RC10RLT_RW1 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Orbic RC545LF */
    val RC545LF = "spec:width=480,height=960,unit=px,dpi=240"

    /** Orbic RC608L2 */
    val RC608L2 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Orbic RC609L */
    val RC609L = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Orbic RC609LP-RWANZ */
    val RC609LP_RWANZ = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Orbic RC609LSM */
    val RC609LSM = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Orbic RC8L1T-RW1 */
    val RC8L1T_RW1 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Orbic Wonder */
    val WONDER = "spec:width=1080,height=1920,unit=px,dpi=480"

}
