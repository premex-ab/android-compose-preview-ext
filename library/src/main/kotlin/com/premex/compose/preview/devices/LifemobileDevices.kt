package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Lifemobile device specifications for Android Compose previews.
 *
 * This extension provides Lifemobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Lifemobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Lifemobile get() = object {
    /** Lifemobile LM1 */
    val LM1 = "spec:width=720,height=1280,unit=px,dpi=320"

}
