package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Realix device specifications for Android Compose previews.
 *
 * This extension provides Realix device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Realix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Realix get() = object {
    /** Realix RxIS201 */
    val RXIS201 = "spec:width=720,height=1480,unit=px,dpi=320"

    /** Realix RxIS202 */
    val RXIS202 = "spec:width=1080,height=2160,unit=px,dpi=480"

}
