package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Helgi device specifications for Android Compose previews.
 *
 * This extension provides Helgi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Helgi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Helgi get() = object {
    /** Helgi HXxx10 */
    val HXXX10 = "spec:width=2160,height=3840,unit=px,dpi=480"

}
