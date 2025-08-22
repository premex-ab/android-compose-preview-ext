package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Plaisio device specifications for Android Compose previews.
 *
 * This extension provides Plaisio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Plaisio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Plaisio get() = object {
    /** Plaisio A4 */
    val A4 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Plaisio Aqua */
    val AQUA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Plaisio Aqua_II */
    val AQUA_II = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Plaisio Calltab2GB10.1 */
    val CALLTAB2GB10_1 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Plaisio Earth 7.0' 3G */
    val EARTH_7_0_3G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Plaisio Fire */
    val FIRE = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Plaisio Turbox_S3 */
    val TURBOX_S3 = "spec:width=720,height=1280,unit=px,dpi=320"

}
