package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Evota device specifications for Android Compose previews.
 *
 * This extension provides Evota device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Evota.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Evota get() = object {
    /** Evota EVOTA_EP */
    val EVOTA_EP = "spec:width=2160,height=3840,unit=px,dpi=480"

}
