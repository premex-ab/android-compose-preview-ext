package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tcst device specifications for Android Compose previews.
 *
 * This extension provides Tcst device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tcst.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tcst get() = object {
    /** Tcst L7 */
    val L7 = "spec:width=1200,height=1920,unit=px,dpi=320"

}
