package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Balmuda device specifications for Android Compose previews.
 *
 * This extension provides Balmuda device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Balmuda.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Balmuda get() = object {
    /** Balmuda BALMUDA Phone */
    val BALMUDA_PHONE = "spec:width=1080,height=1920,unit=px,dpi=450"

}
