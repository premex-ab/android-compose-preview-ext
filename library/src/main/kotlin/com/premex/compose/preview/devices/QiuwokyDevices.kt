package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Qiuwoky device specifications for Android Compose previews.
 *
 * This extension provides Qiuwoky device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Qiuwoky.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Qiuwoky get() = object {
    /** Qiuwoky C10S */
    val C10S = "spec:width=800,height=1280,unit=px,dpi=160"

}
