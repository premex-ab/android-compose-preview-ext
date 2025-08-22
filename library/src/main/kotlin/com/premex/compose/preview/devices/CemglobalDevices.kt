package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cemglobal device specifications for Android Compose previews.
 *
 * This extension provides Cemglobal device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cemglobal.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cemglobal get() = object {
    /** Cemglobal Continental */
    val CONTINENTAL = "spec:width=600,height=1024,unit=px,dpi=160"

}
