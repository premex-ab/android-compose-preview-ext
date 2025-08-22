package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Yinoche device specifications for Android Compose previews.
 *
 * This extension provides Yinoche device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Yinoche.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Yinoche get() = object {
    /** Yinoche R8 */
    val R8 = "spec:width=600,height=1024,unit=px,dpi=160"

}
