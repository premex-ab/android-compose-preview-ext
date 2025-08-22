package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Smartbd device specifications for Android Compose previews.
 *
 * This extension provides Smartbd device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Smartbd.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Smartbd get() = object {
    /** Smartbd MQ703G */
    val MQ703G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Smartbd MQ703G_1 */
    val MQ703G_1 = "spec:width=600,height=1024,unit=px,dpi=160"

}
