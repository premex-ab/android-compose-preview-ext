package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Lumus device specifications for Android Compose previews.
 *
 * This extension provides Lumus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Lumus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Lumus get() = object {
    /** Lumus INNOSR545 */
    val INNOSR545 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Lumus NEOSR620 */
    val NEOSR620 = "spec:width=720,height=1500,unit=px,dpi=320"

}
