package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vodhorizon device specifications for Android Compose previews.
 *
 * This extension provides Vodhorizon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vodhorizon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vodhorizon get() = object {
    /** Vodhorizon Web 3 Pro 8 */
    val WEB_3_PRO_8 = "spec:width=1080,height=2400,unit=px,dpi=400"

}
