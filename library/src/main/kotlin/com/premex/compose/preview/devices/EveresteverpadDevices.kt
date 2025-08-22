package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Everesteverpad device specifications for Android Compose previews.
 *
 * This extension provides Everesteverpad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Everesteverpad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Everesteverpad get() = object {
    /** Everesteverpad DC-1032 */
    val DC_1032 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Everesteverpad DC-8015 */
    val DC_8015 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Everesteverpad DC-M700 */
    val DC_M700 = "spec:width=600,height=1024,unit=px,dpi=160"

}
