package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Turbox device specifications for Android Compose previews.
 *
 * This extension provides Turbox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Turbox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Turbox get() = object {
    /** Turbox Turbo_X8 */
    val TURBO_X8 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Turbox Turbo-X Fire II (2GB) Tablet 10.1 WIFI  */
    val TURBO_X_FIRE_II_2GB_TABLET_10_1_WIFI = "spec:width=800,height=1280,unit=px,dpi=160"

}
