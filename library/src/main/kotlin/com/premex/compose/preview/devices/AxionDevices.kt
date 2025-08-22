package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Axion device specifications for Android Compose previews.
 *
 * This extension provides Axion device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Axion.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Axion get() = object {
    /** Axion SBAA1011 */
    val SBAA1011 = "spec:width=720,height=1280,unit=px,dpi=160"

}
