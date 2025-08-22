package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Toyin device specifications for Android Compose previews.
 *
 * This extension provides Toyin device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Toyin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Toyin get() = object {
    /** Toyin RJ TOYIN */
    val RJ_TOYIN = "spec:width=480,height=854,unit=px,dpi=240"

}
