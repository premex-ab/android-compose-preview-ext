package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Uniscope device specifications for Android Compose previews.
 *
 * This extension provides Uniscope device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Uniscope.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Uniscope get() = object {
    /** Uniscope S6s */
    val S6S = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Uniscope s6w */
    val S6W = "spec:width=800,height=1280,unit=px,dpi=160"

}
