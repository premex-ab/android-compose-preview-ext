package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Pinocchio device specifications for Android Compose previews.
 *
 * This extension provides Pinocchio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Pinocchio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Pinocchio get() = object {
    /** Pinocchio SGWIFIPAD320093 */
    val SGWIFIPAD320093 = "spec:width=800,height=1280,unit=px,dpi=213"

}
