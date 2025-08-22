package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Candor device specifications for Android Compose previews.
 *
 * This extension provides Candor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Candor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Candor get() = object {
    /** Candor PHS-601 */
    val PHS_601 = "spec:width=720,height=1280,unit=px,dpi=320"

}
