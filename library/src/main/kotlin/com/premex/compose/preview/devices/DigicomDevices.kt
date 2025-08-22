package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Digicom device specifications for Android Compose previews.
 *
 * This extension provides Digicom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Digicom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Digicom get() = object {
    /** Digicom V7_LTE */
    val V7_LTE = "spec:width=600,height=1024,unit=px,dpi=213"

}
