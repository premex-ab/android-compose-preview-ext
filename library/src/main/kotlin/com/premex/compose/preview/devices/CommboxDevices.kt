package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Commbox device specifications for Android Compose previews.
 *
 * This extension provides Commbox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Commbox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Commbox get() = object {
    /** Commbox CommBox Classic S5 */
    val COMMBOX_CLASSIC_S5 = "spec:width=2160,height=3840,unit=px,dpi=480"

}
