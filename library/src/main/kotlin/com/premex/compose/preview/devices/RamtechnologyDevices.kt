package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ramtechnology device specifications for Android Compose previews.
 *
 * This extension provides Ramtechnology device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ramtechnology.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ramtechnology get() = object {
    /** Ramtechnology Star */
    val STAR = "spec:width=600,height=1024,unit=px,dpi=160"

}
