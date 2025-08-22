package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tabletpc device specifications for Android Compose previews.
 *
 * This extension provides Tabletpc device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tabletpc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tabletpc get() = object {
    /** Tabletpc T3G_07 */
    val T3G_07 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Tabletpc T3G_10B */
    val T3G_10B = "spec:width=800,height=1280,unit=px,dpi=213"

}
