package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Maxfone device specifications for Android Compose previews.
 *
 * This extension provides Maxfone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Maxfone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Maxfone get() = object {
    /** Maxfone MAX 1X */
    val MAX_1X = "spec:width=480,height=1014,unit=px,dpi=240"

}
