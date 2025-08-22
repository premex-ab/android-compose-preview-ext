package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Revrica device specifications for Android Compose previews.
 *
 * This extension provides Revrica device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Revrica.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Revrica get() = object {
    /** Revrica Uko108T */
    val UKO108T = "spec:width=800,height=1280,unit=px,dpi=213"

}
