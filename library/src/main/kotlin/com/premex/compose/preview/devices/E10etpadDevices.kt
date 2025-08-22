package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * E10etpad device specifications for Android Compose previews.
 *
 * This extension provides E10etpad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.E10etpad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.E10etpad get() = object {
    /** E10etpad ETPad */
    val ETPAD = "spec:width=1200,height=1920,unit=px,dpi=280"

}
