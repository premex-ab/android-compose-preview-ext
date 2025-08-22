package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Aldomobile device specifications for Android Compose previews.
 *
 * This extension provides Aldomobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Aldomobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Aldomobile get() = object {
    /** Aldomobile T10S */
    val T10S = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Aldomobile T7Q-4G */
    val T7Q_4G = "spec:width=600,height=1024,unit=px,dpi=213"

}
