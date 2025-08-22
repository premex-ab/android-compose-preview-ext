package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Taskphone device specifications for Android Compose previews.
 *
 * This extension provides Taskphone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Taskphone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Taskphone get() = object {
    /** Taskphone T20 */
    val T20 = "spec:width=720,height=1440,unit=px,dpi=320"

}
