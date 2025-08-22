package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Allnet device specifications for Android Compose previews.
 *
 * This extension provides Allnet device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Allnet.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Allnet get() = object {
    /** Allnet PrimeOne */
    val PRIMEONE = "spec:width=1080,height=1920,unit=px,dpi=214"

}
