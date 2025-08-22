package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Oysters device specifications for Android Compose previews.
 *
 * This extension provides Oysters device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Oysters.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Oysters get() = object {
    /** Oysters T72HMs 3G */
    val T72HMS_3G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Oysters Universal Phone 1 */
    val UNIVERSAL_PHONE_1 = "spec:width=720,height=1600,unit=px,dpi=320"

}
