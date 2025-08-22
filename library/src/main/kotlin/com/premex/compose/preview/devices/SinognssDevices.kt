package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sinognss device specifications for Android Compose previews.
 *
 * This extension provides Sinognss device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sinognss.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sinognss get() = object {
    /** Sinognss R60 Data Collector */
    val R60_DATA_COLLECTOR = "spec:width=1080,height=1920,unit=px,dpi=480"

}
