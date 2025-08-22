package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Heatz device specifications for Android Compose previews.
 *
 * This extension provides Heatz device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Heatz.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Heatz get() = object {
    /** Heatz Z9910A */
    val Z9910A = "spec:width=800,height=1280,unit=px,dpi=213"

}
