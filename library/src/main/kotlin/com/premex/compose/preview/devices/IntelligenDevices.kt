package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Intelligen device specifications for Android Compose previews.
 *
 * This extension provides Intelligen device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Intelligen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Intelligen get() = object {
    /** Intelligen IN-101 */
    val IN_101 = "spec:width=1200,height=1920,unit=px,dpi=320"

}
