package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Nexa device specifications for Android Compose previews.
 *
 * This extension provides Nexa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Nexa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Nexa get() = object {
    /** Nexa NexaN5a */
    val NEXAN5A = "spec:width=480,height=854,unit=px,dpi=240"

}
