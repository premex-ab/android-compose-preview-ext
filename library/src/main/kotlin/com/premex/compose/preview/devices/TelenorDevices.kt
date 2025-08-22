package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Telenor device specifications for Android Compose previews.
 *
 * This extension provides Telenor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Telenor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Telenor get() = object {
    /** Telenor Infinity a2 */
    val INFINITY_A2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Telenor Infinity e2 */
    val INFINITY_E2 = "spec:width=480,height=854,unit=px,dpi=240"

}
