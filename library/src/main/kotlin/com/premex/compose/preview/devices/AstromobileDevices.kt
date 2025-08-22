package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Astromobile device specifications for Android Compose previews.
 *
 * This extension provides Astromobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Astromobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Astromobile get() = object {
    /** Astromobile Smart _A1_Plus */
    val SMART_A1_PLUS = "spec:width=480,height=960,unit=px,dpi=200"

}
