package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Gmee device specifications for Android Compose previews.
 *
 * This extension provides Gmee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Gmee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Gmee get() = object {
    /** Gmee connect 2 US */
    val CONNECT_2_US = "spec:width=480,height=854,unit=px,dpi=240"

    /** Gmee ConnectPro */
    val CONNECTPRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Gmee ConnectPro_L */
    val CONNECTPRO_L = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Gmee G-mee Play Pro */
    val G_MEE_PLAY_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Gmee play2 */
    val PLAY2 = "spec:width=480,height=854,unit=px,dpi=240"

}
