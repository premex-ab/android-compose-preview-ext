package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Junipersystems device specifications for Android Compose previews.
 *
 * This extension provides Junipersystems device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Junipersystems.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Junipersystems get() = object {
    /** Junipersystems Cedar CT8 */
    val CEDAR_CT8 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Junipersystems Mesa3 */
    val MESA3 = "spec:width=800,height=1280,unit=px,dpi=213"

}
