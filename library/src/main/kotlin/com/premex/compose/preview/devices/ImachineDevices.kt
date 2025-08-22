package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Imachine device specifications for Android Compose previews.
 *
 * This extension provides Imachine device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Imachine.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Imachine get() = object {
    /** Imachine iMachine i2 */
    val IMACHINE_I2 = "spec:width=720,height=1440,unit=px,dpi=320"

}
