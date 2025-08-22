package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Surface device specifications for Android Compose previews.
 *
 * This extension provides Surface device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Surface.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Surface get() = object {
    /** Surface Surface Duo */
    val SURFACE_DUO = "spec:width=1350,height=1800,unit=px,dpi=400"

    /** Surface Surface Duo 2 */
    val SURFACE_DUO_2 = "spec:width=1344,height=1892,unit=px,dpi=400"

}
