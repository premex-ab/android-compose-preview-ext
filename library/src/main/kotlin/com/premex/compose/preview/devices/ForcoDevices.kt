package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Forco device specifications for Android Compose previews.
 *
 * This extension provides Forco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Forco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Forco get() = object {
    /** Forco K1028G */
    val K1028G = "spec:width=1200,height=1920,unit=px,dpi=280"

}
