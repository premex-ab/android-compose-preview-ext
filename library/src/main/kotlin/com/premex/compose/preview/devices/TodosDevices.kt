package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Todos device specifications for Android Compose previews.
 *
 * This extension provides Todos device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Todos.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Todos get() = object {
    /** Todos Tab64 */
    val TAB64 = "spec:width=800,height=1280,unit=px,dpi=160"

}
