package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mitsushiba device specifications for Android Compose previews.
 *
 * This extension provides Mitsushiba device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mitsushiba.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mitsushiba get() = object {
    /** Mitsushiba MITSUSHIBA */
    val MITSUSHIBA = "spec:width=800,height=1280,unit=px,dpi=160"

}
