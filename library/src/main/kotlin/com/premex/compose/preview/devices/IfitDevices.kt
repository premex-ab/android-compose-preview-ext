package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ifit device specifications for Android Compose previews.
 *
 * This extension provides Ifit device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ifit.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ifit get() = object {
    /** Ifit IFT1018 */
    val IFT1018 = "spec:width=800,height=1280,unit=px,dpi=160"

}
