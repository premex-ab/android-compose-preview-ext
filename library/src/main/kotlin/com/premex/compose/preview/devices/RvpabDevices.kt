package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Rvpab device specifications for Android Compose previews.
 *
 * This extension provides Rvpab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Rvpab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Rvpab get() = object {
    /** Rvpab RVPVK808 */
    val RVPVK808 = "spec:width=800,height=1280,unit=px,dpi=160"

}
