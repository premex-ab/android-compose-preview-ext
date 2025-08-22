package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tiwell device specifications for Android Compose previews.
 *
 * This extension provides Tiwell device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tiwell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tiwell get() = object {
    /** Tiwell AP-115G */
    val AP_115G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Tiwell AS-502 */
    val AS_502 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Tiwell AS-503 */
    val AS_503 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Tiwell AS_601L */
    val AS_601L = "spec:width=720,height=1440,unit=px,dpi=320"

}
