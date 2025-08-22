package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ivoomi device specifications for Android Compose previews.
 *
 * This extension provides Ivoomi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ivoomi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ivoomi get() = object {
    /** Ivoomi i2 */
    val I2 = "spec:width=720,height=1440,unit=px,dpi=320"

}
