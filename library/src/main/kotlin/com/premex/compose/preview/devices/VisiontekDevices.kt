package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Visiontek device specifications for Android Compose previews.
 *
 * This extension provides Visiontek device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Visiontek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Visiontek get() = object {
    /** Visiontek VT_31 */
    val VT_31 = "spec:width=800,height=1280,unit=px,dpi=240"

}
