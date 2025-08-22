package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Northtech device specifications for Android Compose previews.
 *
 * This extension provides Northtech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Northtech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Northtech get() = object {
    /** Northtech NT-S10 */
    val NT_S10 = "spec:width=600,height=1024,unit=px,dpi=160"

}
