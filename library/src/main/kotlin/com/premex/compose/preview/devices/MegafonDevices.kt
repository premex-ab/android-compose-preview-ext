package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Megafon device specifications for Android Compose previews.
 *
 * This extension provides Megafon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Megafon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Megafon get() = object {
    /** Megafon MFLogin3T */
    val MFLOGIN3T = "spec:width=600,height=1024,unit=px,dpi=160"

}
