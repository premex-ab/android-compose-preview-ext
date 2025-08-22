package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Chemistwarehouse device specifications for Android Compose previews.
 *
 * This extension provides Chemistwarehouse device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Chemistwarehouse.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Chemistwarehouse get() = object {
    /** Chemistwarehouse JR-MB603 */
    val JR_MB603 = "spec:width=720,height=1280,unit=px,dpi=320"

}
