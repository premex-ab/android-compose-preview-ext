package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Stea device specifications for Android Compose previews.
 *
 * This extension provides Stea device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Stea.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Stea get() = object {
    /** Stea S11 */
    val S11 = "spec:width=800,height=1280,unit=px,dpi=213"

}
