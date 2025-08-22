package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Converge device specifications for Android Compose previews.
 *
 * This extension provides Converge device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Converge.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Converge get() = object {
    /** Converge T7045PS */
    val T7045PS = "spec:width=600,height=1024,unit=px,dpi=160"

}
