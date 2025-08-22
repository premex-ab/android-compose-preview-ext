package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Gevo device specifications for Android Compose previews.
 *
 * This extension provides Gevo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Gevo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Gevo get() = object {
    /** Gevo Gevo V20 */
    val GEVO_V20 = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Gevo V10 */
    val V10 = "spec:width=720,height=1600,unit=px,dpi=280"

}
