package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Magnavox device specifications for Android Compose previews.
 *
 * This extension provides Magnavox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Magnavox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Magnavox get() = object {
    /** Magnavox MMP848 */
    val MMP848 = "spec:width=800,height=1280,unit=px,dpi=213"

}
