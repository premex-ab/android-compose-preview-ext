package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Helixinc device specifications for Android Compose previews.
 *
 * This extension provides Helixinc device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Helixinc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Helixinc get() = object {
    /** Helixinc C-TABLET */
    val C_TABLET = "spec:width=1200,height=1920,unit=px,dpi=320"

}
