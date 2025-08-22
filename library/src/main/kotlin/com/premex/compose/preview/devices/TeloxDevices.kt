package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Telox device specifications for Android Compose previews.
 *
 * This extension provides Telox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Telox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Telox get() = object {
    /** Telox TE620G */
    val TE620G = "spec:width=640,height=1136,unit=px,dpi=320"

}
