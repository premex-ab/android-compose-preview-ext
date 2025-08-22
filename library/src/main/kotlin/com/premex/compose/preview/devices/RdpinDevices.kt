package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Rdpin device specifications for Android Compose previews.
 *
 * This extension provides Rdpin device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Rdpin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Rdpin get() = object {
    /** Rdpin TP802 */
    val TP802 = "spec:width=800,height=1280,unit=px,dpi=213"

}
