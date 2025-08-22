package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tbltaca device specifications for Android Compose previews.
 *
 * This extension provides Tbltaca device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tbltaca.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tbltaca get() = object {
    /** Tbltaca Y108 */
    val Y108 = "spec:width=1200,height=1920,unit=px,dpi=248"

}
