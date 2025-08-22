package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Moshimore device specifications for Android Compose previews.
 *
 * This extension provides Moshimore device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Moshimore.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Moshimore get() = object {
    /** Moshimore RG1 */
    val RG1 = "spec:width=800,height=1280,unit=px,dpi=240"

}
