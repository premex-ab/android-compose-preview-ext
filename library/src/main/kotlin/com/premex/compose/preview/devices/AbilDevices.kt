package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Abil device specifications for Android Compose previews.
 *
 * This extension provides Abil device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Abil.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Abil get() = object {
    /** Abil A8 */
    val A8 = "spec:width=1080,height=2400,unit=px,dpi=480"

}
