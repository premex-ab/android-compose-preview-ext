package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mytabpro device specifications for Android Compose previews.
 *
 * This extension provides Mytabpro device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mytabpro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mytabpro get() = object {
    /** Mytabpro My-10-13-1 */
    val MY_10_13_1 = "spec:width=800,height=1280,unit=px,dpi=200"

}
