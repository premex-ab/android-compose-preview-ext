package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tntpanalo device specifications for Android Compose previews.
 *
 * This extension provides Tntpanalo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tntpanalo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tntpanalo get() = object {
    /** Tntpanalo TNT PANALO PHONE 5G */
    val TNT_PANALO_PHONE_5G = "spec:width=720,height=1600,unit=px,dpi=320"

}
