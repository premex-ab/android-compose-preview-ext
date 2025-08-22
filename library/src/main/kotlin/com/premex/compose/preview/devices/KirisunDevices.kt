package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kirisun device specifications for Android Compose previews.
 *
 * This extension provides Kirisun device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kirisun.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kirisun get() = object {
    /** Kirisun KIRISUN T650 */
    val KIRISUN_T650 = "spec:width=720,height=1440,unit=px,dpi=320"

}
