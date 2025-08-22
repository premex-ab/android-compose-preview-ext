package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cleartouch device specifications for Android Compose previews.
 *
 * This extension provides Cleartouch device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cleartouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cleartouch get() = object {
    /** Cleartouch NEXT_TDED */
    val NEXT_TDED = "spec:width=2160,height=3840,unit=px,dpi=480"

}
