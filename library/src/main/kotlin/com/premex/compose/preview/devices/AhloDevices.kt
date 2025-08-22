package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ahlo device specifications for Android Compose previews.
 *
 * This extension provides Ahlo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ahlo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ahlo get() = object {
    /** Ahlo 1 */
    val _1 = "spec:width=1080,height=2408,unit=px,dpi=480"

}
