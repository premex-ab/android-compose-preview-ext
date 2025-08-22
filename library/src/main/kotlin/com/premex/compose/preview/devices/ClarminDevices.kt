package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Clarmin device specifications for Android Compose previews.
 *
 * This extension provides Clarmin device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Clarmin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Clarmin get() = object {
    /** Clarmin CLARMIN C1 */
    val CLARMIN_C1 = "spec:width=720,height=1440,unit=px,dpi=320"

}
