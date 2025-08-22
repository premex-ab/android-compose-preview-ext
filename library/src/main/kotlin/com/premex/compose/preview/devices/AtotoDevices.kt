package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Atoto device specifications for Android Compose previews.
 *
 * This extension provides Atoto device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Atoto.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Atoto get() = object {
    /** Atoto X10 */
    val X10 = "spec:width=800,height=1280,unit=px,dpi=160"

}
