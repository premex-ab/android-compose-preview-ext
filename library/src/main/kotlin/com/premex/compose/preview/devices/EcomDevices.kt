package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ecom device specifications for Android Compose previews.
 *
 * This extension provides Ecom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ecom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ecom get() = object {
    /** Ecom Ex-Handy 10 */
    val EX_HANDY_10 = "spec:width=320,height=432,unit=px,dpi=160"

    /** Ecom Smart-Ex02 */
    val SMART_EX02 = "spec:width=720,height=1280,unit=px,dpi=320"

}
