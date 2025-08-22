package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Nextgear device specifications for Android Compose previews.
 *
 * This extension provides Nextgear device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Nextgear.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Nextgear get() = object {
    /** Nextgear Nextgear n1 */
    val NEXTGEAR_N1 = "spec:width=1080,height=2340,unit=px,dpi=480"

}
