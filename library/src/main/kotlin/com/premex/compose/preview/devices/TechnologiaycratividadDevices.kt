package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Technologiaycratividad device specifications for Android Compose previews.
 *
 * This extension provides Technologiaycratividad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Technologiaycratividad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Technologiaycratividad get() = object {
    /** Technologiaycratividad M103H */
    val M103H = "spec:width=800,height=1280,unit=px,dpi=160"

}
