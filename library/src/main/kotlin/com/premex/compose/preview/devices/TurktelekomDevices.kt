package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Turktelekom device specifications for Android Compose previews.
 *
 * This extension provides Turktelekom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Turktelekom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Turktelekom get() = object {
    /** Turktelekom E4 */
    val E4 = "spec:width=480,height=800,unit=px,dpi=240"

}
