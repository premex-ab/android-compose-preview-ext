package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hankookcrea device specifications for Android Compose previews.
 *
 * This extension provides Hankookcrea device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hankookcrea.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hankookcrea get() = object {
    /** Hankookcrea HANKOOK_CREA_IFPD */
    val HANKOOK_CREA_IFPD = "spec:width=2160,height=3840,unit=px,dpi=420"

}
