package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Wieppo device specifications for Android Compose previews.
 *
 * This extension provides Wieppo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Wieppo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Wieppo get() = object {
    /** Wieppo Wieppo S6 */
    val WIEPPO_S6 = "spec:width=720,height=1280,unit=px,dpi=320"

}
