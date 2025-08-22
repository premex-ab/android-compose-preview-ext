package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Wo device specifications for Android Compose previews.
 *
 * This extension provides Wo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Wo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Wo get() = object {
    /** Wo X6 */
    val X6 = "spec:width=540,height=960,unit=px,dpi=240"

}
