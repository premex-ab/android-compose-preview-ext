package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Youtab device specifications for Android Compose previews.
 *
 * This extension provides Youtab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Youtab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Youtab get() = object {
    /** Youtab YOUTAB_S7 */
    val YOUTAB_S7 = "spec:width=600,height=1024,unit=px,dpi=213"

}
