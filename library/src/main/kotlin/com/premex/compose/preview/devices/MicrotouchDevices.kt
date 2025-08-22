package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Microtouch device specifications for Android Compose previews.
 *
 * This extension provides Microtouch device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Microtouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Microtouch get() = object {
    /** Microtouch IDC_Series */
    val IDC_SERIES = "spec:width=1080,height=1920,unit=px,dpi=160"

}
