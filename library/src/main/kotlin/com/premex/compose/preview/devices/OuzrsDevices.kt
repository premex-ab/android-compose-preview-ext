package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ouzrs device specifications for Android Compose previews.
 *
 * This extension provides Ouzrs device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ouzrs.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ouzrs get() = object {
    /** Ouzrs OUZRSM4 */
    val OUZRSM4 = "spec:width=768,height=1366,unit=px,dpi=160"

}
