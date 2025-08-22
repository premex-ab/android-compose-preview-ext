package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Astrom device specifications for Android Compose previews.
 *
 * This extension provides Astrom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Astrom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Astrom get() = object {
    /** Astrom AST707G */
    val AST707G = "spec:width=600,height=1024,unit=px,dpi=213"

}
