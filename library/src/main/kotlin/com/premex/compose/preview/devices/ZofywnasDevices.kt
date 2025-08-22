package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zofywnas device specifications for Android Compose previews.
 *
 * This extension provides Zofywnas device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zofywnas.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zofywnas get() = object {
    /** Zofywnas D10 */
    val D10 = "spec:width=1080,height=1920,unit=px,dpi=160"

}
