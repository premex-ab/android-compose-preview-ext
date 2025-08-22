package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Arirang device specifications for Android Compose previews.
 *
 * This extension provides Arirang device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Arirang.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Arirang get() = object {
    /** Arirang ATPA801_1 */
    val ATPA801_1 = "spec:width=800,height=1280,unit=px,dpi=213"

}
