package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tgoargentina device specifications for Android Compose previews.
 *
 * This extension provides Tgoargentina device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tgoargentina.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tgoargentina get() = object {
    /** Tgoargentina TGO_TB850iH */
    val TGO_TB850IH = "spec:width=800,height=1280,unit=px,dpi=213"

}
