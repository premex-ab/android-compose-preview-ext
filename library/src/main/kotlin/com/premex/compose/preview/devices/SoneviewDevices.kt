package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Soneview device specifications for Android Compose previews.
 *
 * This extension provides Soneview device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Soneview.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Soneview get() = object {
    /** Soneview SV_TAB10 */
    val SV_TAB10 = "spec:width=800,height=1280,unit=px,dpi=220"

}
