package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vidcn device specifications for Android Compose previews.
 *
 * This extension provides Vidcn device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vidcn.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vidcn get() = object {
    /** Vidcn GQ3115TF5 */
    val GQ3115TF5 = "spec:width=1080,height=2408,unit=px,dpi=480"

}
