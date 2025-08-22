package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Lumigon device specifications for Android Compose previews.
 *
 * This extension provides Lumigon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Lumigon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Lumigon get() = object {
    /** Lumigon T3 */
    val T3 = "spec:width=720,height=1280,unit=px,dpi=320"

}
