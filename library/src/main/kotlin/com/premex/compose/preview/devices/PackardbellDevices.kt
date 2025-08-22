package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Packardbell device specifications for Android Compose previews.
 *
 * This extension provides Packardbell device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Packardbell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Packardbell get() = object {
    /** Packardbell DAYTONA-G12 */
    val DAYTONA_G12 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Packardbell DAYTONA-G6 */
    val DAYTONA_G6 = "spec:width=480,height=960,unit=px,dpi=220"

    /** Packardbell DAYTONA_G8 */
    val DAYTONA_G8 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Packardbell INTERLAGOS-T32 */
    val INTERLAGOS_T32 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Packardbell M10400 */
    val M10400 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Packardbell M10500 */
    val M10500 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Packardbell M10600 */
    val M10600 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Packardbell M10905-32 */
    val M10905_32 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Packardbell M10950 */
    val M10950 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Packardbell M11550 */
    val M11550 = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Packardbell M7500 */
    val M7500 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Packardbell M7600-D */
    val M7600_D = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Packardbell MONZA-T5 */
    val MONZA_T5 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Packardbell PB1009 */
    val PB1009 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Packardbell PB101 */
    val PB101 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Packardbell PB9000-32 */
    val PB9000_32 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Packardbell SILVERSTONE-T10 */
    val SILVERSTONE_T10 = "spec:width=1200,height=1920,unit=px,dpi=200"

    /** Packardbell Silverstone-T10X */
    val SILVERSTONE_T10X = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Packardbell SILVERSTONE-T11 */
    val SILVERSTONE_T11 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Packardbell SILVERSTONE-T18 */
    val SILVERSTONE_T18 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Packardbell TARGA-F10PRO */
    val TARGA_F10PRO = "spec:width=800,height=1280,unit=px,dpi=213"

}
