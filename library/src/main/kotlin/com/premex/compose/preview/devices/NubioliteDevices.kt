package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Nubiolite device specifications for Android Compose previews.
 *
 * This extension provides Nubiolite device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Nubiolite.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Nubiolite get() = object {
    /** Nubiolite N2 Lite */
    val N2_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

}
