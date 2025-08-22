package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Braillenote device specifications for Android Compose previews.
 *
 * This extension provides Braillenote device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Braillenote.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Braillenote get() = object {
    /** Braillenote gryphon */
    val GRYPHON = "spec:width=600,height=1024,unit=px,dpi=160"

}
