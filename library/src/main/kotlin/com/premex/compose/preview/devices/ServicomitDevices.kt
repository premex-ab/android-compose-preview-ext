package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Servicomit device specifications for Android Compose previews.
 *
 * This extension provides Servicomit device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Servicomit.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Servicomit get() = object {
    /** Servicomit IT-1101S */
    val IT_1101S = "spec:width=800,height=1280,unit=px,dpi=160"

}
