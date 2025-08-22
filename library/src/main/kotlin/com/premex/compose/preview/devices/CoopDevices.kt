package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Coop device specifications for Android Compose previews.
 *
 * This extension provides Coop device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Coop.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Coop get() = object {
    /** Coop MARTE */
    val MARTE = "spec:width=800,height=1280,unit=px,dpi=213"

}
