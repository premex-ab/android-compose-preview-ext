package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Storex device specifications for Android Compose previews.
 *
 * This extension provides Storex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Storex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Storex get() = object {
    /** Storex MDDDI13310 */
    val MDDDI13310 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Storex MDDDI13311 */
    val MDDDI13311 = "spec:width=800,height=1280,unit=px,dpi=160"

}
