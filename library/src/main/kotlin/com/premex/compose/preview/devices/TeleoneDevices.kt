package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Teleone device specifications for Android Compose previews.
 *
 * This extension provides Teleone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Teleone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Teleone get() = object {
    /** Teleone I06 */
    val I06 = "spec:width=800,height=1280,unit=px,dpi=220"

}
