package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Lw device specifications for Android Compose previews.
 *
 * This extension provides Lw device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Lw.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Lw get() = object {
    /** Lw LW788 */
    val LW788 = "spec:width=600,height=1024,unit=px,dpi=160"

}
