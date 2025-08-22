package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Waf device specifications for Android Compose previews.
 *
 * This extension provides Waf device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Waf.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Waf get() = object {
    /** Waf F808NM */
    val F808NM = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Waf THMTKAW01216_eea */
    val THMTKAW01216_EEA = "spec:width=1080,height=2220,unit=px,dpi=440"

}
