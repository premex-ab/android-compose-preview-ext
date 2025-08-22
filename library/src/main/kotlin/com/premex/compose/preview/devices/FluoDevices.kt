package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Fluo device specifications for Android Compose previews.
 *
 * This extension provides Fluo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Fluo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Fluo get() = object {
    /** Fluo N */
    val N = "spec:width=720,height=1498,unit=px,dpi=320"

    /** Fluo X2_Max */
    val X2_MAX = "spec:width=720,height=1500,unit=px,dpi=320"

}
