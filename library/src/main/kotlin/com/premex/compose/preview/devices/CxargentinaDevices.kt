package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cxargentina device specifications for Android Compose previews.
 *
 * This extension provides Cxargentina device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cxargentina.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cxargentina get() = object {
    /** Cxargentina CX9011 */
    val CX9011 = "spec:width=600,height=1024,unit=px,dpi=160"

}
