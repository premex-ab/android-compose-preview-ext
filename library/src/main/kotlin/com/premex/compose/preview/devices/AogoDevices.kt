package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Aogo device specifications for Android Compose previews.
 *
 * This extension provides Aogo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Aogo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Aogo get() = object {
    /** Aogo AoGo1 */
    val AOGO1 = "spec:width=800,height=1280,unit=px,dpi=160"

}
