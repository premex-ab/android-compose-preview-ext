package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vimatek device specifications for Android Compose previews.
 *
 * This extension provides Vimatek device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vimatek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vimatek get() = object {
    /** Vimatek VM20 */
    val VM20 = "spec:width=800,height=1280,unit=px,dpi=213"

}
