package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bentley device specifications for Android Compose previews.
 *
 * This extension provides Bentley device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bentley.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bentley get() = object {
    /** Bentley SDIS1 */
    val SDIS1 = "spec:width=1200,height=1920,unit=px,dpi=240"

}
