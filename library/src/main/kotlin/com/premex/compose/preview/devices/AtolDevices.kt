package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Atol device specifications for Android Compose previews.
 *
 * This extension provides Atol device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Atol.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Atol get() = object {
    /** Atol Smart_Prime */
    val SMART_PRIME = "spec:width=480,height=800,unit=px,dpi=240"

    /** Atol Smart.Slim Plus */
    val SMART_SLIM_PLUS = "spec:width=480,height=800,unit=px,dpi=240"

}
