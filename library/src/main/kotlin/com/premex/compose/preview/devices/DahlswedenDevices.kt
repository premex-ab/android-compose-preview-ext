package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Dahlsweden device specifications for Android Compose previews.
 *
 * This extension provides Dahlsweden device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Dahlsweden.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Dahlsweden get() = object {
    /** Dahlsweden People Plus */
    val PEOPLE_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

}
