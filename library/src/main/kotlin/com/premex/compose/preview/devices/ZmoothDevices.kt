package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zmooth device specifications for Android Compose previews.
 *
 * This extension provides Zmooth device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zmooth.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zmooth get() = object {
    /** Zmooth ZMOOTH ZTAB020 */
    val ZMOOTH_ZTAB020 = "spec:width=1080,height=1920,unit=px,dpi=240"

}
