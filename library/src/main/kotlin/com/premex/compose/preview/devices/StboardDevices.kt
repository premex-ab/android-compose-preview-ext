package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Stboard device specifications for Android Compose previews.
 *
 * This extension provides Stboard device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Stboard.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Stboard get() = object {
    /** Stboard HJ_TD */
    val HJ_TD = "spec:width=2160,height=3840,unit=px,dpi=420"

}
