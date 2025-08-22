package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Rockcel device specifications for Android Compose previews.
 *
 * This extension provides Rockcel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Rockcel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Rockcel get() = object {
    /** Rockcel Quartzo UP */
    val QUARTZO_UP = "spec:width=480,height=854,unit=px,dpi=240"

}
