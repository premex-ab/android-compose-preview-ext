package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Dtech device specifications for Android Compose previews.
 *
 * This extension provides Dtech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Dtech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Dtech get() = object {
    /** Dtech D5L */
    val D5L = "spec:width=720,height=1440,unit=px,dpi=300"

    /** Dtech D5S */
    val D5S = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Dtech DT07 */
    val DT07 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Dtech DT08-TAB4G */
    val DT08_TAB4G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dtech DT10-TAB4G */
    val DT10_TAB4G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dtech DT10-TAB4G-T101 */
    val DT10_TAB4G_T101 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dtech LM-01 */
    val LM_01 = "spec:width=800,height=1280,unit=px,dpi=160"

}
