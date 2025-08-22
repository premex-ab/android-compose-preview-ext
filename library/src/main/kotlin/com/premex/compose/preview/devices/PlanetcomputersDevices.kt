package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Planetcomputers device specifications for Android Compose previews.
 *
 * This extension provides Planetcomputers device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Planetcomputers.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Planetcomputers get() = object {
    /** Planetcomputers Astro_Slide_5G_Transformer */
    val ASTRO_SLIDE_5G_TRANSFORMER = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Planetcomputers Cosmo_Communicator */
    val COSMO_COMMUNICATOR = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Planetcomputers Gemini */
    val GEMINI = "spec:width=1080,height=2160,unit=px,dpi=480"

}
