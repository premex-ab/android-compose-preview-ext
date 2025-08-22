package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bird device specifications for Android Compose previews.
 *
 * This extension provides Bird device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bird.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bird get() = object {
    /** Bird Energy */
    val ENERGY = "spec:width=720,height=1440,unit=px,dpi=320"

}
