package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Xbtabletsindia device specifications for Android Compose previews.
 *
 * This extension provides Xbtabletsindia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Xbtabletsindia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Xbtabletsindia get() = object {
    /** Xbtabletsindia XB-T11i */
    val XB_T11I = "spec:width=1200,height=2000,unit=px,dpi=240"

}
