package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mtc device specifications for Android Compose previews.
 *
 * This extension provides Mtc device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mtc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mtc get() = object {
    /** Mtc Osmartphona */
    val OSMARTPHONA = "spec:width=480,height=854,unit=px,dpi=213"

    /** Mtc Osmartphona Tablet */
    val OSMARTPHONA_TABLET = "spec:width=800,height=1280,unit=px,dpi=220"

}
