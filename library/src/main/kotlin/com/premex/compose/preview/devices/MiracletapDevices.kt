package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Miracletap device specifications for Android Compose previews.
 *
 * This extension provides Miracletap device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Miracletap.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Miracletap get() = object {
    /** Miracletap miracle_tap_10 */
    val MIRACLE_TAP_10 = "spec:width=1200,height=1920,unit=px,dpi=213"

}
