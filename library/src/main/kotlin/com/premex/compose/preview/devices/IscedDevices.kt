package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Isced device specifications for Android Compose previews.
 *
 * This extension provides Isced device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Isced.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Isced get() = object {
    /** Isced ISCEDTAB21 */
    val ISCEDTAB21 = "spec:width=800,height=1280,unit=px,dpi=160"

}
