package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Oxtab device specifications for Android Compose previews.
 *
 * This extension provides Oxtab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Oxtab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Oxtab get() = object {
    /** Oxtab Ox-p010-2 */
    val OX_P010_2 = "spec:width=800,height=1280,unit=px,dpi=200"

}
