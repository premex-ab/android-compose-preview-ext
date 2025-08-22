package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Btcmobile device specifications for Android Compose previews.
 *
 * This extension provides Btcmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Btcmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Btcmobile get() = object {
    /** Btcmobile S5548 */
    val S5548 = "spec:width=480,height=960,unit=px,dpi=160"

}
