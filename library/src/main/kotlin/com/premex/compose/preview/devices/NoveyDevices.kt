package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Novey device specifications for Android Compose previews.
 *
 * This extension provides Novey device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Novey.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Novey get() = object {
    /** Novey Alpha A16 */
    val ALPHA_A16 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Novey Pro_K10 */
    val PRO_K10 = "spec:width=1080,height=2412,unit=px,dpi=480"

}
