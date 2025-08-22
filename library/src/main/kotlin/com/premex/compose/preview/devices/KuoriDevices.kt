package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kuori device specifications for Android Compose previews.
 *
 * This extension provides Kuori device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kuori.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kuori get() = object {
    /** Kuori KH3566 */
    val KH3566 = "spec:width=1080,height=1920,unit=px,dpi=240"

}
