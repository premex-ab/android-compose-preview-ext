package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mpgio device specifications for Android Compose previews.
 *
 * This extension provides Mpgio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mpgio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mpgio get() = object {
    /** Mpgio ATHENA_A10 */
    val ATHENA_A10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mpgio ATHENA_X */
    val ATHENA_X = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mpgio IKP104 */
    val IKP104 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Mpgio Legend_A */
    val LEGEND_A = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mpgio LEGEND_EZ */
    val LEGEND_EZ = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mpgio LEGEND_NEW7 */
    val LEGEND_NEW7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Mpgio MAT10221 */
    val MAT10221 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mpgio MAT10421 */
    val MAT10421 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Mpgio MAT80211B */
    val MAT80211B = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Mpgio MLT156001 */
    val MLT156001 = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Mpgio MLT703824 */
    val MLT703824 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Mpgio MPGIO_10 */
    val MPGIO_10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mpgio MPGIO_8 */
    val MPGIO_8 = "spec:width=800,height=1280,unit=px,dpi=213"

}
