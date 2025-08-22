package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * I3technologies device specifications for Android Compose previews.
 *
 * This extension provides I3technologies device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.I3technologies.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.I3technologies get() = object {
    /** I3technologies i3TOUCH-X3 */
    val I3TOUCH_X3 = "spec:width=2160,height=3840,unit=px,dpi=480"

}
