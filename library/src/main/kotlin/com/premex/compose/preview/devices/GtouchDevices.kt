package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Gtouch device specifications for Android Compose previews.
 *
 * This extension provides Gtouch device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Gtouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Gtouch get() = object {
    /** Gtouch SPEED_2021 */
    val SPEED_2021 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Gtouch Stella_Omega */
    val STELLA_OMEGA = "spec:width=1080,height=2220,unit=px,dpi=440"

    /** Gtouch Stella Omega Plus */
    val STELLA_OMEGA_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

    /** Gtouch Stella X Plus */
    val STELLA_X_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

    /** Gtouch Stella XS */
    val STELLA_XS = "spec:width=480,height=960,unit=px,dpi=240"

}
