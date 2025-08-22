package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Elead device specifications for Android Compose previews.
 *
 * This extension provides Elead device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Elead.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Elead get() = object {
    /** Elead RSE */
    val RSE = "spec:width=1080,height=1920,unit=px,dpi=240"

}
