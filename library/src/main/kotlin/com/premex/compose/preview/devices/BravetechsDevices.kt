package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bravetechs device specifications for Android Compose previews.
 *
 * This extension provides Bravetechs device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bravetechs.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bravetechs get() = object {
    /** Bravetechs Brave_T3Pro */
    val BRAVE_T3PRO = "spec:width=800,height=1280,unit=px,dpi=180"

}
