package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Maxron device specifications for Android Compose previews.
 *
 * This extension provides Maxron device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Maxron.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Maxron get() = object {
    /** Maxron MXPAD */
    val MXPAD = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Maxron MXULTRA */
    val MXULTRA = "spec:width=1200,height=2000,unit=px,dpi=280"

}
