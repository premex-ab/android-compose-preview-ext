package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Inovio device specifications for Android Compose previews.
 *
 * This extension provides Inovio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Inovio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Inovio get() = object {
    /** Inovio EVO_TAB7 */
    val EVO_TAB7 = "spec:width=600,height=1024,unit=px,dpi=160"

}
