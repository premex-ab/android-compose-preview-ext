package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Coreinnovations device specifications for Android Compose previews.
 *
 * This extension provides Coreinnovations device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Coreinnovations.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Coreinnovations get() = object {
    /** Coreinnovations CRTB7001 */
    val CRTB7001 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Coreinnovations CTB1016G */
    val CTB1016G = "spec:width=600,height=1024,unit=px,dpi=160"

}
