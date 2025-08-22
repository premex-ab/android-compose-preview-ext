package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Wizz device specifications for Android Compose previews.
 *
 * This extension provides Wizz device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Wizz.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Wizz get() = object {
    /** Wizz DV-PTB1080 */
    val DV_PTB1080 = "spec:width=600,height=1024,unit=px,dpi=160"

}
