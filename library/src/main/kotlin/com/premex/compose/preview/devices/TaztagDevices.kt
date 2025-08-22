package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Taztag device specifications for Android Compose previews.
 *
 * This extension provides Taztag device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Taztag.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Taztag get() = object {
    /** Taztag TazPad-FAP30 */
    val TAZPAD_FAP30 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Taztag Tazpad-FAP60 */
    val TAZPAD_FAP60 = "spec:width=1200,height=1920,unit=px,dpi=240"

}
