package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vect device specifications for Android Compose previews.
 *
 * This extension provides Vect device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vect.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vect get() = object {
    /** Vect VECT-IFPD */
    val VECT_IFPD = "spec:width=2160,height=3840,unit=px,dpi=480"

}
