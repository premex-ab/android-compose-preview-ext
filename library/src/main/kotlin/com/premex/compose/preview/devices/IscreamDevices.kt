package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Iscream device specifications for Android Compose previews.
 *
 * This extension provides Iscream device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Iscream.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Iscream get() = object {
    /** Iscream i-Screamedu */
    val I_SCREAMEDU = "spec:width=1200,height=1920,unit=px,dpi=213"

}
