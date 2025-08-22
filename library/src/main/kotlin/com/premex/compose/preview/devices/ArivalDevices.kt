package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Arival device specifications for Android Compose previews.
 *
 * This extension provides Arival device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Arival.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Arival get() = object {
    /** Arival BioniQP116 */
    val BIONIQP116 = "spec:width=1200,height=1920,unit=px,dpi=280"

}
