package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Pbskids device specifications for Android Compose previews.
 *
 * This extension provides Pbskids device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Pbskids.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Pbskids get() = object {
    /** Pbskids PBS700DVD */
    val PBS700DVD = "spec:width=600,height=1024,unit=px,dpi=160"

}
