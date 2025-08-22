package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sawink device specifications for Android Compose previews.
 *
 * This extension provides Sawink device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sawink.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sawink get() = object {
    /** Sawink T10 */
    val T10 = "spec:width=800,height=1280,unit=px,dpi=213"

}
