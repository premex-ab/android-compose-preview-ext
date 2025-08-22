package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tgco device specifications for Android Compose previews.
 *
 * This extension provides Tgco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tgco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tgco get() = object {
    /** Tgco TG-L800S */
    val TG_L800S = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Tgco TG-L900S */
    val TG_L900S = "spec:width=1440,height=2560,unit=px,dpi=560"

}
