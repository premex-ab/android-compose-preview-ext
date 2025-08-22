package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hamic device specifications for Android Compose previews.
 *
 * This extension provides Hamic device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hamic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hamic get() = object {
    /** Hamic MIELS */
    val MIELS = "spec:width=540,height=1080,unit=px,dpi=260"

    /** Hamic POCKET */
    val POCKET = "spec:width=480,height=640,unit=px,dpi=190"

}
