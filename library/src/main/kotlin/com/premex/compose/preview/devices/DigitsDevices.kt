package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Digits device specifications for Android Compose previews.
 *
 * This extension provides Digits device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Digits.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Digits get() = object {
    /** Digits T1 */
    val T1 = "spec:width=800,height=1280,unit=px,dpi=213"

}
