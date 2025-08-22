package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * _3rtablet device specifications for Android Compose previews.
 *
 * This extension provides _3rtablet device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices._3rtablet.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices._3rtablet get() = object {
    /** _3rtablet VT-7GE */
    val VT_7GE = "spec:width=800,height=1280,unit=px,dpi=240"

}
