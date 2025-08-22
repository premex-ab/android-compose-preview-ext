package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Xphoenix device specifications for Android Compose previews.
 *
 * This extension provides Xphoenix device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Xphoenix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Xphoenix get() = object {
    /** Xphoenix OneTabPro2  */
    val ONETABPRO2 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Xphoenix OneTabProMate */
    val ONETABPROMATE = "spec:width=1200,height=1920,unit=px,dpi=280"

}
