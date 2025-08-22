package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bitainternational device specifications for Android Compose previews.
 *
 * This extension provides Bitainternational device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bitainternational.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bitainternational get() = object {
    /** Bitainternational MC66 */
    val MC66 = "spec:width=720,height=1440,unit=px,dpi=320"

}
