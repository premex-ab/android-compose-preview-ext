package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mmax device specifications for Android Compose previews.
 *
 * This extension provides Mmax device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mmax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mmax get() = object {
    /** Mmax mMax M55 */
    val MMAX_M55 = "spec:width=480,height=800,unit=px,dpi=240"

}
