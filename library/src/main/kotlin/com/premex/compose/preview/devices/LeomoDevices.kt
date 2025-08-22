package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Leomo device specifications for Android Compose previews.
 *
 * This extension provides Leomo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Leomo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Leomo get() = object {
    /** Leomo LEM-TS1　 */
    val LEM_TS1 = "spec:width=240,height=400,unit=px,dpi=120"

}
