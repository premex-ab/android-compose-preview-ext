package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kandao device specifications for Android Compose previews.
 *
 * This extension provides Kandao device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kandao.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kandao get() = object {
    /** Kandao Kandao Meeting Ultra */
    val KANDAO_MEETING_ULTRA = "spec:width=1080,height=1920,unit=px,dpi=240"

}
