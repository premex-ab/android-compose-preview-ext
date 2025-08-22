package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Xwave device specifications for Android Compose previews.
 *
 * This extension provides Xwave device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Xwave.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Xwave get() = object {
    /** Xwave Xpad */
    val XPAD = "spec:width=600,height=1024,unit=px,dpi=160"

}
