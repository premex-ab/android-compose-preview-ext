package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sannuo device specifications for Android Compose previews.
 *
 * This extension provides Sannuo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sannuo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sannuo get() = object {
    /** Sannuo K102 */
    val K102 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Sannuo K108 */
    val K108 = "spec:width=800,height=1280,unit=px,dpi=160"

}
