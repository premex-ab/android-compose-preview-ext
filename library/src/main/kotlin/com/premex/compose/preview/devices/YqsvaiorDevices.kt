package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Yqsvaior device specifications for Android Compose previews.
 *
 * This extension provides Yqsvaior device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Yqsvaior.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Yqsvaior get() = object {
    /** Yqsvaior YQ10 */
    val YQ10 = "spec:width=800,height=1280,unit=px,dpi=213"

}
