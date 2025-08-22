package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zaith device specifications for Android Compose previews.
 *
 * This extension provides Zaith device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zaith.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zaith get() = object {
    /** Zaith Z3211G */
    val Z3211G = "spec:width=800,height=1280,unit=px,dpi=160"

}
