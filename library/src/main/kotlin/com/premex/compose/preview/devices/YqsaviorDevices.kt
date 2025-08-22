package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Yqsavior device specifications for Android Compose previews.
 *
 * This extension provides Yqsavior device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Yqsavior.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Yqsavior get() = object {
    /** Yqsavior Q2K */
    val Q2K = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Yqsavior YQ10S */
    val YQ10S = "spec:width=800,height=1280,unit=px,dpi=213"

}
