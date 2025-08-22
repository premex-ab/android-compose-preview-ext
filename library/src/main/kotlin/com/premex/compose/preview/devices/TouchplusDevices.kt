package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Touchplus device specifications for Android Compose previews.
 *
 * This extension provides Touchplus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Touchplus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Touchplus get() = object {
    /** Touchplus 1100AS */
    val _1100AS = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Touchplus 770G */
    val _770G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Touchplus 770N */
    val _770N = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Touchplus AS1000 */
    val AS1000 = "spec:width=800,height=1280,unit=px,dpi=160"

}
