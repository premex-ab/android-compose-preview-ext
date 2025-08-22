package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Minimalphone device specifications for Android Compose previews.
 *
 * This extension provides Minimalphone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Minimalphone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Minimalphone get() = object {
    /** Minimalphone MP01 */
    val MP01 = "spec:width=600,height=800,unit=px,dpi=180"

}
