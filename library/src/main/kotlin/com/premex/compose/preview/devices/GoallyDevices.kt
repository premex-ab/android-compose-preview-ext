package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Goally device specifications for Android Compose previews.
 *
 * This extension provides Goally device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Goally.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Goally get() = object {
    /** Goally P3_8 */
    val P3_8 = "spec:width=800,height=1280,unit=px,dpi=213"

}
