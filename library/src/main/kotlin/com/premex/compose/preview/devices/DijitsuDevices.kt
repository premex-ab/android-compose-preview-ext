package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Dijitsu device specifications for Android Compose previews.
 *
 * This extension provides Dijitsu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Dijitsu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Dijitsu get() = object {
    /** Dijitsu DCT 90 */
    val DCT_90 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Dijitsu Smart A11s */
    val SMART_A11S = "spec:width=720,height=1600,unit=px,dpi=320"

}
