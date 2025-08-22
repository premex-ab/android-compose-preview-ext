package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Etgg device specifications for Android Compose previews.
 *
 * This extension provides Etgg device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Etgg.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Etgg get() = object {
    /** Etgg ETG-BT1121 */
    val ETG_BT1121 = "spec:width=1200,height=1920,unit=px,dpi=280"

}
