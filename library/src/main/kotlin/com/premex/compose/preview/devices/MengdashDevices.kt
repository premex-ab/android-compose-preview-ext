package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mengdash device specifications for Android Compose previews.
 *
 * This extension provides Mengdash device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mengdash.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mengdash get() = object {
    /** Mengdash M_Q58 */
    val M_Q58 = "spec:width=800,height=1280,unit=px,dpi=160"

}
