package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mobistel device specifications for Android Compose previews.
 *
 * This extension provides Mobistel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mobistel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mobistel get() = object {
    /** Mobistel Cynus F10 */
    val CYNUS_F10 = "spec:width=720,height=1280,unit=px,dpi=320"

}
