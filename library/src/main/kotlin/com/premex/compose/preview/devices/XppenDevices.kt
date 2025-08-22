package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Xppen device specifications for Android Compose previews.
 *
 * This extension provides Xppen device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Xppen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Xppen get() = object {
    /** Xppen XPPen_Magic_Drawing_Pad */
    val XPPEN_MAGIC_DRAWING_PAD = "spec:width=1440,height=2160,unit=px,dpi=320"

}
